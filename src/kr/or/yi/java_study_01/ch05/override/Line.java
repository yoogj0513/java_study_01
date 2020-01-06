package kr.or.yi.java_study_01.ch05.override;

public class Line extends Shape{

	@Override //컴파일러에게 알려주는 것
	public void draw() {
		System.out.println("Line");
	}
	
}
