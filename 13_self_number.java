package algorithm;

import java.util.Arrays;
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// self number
		// 양의 정수 n에 대해서 d(n)은 n과 n의 각 자리수를 더하는 함수.
		// ex) d(75) = 75 + 7 + 5 = 87
		// n을 d(n)의 생성자
		// 생성자가 없는 숫자를 셀프넘버라고 부른다.
		final int SIZE = 10001;
		Boolean[] all_number = new Boolean[SIZE];
		Arrays.fill(all_number, true);//초기값 false
		
		for(int i=1;i<SIZE;i++)
		{
			int idx = self_number(i);
			
			if(idx <= SIZE-1) 
				all_number[idx] = false;
		}
		for(int i=1;i<SIZE;i++)
		{
			if(all_number[i] == true)
				System.out.println(i);
		}
		
	}
	
	public static int self_number(int n) {
		//self_number 찾기 시행
		int self_number_sum = n;
		while(true) {
			if(n == 0) break;
			self_number_sum += n%10;
			n = n/10;
		}
		return self_number_sum;
	}

}
