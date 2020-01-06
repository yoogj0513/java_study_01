package kr.or.yi.java_study_01.ch02;

public class AssignmentOperator {

	public static void main(String[] args) {
//		assignmentIncDec();
//		
//		System.out.println();
//		
//		logicalOperator();
//		
//		TernaryOperator();
		
		System.out.printf("%x%n", 10);
		System.out.printf("%4x%n", 10);
		System.out.printf("%04x%n", 10);
		
	}

	private static void TernaryOperator() {
		int a = 5;
		int b = 3;
		
		int res = a > b ? a-b : b-a;
		System.out.printf("두 수의 차는 %d%n", res);
		System.out.printf("두 수의 차는 %d%n", a > b ? a-b : b-a);
	}

	private static void logicalOperator() {
		// 비교 연산
		System.out.println('a' > 'b');	// false
		System.out.println(3 >= 2);		// true
		System.out.println(-1 < 0);		// true
		System.out.println(3.45 <= 2);	// false
		System.out.println(3 == 2);		// false
		System.out.println(3 != 2);		// true
		System.out.println(!(3 != 2));	// false
		
		System.out.println();
		
		// 비교 연산과 논리 연산 복합
		System.out.println((3 > 2) && (3 > 4));		// false
		System.out.println((3 != 2) || (-1 > 0));	// true
		System.out.println((3 != 2) ^ (-1 > 0));	// true
	}

	private static void assignmentIncDec() {
		int a = 3;
		int b = 3;
		int c = 3;
		
		// 대입 연산 사례
		a += 3;	// a = a + 3 = 6
		b *= 3; // b = b * 3 = 9
		c %= 2; // c = c % 2 = 1
		System.out.printf("a = %d, b = %d, c = %d%n", a, b, c);
		
		int d = 3;
		// 증감 연산자 사례
		a = d++; // a = 3, d =4
		System.out.printf("a = %d, d = %d%n", a, d);
		a = ++d; // d = 5, a = 5
		System.out.printf("a = %d, d = %d%n", a, d);
		a = d--; // a = 5, d = 4
		System.out.printf("a = %d, d = %d%n", a, d);
		a = --d; // d = 3, a = 3
		System.out.printf("a = %d, d = %d%n", a, d);
	}

}
