package kr.or.yi.java_study_01.ch02;

public class CircleArea {
	public static void main(String[] args) {
		// 상수 선언 : 상수는 실행 중에 값이 바꿀 수 없다.
		final double PI = 3.14;
		
		double radius = 10.0;
		double circleArea = radius * radius * PI;
		
		System.out.println("원의 면적 = " + circleArea);
		System.out.printf("원의 면적 = %.2f%n", circleArea);
		
		//강제 타입 변환 
		int n = 300;
		byte b = (byte) n;  //강제 형 변환
		System.out.println(b); // 강제 형 변환을 했기 때문에 값이 짤려고 출력됨 // 44 출력 
	}
}
