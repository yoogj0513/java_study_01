package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class ArithemticOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		getHourMinteSecond(sc);
//		getPayCount(sc);
		sc.close();
		
		// alt + shift + M : 메소드(함수) 자동 완성
		postfix();
		prefix();

	}

	private static void prefix() {
		int a = 10;
		int b = ++a; //전위증감
		System.out.printf("a = %d b = %d %n", a, b);
	}

	private static void postfix() {
		int a = 10;
		int b = a++; // 후의증감 
		System.out.printf("a = %d b = %d %n", a, b);
	}

	private static void getPayCount(Scanner sc) {
		System.out.print("금액을 입력하세요.");
		int pay = sc.nextInt(); //97,870원
		// 오만원 1장, 만원 4장, 오천원 1장, 천원 2장, 오백원 1개, 백원 3개, 오십원 1개, 십원 2개
		int 오만원 	= pay / 50000;
		int 만원 	= (pay % 50000) / 10000;
		int 오천원 	= ((pay % 50000) % 10000) / 5000;
		int 천원 	= (((pay % 50000) % 10000) % 5000) / 1000;
		int 오백원 	= ((((pay % 50000) % 10000) % 5000) % 1000) / 500;
		int 백원 	= (((((pay % 50000) % 10000) % 5000) % 1000) % 500 ) / 100;
		int 오십원 	= ((((((pay % 50000) % 10000) % 5000) % 1000) % 500 ) % 100) / 50;
		int 십원 	= (((((((pay % 50000) % 10000) % 5000) % 1000) % 500 ) % 100) % 50) /10;
		
		System.out.printf("오만원 %d장, 만원 %d장, 오천원 %d장, 천원 %d장, 오백원 %d개, 백원 %d개, 오십원 %d개, 십원 %d개",
						   오만원, 만원, 오천원, 천원, 오백원, 백원, 오십원, 십원);
	}

	private static void getHourMinteSecond(Scanner sc) {
		System.out.print("정수를 입력하세요.");
		int time = sc.nextInt();
		int second = time % 60;
		int minute = (time / 60) % 60;
		int hour = (time / 60) / 60;
		
		System.out.printf("%d초는 %d시간 %d분 %d초 입니다. %n", time, hour, minute, second);
	}

}
