package kr.or.yi.java_study_01.ch05.inter;

public interface PhoneInterface {
	// 상수, 추상메서드, default 메서드

	// 상수
	// public static final 생략 가능
	public static final int TIMEOUT = 1000; // 상수

	// 추상 메소드
	// public abstract 생략 가능
	public abstract void sendCall();

	void receiveCall();

	// default 메소드
	default void prnLogo() {
		System.out.println("** phone **");
	}

}
