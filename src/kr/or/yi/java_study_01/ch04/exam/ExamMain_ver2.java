package kr.or.yi.java_study_01.ch04.exam;

import java.util.Random;
import java.util.Scanner;

public class ExamMain_ver2 {

	public static void main(String[] args) {
		/*
		 * 1. �л� ������ �����ϴ� ���α׷��� �ۼ��ϼ���.
		 * 2. �л� Ŭ������ ����(��ȣ, ����, ����, ����, ����)
		 * 3. 15���� �л������� ���� �� �ִ� �迭
		 * 4. �޴��ۼ�(1. �л����, 2. �л��߰�, 3. �л� ����, 4. �л� ����, 5.�л� �˻�, 6. ����)
		 */
		Scanner sc = new Scanner(System.in);

		Student[] stdArr= new Student[15];
		initArr(stdArr);
		
		int res;
		do {
			System.out.println("1. �л����, 2.�л��߰�, 3.�л�����, 4.�л�����, 5.�л��˻�, 6.����");
			res = sc.nextInt();
			System.out.println(res);
			switch(res) {
			case 1: 
				prnStudentInfo(stdArr);
				break;
			case 2:
				addStudent(stdArr, sc);
				break;
			case 3:
				updateStudent(stdArr, sc);
				break;
			case 4:
				delStudent(stdArr, sc);
				break;
			case 5:
				searchStudent(stdArr, sc);
				break;
			}
		}while(res <6);
		System.out.println("�л����� ���α׷��� �����մϴ�.");
		
		sc.close();
	}

	private static void searchStudent(Student[] stdArr, Scanner sc) {
		System.out.println("�л� �˻� �����ϱ�");	
		Student findStd = new Student();
		
		System.out.print("�˻��� �л��� ��ȣ�� �Է��ϼ���. >> ");
		int stdNo = sc.nextInt();
		findStd.setStdNo(stdNo);
		int idx = indexOf(stdArr, findStd);
		if(idx == -1) {
			System.out.println("�ش��ϴ� �л��� �������� ����");
			return;
		}
					
		System.out.println(stdArr[idx]);
		
	}

	private static int indexOf(Student[] stdArr, Student findStd) {
		for(int i=0; i<stdArr.length; i++) {
			try {				
				if(stdArr[i].getStdNo() == findStd.getStdNo()) {
					return i;
				}
			}catch (NullPointerException e) {
				return -1;
			}
		}
		return -1;
	}

	private static void delStudent(Student[] stdArr, Scanner sc) {
		System.out.println("�л� ���� �����ϱ�");			
		int cnt = count(stdArr);
		System.out.println("����� ������ �л� ��ȣ�� �Է��ϼ���. >> ");
		int stdNo = sc.nextInt();
		
		Student findStd = new Student();
		findStd.setStdNo(stdNo);
		int idx = indexOf(stdArr, findStd);
		if(idx == -1) {
			System.out.println("�ش��ϴ� �л��� �������� ����");
			return;
		}

		for(int i=0; i<cnt; i++) {
			if(stdArr[i].getStdNo() == stdNo) {
				Student temp = stdArr[i];
				stdArr[i] = stdArr[i+1];
				stdArr[i+1] = temp;
			} 
			if(stdArr[i] != null) {
				stdArr[i].setStdNo(i+1);
			}
			stdArr[cnt] = null;
		}
		prnArr(stdArr);
		
	}

	private static void updateStudent(Student[] stdArr, Scanner sc) {
		System.out.println("�л� ���� �����ϱ�");	
		Student findStd = new Student();
		
		System.out.print("������ �л��� ��ȣ�� �Է��ϼ���. >>");
		int stdNo = sc.nextInt()-1;
		findStd.setStdNo(stdNo);
		int idx = indexOf(stdArr, findStd);
		if(idx == -1) {
			System.out.println("�ش��ϴ� �л��� �������� ����");
			return;
		}
			
		System.out.print("������ ������ ����, ����, ���� ������ �Է��ϼ���. >> ");
		int kor = sc.nextInt();
		int math = sc.nextInt();
		int eng = sc.nextInt();

		stdArr[stdNo].setKor(kor);
		stdArr[stdNo].setMath(math);
		stdArr[stdNo].setEng(eng);
		
		prnArr(stdArr);
	
	}

	private static void addStudent(Student[] stdArr, Scanner sc) {
		System.out.println("�л� �߰� �����ϱ�");	
		System.out.print("�л� �̸��� �Է��ϼ���. >> ");
		String stdName = sc.next();
		System.out.print("���� ������ �Է��ϼ���. >> ");
		int kor = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ���. >> ");
		int math = sc.nextInt();
		System.out.print("���������� �Է��ϼ���. >> ");
		int eng = sc.nextInt();
		
		// �� �迭�� ����
		int cnt = 0;
		for(Student std : stdArr) {
			if(std == null) {				
				cnt++;
			}
		}		
		
		// �迭 �������� �л� �߰�
		int idx = stdArr.length-cnt;
		try {
			stdArr[idx] = new Student(idx+1, stdName, kor, math, eng);
			prnArr(stdArr);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�޸𸮰� �����մϴ�.");
		}
	}

	// �л� ��
	private static int count(Student[] stdArr) {
		int cntIxd = 0;
		for(int i=0; i<stdArr.length; i++) {
			if(stdArr[i] != null) {
				cntIxd++;
			}
		}
		return cntIxd;
	}

	private static void prnStudentInfo(Student[] stdArr) {
		System.out.println("�л���� �����ϱ�");
		
		prnArr(stdArr);
	}

	// �л����
	private static void prnArr(Student[] stdArr) {
		for(Student std : stdArr) {
			if(std != null) {
				System.out.println(std);
			}
		}
		System.out.println();
	}
	
	// �л� ���� ����
	private static void initArr(Student[] arr) {
		Random rnd = new Random();
		
		String[] names = {"�Ǽ���", "���Ƹ�", "������", "Ȳ�¿�", "������", "�����", "�̵���", "Ȳ�ϳ�", "������", "�̻��", "���μ�"};
		
		for(int i=0; i<arr.length; i++) {
			try {				
				arr[i] = new Student(i+1, names[i], rnd.nextInt(60)+41, rnd.nextInt(60)+41, rnd.nextInt(60)+41);
			}catch(ArrayIndexOutOfBoundsException e) {
				arr[i] = null;
			}
		}
	}

}
