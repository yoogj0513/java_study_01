package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class IfElseSwitchEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		gradeSwitch(sc);
		coffeePrice(sc);
		
		sc.close();
	}

	private static void coffeePrice(Scanner sc) {
		System.out.print("무슨 커피를 드릴까요? ");
		String order = sc.next();
		int price = 0;
		switch(order) {
			case "에스프레소":
			case "카푸치노":
			case "카페라떼":
				price = 3500;
				break;
			case "아메리카노":
				price = 2000;
				break;
			default:
				System.out.println("메뉴가 없습니다.");
		}
		if(price != 0) {
			System.out.printf("%s는 %d원입니다.", order, price);
		}
	}

	private static void gradeSwitch(Scanner sc) {
		char grade;
		System.out.print("점수를 입력하세요(0 ~ 100): ");
		int score = sc.nextInt();
		switch (score / 10) {
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
		}
		
		System.out.printf("학점은 %c 입니다.%n", grade);
	}

}
