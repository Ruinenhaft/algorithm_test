package algorithm;

import java.util.Arrays;
import java.util.Scanner;
public class Number {

	
	public static int solution(int n) {
		int result = 0;
		// 각 자리수의 차이값이 일정한것을 확인
		//2) 각 자리수를 빼서 마지막까지 같은 값만큼 차이가 난다면 count ++
		if(n == 1000)
			n = 999;
		for(int j=100; j < n+1; j++)
		{
			int[] tmp_arr = new int[3];
			int k=0;
			int tmp_number = j;
			while (tmp_number > 0) {
				tmp_arr[k] = tmp_number % 10;
				tmp_number /= 10;
				k++;
			}
			if(tmp_arr[0] - tmp_arr[1] == tmp_arr[1] - tmp_arr[2])
				result++;
		}
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 어떤 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다.
		// 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
		// N이 주어졋을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하라.
		// 210 -> 105
		// 111(0),123(1), 135(2), 147(3), 159(4), x, 210(-1)
		// 1자리수, 두자리수는 모두 한수다.
		//1) 들어오는 숫자에 따라 99이하는 전부 한수로 카운트
		//2) 100이 넘어서면 각 자리수의 차이값이 일정한 숫자를 카운트.
		//3) 1000은 한수가 아니다.
		Scanner scanner = new Scanner(System.in);
		int result = 0;
		int n = scanner.nextInt();
		if(n < 100)
			result = n;
		else {
			result = solution(n) + 99;
		}
		System.out.println(result);	
		scanner.close();
	}

}
