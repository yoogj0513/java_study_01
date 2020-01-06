package kr.or.yi.java_study_01.ch03.array;

import java.util.Arrays;
import java.util.Random;

public class Exam10 {

	public static void main(String[] args) {
		int[][] intArray = new int [4][4];
		prnArray(intArray);
		Random rnd = new Random(1234567);
		int row;
		int col;
		int count = 0;
		
		
		for(int i = 0; count<10; i++) {
			row = rnd.nextInt(4);
			col = rnd.nextInt(4);
			if(intArray[row][col] != 0) { // 이미 해당 위치에 값이 할당
				continue;
			} else {
				intArray[row][col] = rnd.nextInt(10)+1;
				count++;
			}
		}
		System.out.println("count = " + count);
		prnArray(intArray);
		
		/*
		 *	1~10까지의 정수 10개만 랜덤하게 임의의 위치(0~15)에 삽입 
		 */
	}

	private static void prnArray(int[][] intArray) {
		for(int[]arr : intArray) {
			System.out.println(Arrays.toString(arr));
		}
	}

}
