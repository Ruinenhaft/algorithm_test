package algorithm;

public class sample_test {

	static int return_Search(int intArray[], int value, int min_index, int max_index) {
		int middle_index=0;

		if(min_index <= max_index) {
			middle_index = (min_index+max_index)/2;
			if(intArray[max_index-1] == intArray[middle_index]) {
				if(intArray[max_index]-value > value - intArray[middle_index])
					return middle_index;
				else
					return max_index;
			}
			if(intArray[middle_index-1] == intArray[min_index]) {
				if(intArray[middle_index]-value > value - intArray[min_index])
					return middle_index;
				else
					return min_index;
			}
			if(value==intArray[middle_index]) {
				return middle_index;
			}else if(value < intArray[middle_index]) {
				return return_Search(intArray, value, min_index, middle_index-1);
			}else {

				return return_Search(intArray, value, middle_index+1, max_index);
			}
		}
		return -1;
	}
	
	static int[] sort_Array(int intArray_sort[]) {
		for(int i=0; i < intArray_sort.length ; i++) {
			for(int j=i+1; j < intArray_sort.length ; j++) {
				if(intArray_sort[i] > intArray_sort[j]) {
					int tmp = intArray_sort[i];
					intArray_sort[j] = intArray_sort[i];
					intArray_sort[i] = tmp;
				}
			}
		}
		
		return intArray_sort;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 10개 int
		// 정렬된 정수가 0~100사이의 값 {2, 10, 21, 27, 31, 45, 67}
		// 검색하고자 하는 값을 입력하세요.
		// 가장 가까운 값이 출력, 인덱스도 함께
		// 중간값 위치에서 값을 비교해서
		// 크면 중간값부터 마지막값을 비교
		int result_index = 0;
		int value=5;
		int intArray[] = {2, 10, 21, 27, 31, 45, 67};
		int intArray_sort[] = {10, 2, 21, 31, 28, 67, 45};
		int min_index = 0;
		int max_index = intArray.length-1;
		
		result_index = return_Search(intArray, value, min_index, max_index);
		System.out.println("index : "+ result_index + "  value : "+ intArray[result_index]);
		
		intArray_sort = sort_Array(intArray_sort);
		for(int i = 0; i < intArray_sort.length; i++)
			System.out.print(intArray_sort[i] + " ");
		
	}

}
