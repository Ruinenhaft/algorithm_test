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
		int result = 0, five = 0, three = 0;
		int n = scanner.nextInt();
		if (n < 10)
			if (n % 3 == 0) {
				three = n / 3;
			}
		for (int i = n / 5; i > 0; i--) {// n = 18; 몫 3, 2, 1
			if (n % 5 == 0) {// 몫 3일때
				five = i;
				break;
			} else {// 18 = i = 3,
					// n을 5로 나누고 남은 나머지 값을 3으로 나눠서
				if ((n % 5) % 3 == 0) {// 나누어 떨어지면
					five = i;
					three = (n % 5) / 3;// 3kg 포대의 개수는 18/5 ...3/3 = 1;
					break;
				} else {
					if ((n - (i * 5)) % 3 == 0) {
						five = i;
						three = (n - (i * 5)) / 3;
						break;
					}
				}
			}
		}
		if (five == 0 && three == 0)
			result = -1;
		else
			result = five + three;
		System.out.println(result);
	}

}