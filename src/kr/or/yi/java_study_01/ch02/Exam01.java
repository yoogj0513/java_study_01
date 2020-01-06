package kr.or.yi.java_study_01.ch02;

// ctrl + shift + o : 자동 임포트 단출키
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		System.out.print("두 정수로 입력하시오. 공백으로 분리 >> ");
		Scanner sc = new Scanner(System.in); 
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// a=5, b=2
		// 7 (5+2)
		// 3 (5-2)
		// 10 (5*2)
		// 2.5 (5/2)
		int res = sum(a, b);
		System.out.printf("두 수(%d, %d)의 합은 %d%n", a, b, res);
		
		res = sub(a, b); // 두 수의 차
		System.out.printf("두 수(%d, %d)의 차은 %d%n", a, b, res);
		
		res = mul(a, b); // 두 수의 곱
		System.out.printf("두 수(%d, %d)의 곱은 %d%n", a, b, res);
		
		//res = div(a, b); // 두 수의 나누기
		System.out.printf("두 수(%d, %d)의 몫은 %.1f%n", a, b, div(a, b));
		
		sc.close();
	}

	private static double div(int a, int b) {
		// TODO Auto-generated method stub
		return (double) a /  b;
	}

	private static int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	private static int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	private static int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

}
