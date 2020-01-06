package kr.or.yi.java_study_01.ch03.array;

import java.util.Scanner;

public class ArrayEx01_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] intArray = new int[5];			// 배열 생성
		int max = Integer.MIN_VALUE;			// 가장 작은 수
		int min = Integer.MAX_VALUE;			// 가장 큰 수
		System.out.printf("정수형(int) 범위 %d ~ %d %n", Integer.MIN_VALUE, Integer.MAX_VALUE);
		
		System.out.print("양수 5개를 입력하세요. >> ");
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = sc.nextInt();			// 입력받은 정수를 배열에 저장
			if(intArray[i] > max) {				// intArray[i]가 가장 작은 수보다 크면
				max = intArray[i];				// intArray[i]를 max로 변경
			}
			if(intArray[i] < min) {
				min = intArray[i];
			}
		}
		System.out.printf("가장 큰 수는 %d 입니다.%n", max);
		System.out.printf("가장 작은 수는 %d 입니다.%n", min);
		
		System.out.println("찾고자하는 정수값을 입력하세요 >> ");
		int searchKey = sc.nextInt();
		int res = -1;
		// intArray에 searchKey가 존재하면 "위치하고 있는 인덱스를 출력하고 찾지 못하면 -1을 출력하도록 작성하시오.
		for(int i=0; i<intArray.length; i++) {
			if(intArray[i] == searchKey) {
				res = i;
				break;
			} 
		}
		System.out.printf("searchKey %d는 %d위치에 있습니다.", searchKey, res);
		
		sc.close();
	}
}
