package kr.or.yi.java_study_01.ch03.exam;

import java.util.Scanner;

public class Loop_Exam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1. 사용자가 입력한 정수의 합을 구하여 출력하는 프로그램을 다음의 3가지 방법으로 작성하여 보자.
//		exam1_a(sc);
//		exam1_b(sc);
//		exam1_c(sc);
		
		//2.
//		exam2(sc);
		
		//3. 
//		exam03(sc);
		
		sc.close();
	}

	private static void exam03(Scanner sc) {
		int correct = (int)(Math.random() * 100) + 1;
		int count = 0;
		System.out.println("correct = " + correct);
		int res;
		do {
			System.out.print("1~100사이의 정수를 입력하시오. >> ");
			res = sc.nextInt();
			count++;
			if(res > correct) {
				System.out.println("낮음");
			} else if (res == correct) {
				System.out.println("정답");
				break;
			} else {
				System.out.println("높음");
			}
		}while(res > 0);
		System.out.printf("%d번 만에 맞췃음", count);
	}

	private static void exam2(Scanner sc) {
		System.out.print("정수 입력 >> ");
		int res = sc.nextInt(); //1206
		do {
			System.out.print(res%10);
			res = res/10;
		}while(res > 0);
	}

	private static void exam1_c(Scanner sc) {
		// 1-C. 처리된 정수의 개수를 지정하지 않고, 사용자가 0을 입력하면 반복을 중단하고 그 때까지의 합을 출력한다.
		// 입력된 정수가 0이 아니면 합계에 더해진다. 예를 들어 100 200 300 0과 같이 입력될 수 잇다.
		System.out.print("입력값 ... 입력값 0 >> ");
		int iValue;
		int sum = 0;
		do {
			iValue = sc.nextInt();
			sum += iValue;
		}while(iValue != 0);
		System.out.printf("%d%n", sum);
	}

	private static void exam1_b(Scanner sc) {
		// 1-B. 맨 처음에 입력되는 정수는 앞으로 입력되는 정수의 개수를 지정한다.
		// 즉 3 100 200 300 순으로 입력된다면 여기서 3이 앞으로 처리하여 할 정수의 개수이다.
		System.out.print("입력값의 개수 입력값1 입력값2 ... >> ");
		int cnt = sc.nextInt();
		int sum = 0;
		int iValue;
		for(int i = 0; i<cnt; i++) {
			iValue = sc.nextInt();
			sum = sum + iValue;
			System.out.printf("%d %s", iValue, i==cnt-1?" = ":" + ");
		}
		System.out.printf("%d%n ", sum);
	}

	private static void exam1_a(Scanner sc) {
		// 1-A. 첫 번재 방법은 더해야 할 정수의 개수가 미리 결정되어 있는 경우이다.
		//      즉 1부터 100까지의 정수들의 합을 구하는 경우이다.
		System.out.println("시작값 종료값을 입력 >> ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		int sum = 0;
		
		for(int i=start; i<end+1; i++) {
			sum = sum + i;
		}
		System.out.printf("%d에서 %d까지의 합은 %d%n", start, end, sum);
	}

}
