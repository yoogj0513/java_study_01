package kr.or.yi.java_study_01.ch04;

public class TestMain {
	public static void main(String[] args) {
		//prnTest(); // 메소드에 접근지정자가 없음. 에러
		// 클래스 호출
		TestMain tm = new TestMain();
		tm.prnTest(); // 접근 가능
	}
	
	public static void prn() {
		System.out.println("ㅎㅎㅎ");
	}
	
	public void prnTest() {
		System.out.println("HaHa");
		TestMain.prn();
	}
}
