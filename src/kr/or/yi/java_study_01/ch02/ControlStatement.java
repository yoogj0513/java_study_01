package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class ControlStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		multipletree(sc);
//		ternaryTree(sc);
//		grade(sc);
//		nestedIf(sc);
		
//		nestedIfTeacher(sc);
		
		
		
		sc.close();
	}

	private static void nestedIfTeacher(Scanner sc) {
		/* 
		 * 점수와 학년을 입력 받아 60점이상이면 , 미만이면 불합격을 출력한다.
		 * 4학년의 경우 70점 이상이어야 합격이다.
		 */
		/*
		1. 점수와 학년을 입력받기
		2. 점수가 60점 이상이면 합격
		3. 점수가 60점 미만이면 불합격
		4. 4학년일 경우 70점이상이면 합격
		*/
		
		System.out.printf("점수를 입력(0~100)\n학년을 입력하세요(1~4) 예) 90 3 >>");
		int jumsu = sc.nextInt();
		int year = sc.nextInt();
//		System.out.println(jumsu + " : " + year);
		if(jumsu >= 60) {
			if(year == 4) {	// 4학년일 경우
				if(jumsu >= 70) {
					System.out.println("합격");
				}else {
					System.out.println("불합격");
				}
			}else {			// 그외 학년인 경우
				System.out.println("합격");
			}
		}else {
			System.out.println("불합격");
		}
	}

	private static void nestedIf(Scanner sc) {
		// 90 4(합격), 60 4(불합격), 60 3(합격), 50 3(불합격)
		System.out.print("점수를 입력하세요(0~100) : ");
		int score = sc.nextInt();
		System.out.print("학년을 입력하세요(1~4) : ");
		int year = sc.nextInt();
		
		if(score >= 60) {						// 60점 이상
			if(year != 4) {
				System.out.println("합격!");		// 4학년이 아니면 합격
			} else if(score >= 70) {
				System.out.println("합격!");		// 4학년이 70점 이상이면 합격
			} else {
				System.out.println("불합격!");	// 60점 미만 불합격
			}
		} else {
			System.out.println("불합격!");
		}
	}

	private static void grade(Scanner sc) {
		char grade;
		
		System.out.print("점수를 입력하세요(0~100) : ");
		int score = sc.nextInt();
		
		if(score >= 90) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';
		} else if(score >= 70) {
			grade = 'C';
		} else if(score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.printf("학점은 %c입니다.%n", grade);
	}

	private static void ternaryTree(Scanner sc) {
		// 3항 연산자를 이용하여 multipletree()와 같은 결과가 출력되도록 하세요.
		System.out.print("수를 입력하시오: ");
		int number = sc.nextInt();
		
//		String res = number % 3 == 0 ? "입니다.":"가 아닙니다.";
//		System.out.println("3의 배수" + res);
//		System.out.printf("%s", number % 3 == 0 ? "3의 배수입니다.":"3의 배수가 아닙니다.");
		System.out.printf("3의 배수%s", number % 3 == 0 ? "입니다.":"가 아닙니다.");
	}

	private static void multipletree(Scanner sc) {
		System.out.print("수를 입력하시요: ");
		int number = sc.nextInt();
		
		if (number % 3 == 0) {
			System.out.println("3의 배수입니다.");
		}else {
			System.out.println("3의 배수가 아닙니다.");
		}
	}

}
