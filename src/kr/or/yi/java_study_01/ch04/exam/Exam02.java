package kr.or.yi.java_study_01.ch04.exam;

import java.util.Arrays;
import java.util.Random;

public class Exam02 {

	public static void main(String[] args) {
		Student[] stdArr = new Student[11];
		System.out.println(Arrays.toString(stdArr));
		initArr(stdArr);
		System.out.println(Arrays.toString(stdArr));
		
		Student findStd = new Student();
		findStd.setStdNo(3);
		int idx = indexOf(stdArr, findStd); // 학생번호가 3번인 학생의 위치
		//2가 예상
		System.out.println(stdArr[idx]);
		
		findStd.setStdNo(15);
		idx = indexOf(stdArr, findStd); // 존재하지 않는 학생이므로 -1
		
		if(idx == -1) {
			System.out.println("해당학생이 존재하지 않음");
		}
	}

	private static int indexOf(Student[] stdArr, Student findStd) {
		for(int i=0; i<stdArr.length; i++) {
			if(stdArr[i].getStdNo() == findStd.getStdNo()) {
				return i;
			} 
		}
		return -1;
	}

	private static void initArr(Student[] arr) {
		Random rnd = new Random();
		
		String[] names = {"권수진", "정아름", "장현서", "황태원", "배진우", "현재승", "이동주", "황하나", "유경진", "이상원", "박인선"};
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = new Student(i+1, names[i], rnd.nextInt(60)+41, rnd.nextInt(60)+41, rnd.nextInt(60)+41);
		}
		
	}

}
