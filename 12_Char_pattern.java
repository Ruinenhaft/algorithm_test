package algorithm;
import java.util.Scanner;
import java.util.Arrays;

public class Char_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열 S입력받은 후에
		// 각문자를 R번 반복해
		// 새 문자열 P를 만든 후 출력하는 프로그램
		Scanner scanner = new Scanner(System.in);
		int test_case = scanner.nextInt();
		int r = 0;
		String s;
		String[] sArray;

		
		while(test_case --> 0) {
			r = scanner.nextInt();
			s = scanner.next();
			sArray = new String[s.length()];
			sArray = s.split("");
			for(int i=0; i<s.length(); i++) {
				for(int j=0; j<r; j++) {
					System.out.print(sArray[i]);
				}
			}
			System.out.println();
		}
		
	}

}
