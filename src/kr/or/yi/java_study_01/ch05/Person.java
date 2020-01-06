package kr.or.yi.java_study_01.ch05;

public class Person {
	private int weigth;		// private 접근 지정. Student 클래스에서 접근 불가능
	int age;				// 디폴트 접근 지정. Student 클래스에서 접근 가능
	protected int height;	// protected 접근 지정. Student 클래스에서 접근 가능
	public String name;		// public 접근 지정. Student 클래스에서 접근 가능
	
	// private 멤버인 weight를 접근하기 위한 get/set 메소드
	public int getWeigth() {
		return weigth;
	}
	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}
}
