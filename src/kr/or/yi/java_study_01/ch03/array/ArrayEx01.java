package kr.or.yi.java_study_01.ch03.array;

public class ArrayEx01 {

	public static void main(String[] args) {
//		array01();
//		array02();
		
		char [] chArr = new char[26];
		char ch = 'a';
		for(int i=0; i<chArr.length; i++) {
//			System.out.printf("%c ", chArr[i]);
			chArr[i] = ch++;
		}
		System.out.println();
		for(int i=0; i<chArr.length; i++) {
			System.out.printf("%c ", chArr[i]);
//			System.out.printf("%d ", (int)chArr[i]);
		}
		
	}

	private static void array02() {
		//선언과 동시에 초기화
		int[] intArray = {5, 4, 3, 2, 1};
		for(int i=0; i<intArray.length; i++) {
			System.out.printf("%d ", intArray[i]);
		}
		
		intArray[2] = 10;
		
		System.out.println();
		
		int[] myArray = intArray;
		for(int i=0; i<myArray.length; i++) {
			System.out.printf("%d ", myArray[i]);
		}
	}

	private static void array01() {
		int[] intArray01 = null; // 정수형 배열 선언 
		System.out.println(intArray01);
		
		intArray01 = new int[5];
		System.out.println(intArray01[0]);
		System.out.println(intArray01[1]);
		System.out.println(intArray01[2]);
		System.out.println(intArray01[3]);
		System.out.println(intArray01[4]);
		
		System.out.println("배열의 크기 " + intArray01.length);
		
		for(int i=0; i<intArray01.length; i++) {
			System.out.printf("%d ", intArray01[i]);
		}
	}

}
