package algorithm;

import java.util.Scanner;
public class sugar_delivery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// N킬로그램 배달해야한다.
		// 종류는 3Kg, 5Kg 두종류가 있다.
		// 가장 적은 조합으로 들고 가려고 한다.
		// 정확히 Nkg 들고가려할때 몇봉지를 들고가면 되는지.
		// 정확하게 나눠지지 않는다면 -1 출력.
		
		//1) 5로 나눠서 나온 값 * 5 ... 나머지값.
		//1-1) 나머지값 / 3
		//2) 5로 나눠서 나온 값-1 * 5 ... 나머지값+5
		//2-1) 나머지값 / 3
		// 3) ex) 101 = 5 * 20 + 1
		Scanner scanner = new Scanner(System.in);
		int result = 0, five = 0, three = 0, flag = 0;
		int n = scanner.nextInt();
		
		if(n == 4 || n == 7) 
			System.out.println(-1);
		else if(n % 5 == 0)
			System.out.println(n/5);
		else if(n%5 == 1 || n%5 == 3)
			System.out.println((n/5)+1);
		else if(n%5 == 2 || n%5 == 4)
			System.out.println((n/5)+2);
			
		
	}

}