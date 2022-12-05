package algorithm;
import java.util.Scanner;

public class number_size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// n개의 숫자 입력되면, 다음과 같이 크기를 비교 한 후 양식에 맞춰 출력
		// ex) 1 : 2 3 2 1
		//        < < < =
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("input count number");
		int n = scanner.nextInt();
		int[] intArray = new int[n];
		for(int i=0; i < n; i++) {
			intArray[i] = scanner.nextInt();
		}
		
		//입력부 끝.
		//출력부 시작.
		// 한번 읽은 값은 0번위치로 교환해가며 1,2,3,4 값과 계속 비교
		System.out.println("< result output >");
		for(int i=0; i < n; i++) {
			System.out.print(intArray[i] + ": ");
			if(i > 0) {
				int tmp = intArray[0];
				intArray[0] = intArray[i];
				intArray[i] = tmp;
			}
			for(int j=1; j < n; j++) {
				
				if(intArray[0] > intArray[j])
					System.out.print("> ");
				else if(intArray[0] == intArray[j])
					System.out.print("= ");
				else
					System.out.print("< ");
				
				
				//

				
				
			}
			
			System.out.println();
		}
		
	}

}
