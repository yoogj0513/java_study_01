package kr.or.yi.java_study_01.ch04.exam;

import java.util.Random;
import java.util.Scanner;

public class ExamMain_ver1 {

	public static void main(String[] args) {
		/*
		 * 1. 학생 정보를 관리하는 프로그램을 작성하세요.
		 * 2. 학생 클래스의 정의(번호, 성명, 국어, 영어, 수학)
		 * 3. 15명의 학생정보를 담을 수 있는 배열
		 * 4. 메뉴작성(1. 학생목록, 2. 학생추가, 3. 학생 수정, 4. 학생 삭제, 5.학생 검색, 6. 종료)
		 */
		Scanner sc = new Scanner(System.in);

		Student[] stdArr= new Student[15];
		initArr(stdArr);
		
		int res;
		do {
			System.out.println("1. 학생목록, 2.학생추가, 3.학생수정, 4.학생삭제, 5.학생검색, 6.종료");
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
		System.out.println("학생관리 프로그램을 종료합니다.");
		
		sc.close();
	}

	private static void searchStudent(Student[] stdArr, Scanner sc) {
		System.out.println("학생 검색 구현하기");	
		Student findStd = new Student();
		
		System.out.print("검색할 학생의 번호를 입력하세요. >> ");
		int stdNo = sc.nextInt();
		findStd.setStdNo(stdNo);
		int idx = indexOf(stdArr, findStd);
		if(idx != -1) {			
			System.out.println(stdArr[idx]);
		} else if(idx == -1) {
			System.out.println("해당하는 학생이 존재하지 않음");
		}
		
		
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
		System.out.println("학생 삭제 구현하기");	
		
		System.out.println("기록을 삭제할 학생 번호를 입력하세요. >> ");
		int stdNo = sc.nextInt();
		Student findStd = new Student();
		findStd.setStdNo(stdNo);
		int idx = indexOf(stdArr, findStd);
		if(idx != -1) {
			stdArr[idx] = null;
			for(int i=0; i<stdArr.length-1; i++) {
				if(stdArr[i] == null) {
					Student temp = stdArr[i];
					stdArr[i] = stdArr[i+1];
					stdArr[i+1] = temp;
				}
			}
			prnArr(stdArr);
		} else if(idx == -1) {
			System.out.println("해당하는 학생이 존재하지 않음");
		}
		
	}

	private static void updateStudent(Student[] stdArr, Scanner sc) {
		System.out.println("학생 수정 구현하기");	
		Student findStd = new Student();
		
		System.out.print("수정할 학생의 번호를 입력하세요. >>");
		int stdNo = sc.nextInt()-1;
		findStd.setStdNo(stdNo);
		int idx = indexOf(stdArr, findStd);
		if(idx != -1) {			
			System.out.print("수정할 점수를 국어, 수학, 영어 순으로 입력하세요. >> ");
			int kor = sc.nextInt();
			int math = sc.nextInt();
			int eng = sc.nextInt();

			stdArr[stdNo].setKor(kor);
			stdArr[stdNo].setMath(math);
			stdArr[stdNo].setEng(eng);
			
			prnArr(stdArr);
		} else if(idx == -1) {
			System.out.println("해당하는 학생이 존재하지 않음");
		}
		
		prnArr(stdArr);
	}

	private static void addStudent(Student[] stdArr, Scanner sc) {
		System.out.println("학생 추가 구현하기");	
		int cntIxd = count(stdArr);
		
		System.out.print("학생 번호를 입력하세요. >>");
		int stdNo = sc.nextInt();
		for(int i=0; i<cntIxd; i++) {
			if(stdNo == stdArr[i].getStdNo()) {				
				System.out.println("이미 존재하는 학생 번호입니다. 다른 번호를 입력해주세요. >> ");
				i = -1;
				stdNo = sc.nextInt();
				continue;
			}
		}
		System.out.print("학생 이름을 입력하세요. >> ");
		String stdName = sc.next();
		System.out.print("국어 점수를 입력하세요. >> ");
		int kor = sc.nextInt();
		System.out.print("수학 점수를 입력하세요. >> ");
		int math = sc.nextInt();
		System.out.print("영어점수를 입력하세요. >> ");
		int eng = sc.nextInt();
		
		int cnt = 0;
		for(Student std : stdArr) {
			if(std == null) {				
				cnt++;
			}
		}		

		int idx = stdArr.length-(cnt+1);
		
		stdArr[++idx] = new Student(stdNo, stdName, kor, math, eng);
		
		for(int i=0; i<cntIxd; i++) {
			if(stdArr[i].getStdNo() > stdArr[idx].getStdNo()) { 
				Student temp = stdArr[idx]; 
				stdArr[idx] = stdArr[i];
				stdArr[i] = temp;
			}
		}
		
		prnArr(stdArr);
	}

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
		System.out.println("학생목록 구현하기");
		
		prnArr(stdArr);
	}

	private static void prnArr(Student[] stdArr) {
		for(Student std : stdArr) {
			if(std != null) {
				System.out.println(std);
			}
		}
		System.out.println();
	}
	
	private static void initArr(Student[] arr) {
		Random rnd = new Random();
		
		String[] names = {"권수진", "정아름", "장현서", "황태원", "배진우", "현재승", "이동주", "황하나", "유경진", "이상원", "박인선"};
		
		for(int i=0; i<arr.length; i++) {
			try {				
				arr[i] = new Student(i+1, names[i], rnd.nextInt(60)+41, rnd.nextInt(60)+41, rnd.nextInt(60)+41);
			}catch(ArrayIndexOutOfBoundsException e) {
				arr[i] = null;
			}
		}
	}

}
