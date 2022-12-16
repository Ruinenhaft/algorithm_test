package algorithm;

import java.util.Scanner;
import java.util.Arrays;

public class Group_word_checker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 그룹단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우를 말한다.
		// 1) 단어 개수 입력
		// 2) 입력받은 횟수만큼 단어 받기
		// 3) 입력받은 단어별 배열을 확인
		// 3-1) 순차적으로 확인하면서 다른문자로 진행되는지 확인
		// 3-2) 같은 문자가 연속되는지 확인
		// 3-3) 위의 두가지 사항을 만족하면서 다시 같은 문자가 들어오는지 확인.
		Scanner sc = new Scanner(System.in);
		int input_number = sc.nextInt();// 단어 개수 입력
		String[] input = new String[input_number];// 각각 단어의 배열
		String[] alphabet = new String[26];
		//Arrays.fill(alphabet, '0');
		
		int count = 0;
		int result = 0;

		while (count < input_number) {// 입력할 단어 개수만큼 반복
			input[count] = sc.next();// 단어를 input배열 0번부터 채움
			count++;
		}

		
		for (int i = 0; i < input.length; i++) {// 0번에 채운 단어를 가지고 반복문 시행
			int flag = 0;
			int alphabet_count = 0;
			String[] input_arr = input[i].split("");
			String tmp = null;
			for(int j = 0; j < input_arr.length; j++) {
				if (j == 0) {// 0번에 채운 단어의 0번째 알파벳에서는
					tmp = input_arr[j];// 0번알파벳 기준점 잡고
					alphabet[alphabet_count] = tmp;// 해당 알파벳을 alphabet이라는 배열에 추가해주고 다음 1번 주소로 넘김.
					alphabet_count++;
				} else {// 0번에 채운 단어의 1번째 알파벳 부터는
					if (!input_arr[j].equals(tmp)) {// 해당 알파벳이 이전 배열의 알파벳과 다른지 확인하고
						for (int k = 0; k < alphabet_count; k++) {// 기존에 한번이라도 들어왔던 값인지 확인.
							if (alphabet[k].equals(input_arr[j])) {// 한번이라도 들어왔던 값이면 다음 단어로 이동.
								flag++;
							}
						}
						tmp = input_arr[j];// 다르다면 기준점 바꿈.
						// 없는 녀석이 들어오면 alphabet리스트에 추가해주고 다시 돌아.
						alphabet[alphabet_count] = tmp;
						alphabet_count++;
					}
				}
			}
			if(flag == 0)
				result++;
		}

		System.out.println(result);
	}

}
