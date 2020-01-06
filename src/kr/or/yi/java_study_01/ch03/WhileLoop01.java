package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class WhileLoop01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		exam3_while(sc);
//		exam3_for(sc);
		
//		gugudan_while(sc);
//		gugudan_whileFull();
//		gugudan_whileFull_land();
//		factorial_while(sc);
		fibonacci_while(sc);
		
		
		sc.close();
	}

	private static void fibonacci_while(Scanner sc) {
		System.out.print("피보나치 n번째 수열값, 정수를 입력하세요. >> ");
		int num = sc.nextInt();
		int f1 = 0;
		int f2 = 1;
		int f3 = 0;
		int count = 0;
		
		while (count < num) {
			System.out.printf("%d ", f1);
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
			count++;
		}
		
	}

	private static void factorial_while(Scanner sc) {
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
		System.out.printf("%d = %d", i, j);
		
		System.out.println();
		
		i = num;
		j = 1;
		System.out.printf("%d!= ", num);
		while(i>0) {
			System.out.printf("%d %s ", i, i>1?"*":"=");
			j = j * i;
			i--;
		}
		System.out.printf("%d", j);
		
	}

	private static void gugudan_whileFull_land() {
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
	}

	private static void gugudan_whileFull() {
		int i = 2;
		int j = 1;
		
		while(i<10) {
			System.out.printf("==== %d단 ====%n", i);
			j = 1;
			
			while(j<10) {
				System.out.printf("%d * %d = %d%n", i, j, i*j);
				j++;
			}
			
			i++;
		}
		
	}

	private static void gugudan_while(Scanner sc) {
		System.out.print("정수를 입력하세요. >> ");
		int num = sc.nextInt();
		int i = 1;
		System.out.printf("==== %d단 ====%n", num);
		while (i<10) {
			System.out.printf("%d * %d = %d%n", num, i, num * i);
			i++;
		}
	}

	private static void exam3_while(Scanner sc) {
		System.out.print("정수를 입력하고 마지막에 -1을 입력하세요. >> ");
		int num = sc.nextInt();
		int sum = 0;
		int count = 0;
		
		while (num != -1) {
			sum = sum + num;
			count++;
			num = sc.nextInt();
		}
		
		if(count == 0) {
			System.out.print("입력된 수가 없습니다.");
		} else {			
			System.out.printf("정수의 개수는 %d개이며 평균은 %.1f 입니다.", count, (double)sum / count);
		}
		
	}

	private static void exam3_for(Scanner sc) {
		System.out.print("정수를 입력하고 마지막을 -1을 일력하세요. >> ");
		int num = sc.nextInt();
		int sum = 0;
		int count = 0;
		
		for(count=0; num!=-1; count++) {
			sum = sum + num;
			num = sc.nextInt();
		}
		
		if(count == 0) {
			System.out.print("입력된 수가 없습니다.");
		} else {			
			System.out.printf("정수의 개수는 %d개이며 평균은  %.1f 입니다.", count, (double)sum / count);
		}
	}

}
