package kr.or.yi.java_study_01.ch01;


// 소유자(파일명과 동일한) 클래스에만 public을 붙일 수 있다.
public class HelloJava {
// 정렬 단출키 : 

	// main : 기본 메소드. 반드시 수행할 땐 main메소드
	public static void main(String[] args) {
		// 함수 내에서 선언된 변수는 지역변수
		// String
		String name = "이상원"; // 변수 지정

		// sysout -> 단축키 (ctrl+스페이스)
		// println -> 줄바꿈 출력 / print -> 줄바꿈 X
		// 문자열 안에서 줄바꿈 \n
		System.out.print("Hello Java ");

		/*
		 * 문자열 + 변수 => 문자열 + 문자열 -> 하나의 문자열(문자열 결합연산자(+)) 블럭주석 (ctrl+shift+/) / 블럭주석 해제
		 * (ctrl+shift+\)
		 */
		System.out.print("힘들지 " + name);

	}

}

// 하나의 파일에는 하나의 클래스만!!