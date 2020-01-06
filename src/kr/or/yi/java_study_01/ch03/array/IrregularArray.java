package kr.or.yi.java_study_01.ch03.array;

import java.util.Arrays;

public class IrregularArray {

	public static void main(String[] args) {
		int[][] intArray = new int[4][];	// 각 행의 레퍼런스 배열 생성
		
		create_array(intArray);
		init_array(intArray);
		prn_array(intArray);
	}

	private static void prn_array(int[][] intArray) {
		for(int i=0; i<intArray.length;i++) {
			for(int j=0; j<intArray[i].length; j++) {
				System.out.print(intArray[i][j] + " ");
			}
			System.out.println(); // 다음 줄로 넘어가기
		}
	}

	private static void init_array(int[][] intArray) {
		for(int i=0; i<intArray.length; i++) { // 행에 대한 반복
			for(int j=0; j<intArray[i].length; j++) { // 열에 대한 반복
				intArray[i][j] = (i+1) * 10 + j;
			}
		}
	}

	private static void create_array(int[][] intArray) {
		System.out.println(Arrays.deepToString(intArray));
		
		intArray[0] = new int[3];			// 첫째 행의 정수 3개의 배열 생성
		System.out.println(Arrays.deepToString(intArray));
		
		intArray[1] = new int[2];			// 둘째 행의 정수 2개의 배열 생성
		System.out.println(Arrays.deepToString(intArray));
		
		intArray[2] = new int[3];			// 셋째 행의 정수 3개의 배열 생성
		System.out.println(Arrays.deepToString(intArray));
		
		intArray[3] = new int[2];			// 넷째 행의 정수 2개의 배열 생성
		System.out.println(Arrays.deepToString(intArray));
	}

}
