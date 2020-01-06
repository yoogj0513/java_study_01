package kr.or.yi.java_study_01.ch03;

public class ForLoop01 {
	public static void main(String[] args) {
//		hardcoding();
//		for_loop01();
		
//		gugudan_dan();
		
//		gugudan_lang();
		
		// 지역변수 : 반드시 초기화
		// 1부터 10까지 짝수만 출력
		for(int i = 2; i < 11; i = i + 2) {
			System.out.printf("%d ", i);
		}
		
		System.out.println();
		
		// 반복문이 실행되기는 하지만 좋지 않은 방법
		for(int i = 0; i < 10; i = i + 2, System.out.printf("%d ", i)); 
		
		System.out.println();
		
		for(int i = 1; i < 11; i++) {
			if((i % 2) == 0) {
				System.out.printf("%d ", i);
			}
		}
		
		System.out.println();
		
		// 1부터 10까지 홀수만 출력
		for(int i = 1; i < 11; i = i + 2) {
			System.out.printf("%d ", i);
		}
		
//		for(int i = 1; i < 11; i++) {
//			if((i % 2) != 0) {
//				System.out.printf("%d ", i);
//			}
//		}
		
		
		
	}

	private static void gugudan_dan() {
		for (int dan = 2; dan <10; dan++) {		
			System.out.println("==== " + dan + " ====");
			gugudan(dan);
		}
	}

	private static void gugudan_lang() {
		for(int i = 1; i < 10; i++) {
			for(int dan2 = 2; dan2 < 10; dan2++) {
				System.out.printf("%d * %d = %2d ", dan2, i, dan2 * i);
			}
			System.out.println();
		}
	}

	private static void gugudan(int dan) {
		for(int i = 1; i < 10; i++) {  // >=도 사용 가능하시만 헷갈릴 수 있기 때문에 비추천
			System.out.printf("%d * %d = %d %n", dan, i, dan * i);
		}
	}

	private static void for_loop01() {
		//(초기화식; 조건식; 증감식)
		for(int i = 0; i < 10; i++) {
			System.out.println("Hello Java " + i);
		}
		System.out.println("done");
	}

	private static void hardcoding() {
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
	}
}
