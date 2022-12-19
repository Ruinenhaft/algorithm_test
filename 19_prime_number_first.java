package algorithm;

import java.util.Scanner;

public class prime_number {

	private static int Is_Prime(int num) {
		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				count += 1;
			if (count >= 3)
				return count;
		}

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int[] prime_number = new int[6000];

		for (int i = 2; i <= number; i++) {
			int result = Is_Prime(i);
			if (result == 2)
				prime_number[i - 2] = i;
			else
				continue;
		}

		int tmp_number = number;
		int i = 0;
		while (true) {
			if (prime_number[i] != 0) {
				if (tmp_number % prime_number[i] == 0) {// tmp_number = 15, prime_number = 3
					tmp_number = tmp_number / prime_number[i];// tmp_number = 5
					System.out.println(prime_number[i]);// "2","2","3"
				} else {
					i++;
					if (tmp_number != 1 && prime_number[i] !=0 && prime_number[i] % tmp_number == 0) {
						System.out.println(tmp_number);
						break;
					} else if (tmp_number == 1)
						break;
				}

			}else
				continue;

		}
	}

}
