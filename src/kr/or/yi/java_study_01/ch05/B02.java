package kr.or.yi.java_study_01.ch05;

public class B02 extends A02{
	// A에 기본생성자가 선언이 되어있지 않다면 B에 에러표시가 남.
	// A에 기본 생성자가 있다면 B에 에러표시가 없음
	
	private int b;

	public B02(int b) {
		this.b = b;
	}
	
	public void prnB() {
		System.out.println("BBB");
	}
	
	public static void main(String[] args) {
		//A a = new A();
		// 컴파일에서는 문법이 맞기 때문에 오류표시가 안뜨지면 실행(런타임)하면 오류 발생
		//B b = (B) a; 	// DownCasting 실패(B객체가 존재(X))
		
		// Down Casting 
		B02 bb = new B02(1);
		A02 ab = bb;
		B02 bbb = (B02) ab;
		
		// Up Casting
		A02 a = new B02(1);
	}
}
