package kr.or.yi.java_study_01.ch03.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
//		exam01();
//		ArithmeticEx01();
		
		Scanner sc = new Scanner(System.in);
		
		try {			
			int[] intArr = new int[5];
//			System.out.println(5/0);
//			int b = sc.nextInt();
			int c = Integer.parseInt("a");
//			intArr[5] = 10;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 발생");
		}catch(ArithmeticException e) {
			System.out.println("에러");
		}catch(InputMismatchException e) {
			System.out.println("숫자만 가능");
		}catch(NumberFormatException err) {
			System.out.println("문자화 된 숫자만 가능");
		}
		
//		예외 전체
//		catch(Exception e) {
//			System.out.println("위의 예외를 제외한 나머지 예외");
//			// 예외프린트
//			e.printStackTrace();
//		}
		
		sc.close();
		
	}

	private static void ArithmeticEx01() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("나뉨수를 입력하시오 >> ");
			int dividend = sc.nextInt();
			System.out.println("나눗수를 입력하시오 >> ");
			int divisor = sc.nextInt();
			
			try {
				System.out.printf("%d를 %d로 나누면 몫은 %d입니다.", dividend, divisor, dividend/divisor);
				break;
			} catch(ArithmeticException e){
				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요.");
			}
		}
		
		sc.close();
	}

	private static void exam01() {
		int dividend = 5; // 나뉨수
		int divisor = 0;  // 나눗수
		
//		System.out.println(dividend + "를" + divisor + "로 나누면 몫은 " + dividend/divisor + "입니다.");
//		System.out.println("계산완료");
		
		try {			
			System.out.println(dividend + "를" + divisor + "로 나누면 몫은 " + dividend/divisor + "입니다.");
			System.out.println("계산완료");
		} catch(ArithmeticException e) {
			System.out.printf(" %d / %d 예외 발생 0으로 나눌수 없음", dividend, divisor);
		}
		
		System.out.println("main() 수행 완료~~!!");
	}

}
