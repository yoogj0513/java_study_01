package kr.or.yi.java_study_01.ch02;

/**
 * 소스파일: Hello.java
 * 작성일 : 2019.11.20
 * 아래 클래스에 대한 설명을 적음.
 * (단축키 : alt + shift + j)
 */

public class Hello {
	public static void main(String[] args) { //args : 지역변수
		double PI = 3.141592;
		
		// 지역변수 (함수 내 선언된 변수)
		int i = 20; // 선언과 초기화   // = -> 할당연산자 / 배정연산자 (l-values[저장소] = r-values[값])
		int s; 		// 정수형 변수 선언
		char a;		// 문자형 변수 선언
		
		s = sum(i, 10);
		a = '?';
		
		System.out.println(a + "Hello" + s); 
		// 'a' + "Hello" + 30
		// "a" + "Hello" + 30
		// "aHello" + 30
		// "aHello" + "30"
		
		// %c:char 문자 / %s:문자열 / %d:정수 / %f: 실수(전체 소수점 / %.nf: 소수점 n수만큼) / %n : 줄바꿈 / %ns : n자리수 만큼 왼쪽 공백, -는 오른쪽으로 공백
		System.out.printf("%c %10s %d %5.2f %n", a, "Hellow", s, 5/3.0); 
		
		System.out.println(a + "hello" + (s + 10));
		
		//sum메소드의 지역변수
		//System.out.printf("i = %d, j = %d%n", i, j);
		//System.out.printf("n = %d, m = %d%n", n, m);
		
		System.out.println("\"java's 어렵다.\"");
		
		PI = 3.14;
	}
	
	// alt + shift + R : 선택된 글자의 같은 글자 모두 수정할 수 있음
	// static은 static만 호출
	// n, m : 지역변수 -> sum 메소드에서만 유효 main에서는 없는 변수(사용할 수 없는 변수) 
	// 지역변수는 반드시 초기화
	private static int sum(int n, int m) {
		return n + m;
	}
}
