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
		int idx = indexOf(stdArr, findStd); // �л���ȣ�� 3���� �л��� ��ġ
		//2�� ����
		System.out.println(stdArr[idx]);
		
		findStd.setStdNo(15);
		idx = indexOf(stdArr, findStd); // �������� �ʴ� �л��̹Ƿ� -1
		
		if(idx == -1) {
			System.out.println("�ش��л��� �������� ����");
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
		
		String[] names = {"�Ǽ���", "���Ƹ�", "������", "Ȳ�¿�", "������", "�����", "�̵���", "Ȳ�ϳ�", "������", "�̻��", "���μ�"};
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = new Student(i+1, names[i], rnd.nextInt(60)+41, rnd.nextInt(60)+41, rnd.nextInt(60)+41);
		}
		
	}

}
