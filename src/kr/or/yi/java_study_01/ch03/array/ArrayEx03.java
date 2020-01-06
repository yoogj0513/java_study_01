package kr.or.yi.java_study_01.ch03.array;

public class ArrayEx03 {

	public static void main(String[] args) {
		int[] intArr = {5, 4, 3, 2, 1};
		prnArray(intArr); 	// 5, 4, 3, 2, 1
		
		// 버블소트 정렬
		sort(intArr);		//정렬수행
		
//		중첩loop 사용
		prnArray(intArr); 	// 1, 2, 3, 4, 5
		
	}

	private static void sort(int[] arr) {
		for(int j=0; j<arr.length-1; j++) {			
			for(int i=0; i<arr.length-1; i++) {
				int temp = arr[i+1];
				if(temp < arr[i]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
	}

	private static void prnArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
	}

}
