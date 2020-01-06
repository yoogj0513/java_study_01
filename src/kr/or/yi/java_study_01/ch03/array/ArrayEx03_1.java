package kr.or.yi.java_study_01.ch03.array;

import java.util.Scanner;

public class ArrayEx03_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] intArray = new int[5];
		int sum = 0;
		
		System.out.print(intArray.length + "개의 정수를 입력하세요>> ");
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = sc.nextInt();
		}
		for(int i=0; i<intArray.length; i++) {
			sum = sum + intArray[i];
		}
		
		System.out.print("평균은 " + (double)sum/intArray.length);
		
		sc.close();
	}

}
