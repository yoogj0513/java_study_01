package kr.or.yi.java_study_01.ch03;

import java.util.Arrays;
import java.util.Random;

public class ForEachEx {

	public static void main(String[] args) {
		Random rnd = new Random(1234567);
		int[] intArr = new int[5];
		System.out.println(Arrays.toString(intArr));
		initArray(rnd, intArr);
		System.out.println(Arrays.toString(intArr));
		
		for(int i=0; i<intArr.length; i++) {
			System.out.printf("[%d] ", intArr[i]);
		}
		
		System.out.println();
		
		for(int e : intArr) {
			System.out.printf("[%d] ", e);
		}
		
		System.out.println();
		
		String[] strArr = {"권수진", "정아름", "황태원", "장현서", "현재승", "배진우", "박인선", "이상원", "유경진", "권태헌", "황하나", "이동주"};
		for(String name:strArr) {
			System.out.println(name);
		}
		
		System.out.println();
		
		// 열거형
		for(Week w : Week.values()) {
			System.out.println(w.ordinal() + " " + w);
		}
		
	}

	private static void initArray(Random rnd, int[] intArr) {
		for(int i=0; i<intArr.length; i++) {
			intArr[i] = rnd.nextInt(50);
		}
		
	}

}
