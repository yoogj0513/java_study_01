package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class ForWhileLoop01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("번호를 입력하세요 1.for문 2.while 3.종료 >>");
		int res = sc.nextInt();
		while(res<3) {
			if (res==1) {
				System.out.println("===== for문 =====");
				System.out.println();
				ex_for(sc);
			}else {
				System.out.println("===== while문 =====");
				System.out.println();
				ex_while(sc);
			}
			System.out.print("번호를 입력하세요 1.for문 2.while 3.종료 >>");
			res = sc.nextInt();
		}
		System.out.println("프로그램 종료.");
		
		sc.close();
	}
	
//	while문
	private static void ex_while(Scanner sc) {
		int res=0;
		while(res!=4) {			
			System.out.print("번호를 입력하세요 1. gugudan 2. factorial 3.fibonacci 4.종료 >>");
			res = sc.nextInt();
			switch(res) {
				case 1: gugudan_while(); break;
				case 2: factorail_while(sc); break;
				case 3: fibonacci_while(sc); break;
				default: System.out.println("while 문 종료\n");
			}
		}
		//while문과 switch문을 이용하여 1. gugudan 2. factorial 3.fibonacci 4.종료 구현
	}

	private static void fibonacci_while(Scanner sc) {
		System.out.print("피보나치 n번째 수열값, 정수를 입력하세요. >> ");
		int num = sc.nextInt();
		int f1 = 0;
		int f2 = 1;
		int f3 = 0;
		int count = 0;
		
		while (count < num+1) {
			System.out.printf("%d ", f1);
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
			count++;
		}
		System.out.println();
	}
	private static void factorail_while(Scanner sc) {
		System.out.print("정수를 입력하세요. >> ");
		int num = sc.nextInt();
		int i = 1;
		int j = 1;
		
		System.out.printf("%d!= ", num);
		while(i<num) {
			System.out.printf("%d * ", i);
			i++;
			j = j * i;
		}
		System.out.printf("%d = %d%n", i, j);
		System.out.println();
	}
	private static void gugudan_while() {
		int i = 1;
		int j = 2;
		
		while(i<10) {
			j=2;
			while(j<10) {
				System.out.printf("%d * %d = %2d | ", j, i, j*i);
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println();
	}
	
//	for문
	private static void ex_for(Scanner sc) {
		int res=0;
		for(int i=0;res!=4;i++) {
			System.out.print("번호를 입력하세요 1. gugudan 2. factorial 3.fibonacci 4.종료 >>");
			res = sc.nextInt();
			switch(res) {
				case 1: gugudan_for(); break;
				case 2: factorail_for(sc);break;
				case 3 :fibonacii_for(sc);break;
				default :System.out.println("for 문 종료\n");
			}
		}
		//for문과 switch문을 이용하여 1. gugudan 2. factorial 3.fibonacci 4.종료 구현
	}

	private static void fibonacii_for(Scanner sc) {
		System.out.print("피보나치 n번째 수열값, 정수를 입력하세요. >> ");
		int num = sc.nextInt();
		int f1 = 0;
		int f2 = 1;
		int f3 = 0;
		
		for(int i=0; i<num+1; i++) {
			System.out.printf("%d ", f1);
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
		}
		System.out.println();
		System.out.println();
	}
	private static void factorail_for(Scanner sc) {
		System.out.print("정수를 입력하세요. >> ");
		int num = sc.nextInt();
		int sum = 1;
		int i = 1;
		System.out.printf("%d!= ", num);
		for(i=1; i<num+1; i++) {
			System.out.printf("%d %s ", i, i<num?"*":"=");
			sum = sum * i;
		}
		System.out.printf("%d%n", sum);
		System.out.println();
	}
	private static void gugudan_for() {
		for(int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
				System.out.printf("%d * %d = %2d |", j, i, j * i);
			}
			System.out.println();
		}
		System.out.println();
	}

}
