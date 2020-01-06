package kr.or.yi.java_study_01.ch04;

// Circle타입
// extends Object는 생략가능
public class Circle extends Object{
	public int radius; //필드라고도 부름
	public String name;//필드
	
	
	// 생성자 : 초기화 하는 역할
	// 생성자 총 4개 만들어짐
	// super(): 생략가능
	// 생성자 1
	public Circle() {
		super(); //부모를 의미, 부모 생성자 호출
	}
	
	
	// 생성자 overloading / 생성자 
	// 생성자 2
	public Circle(String name) {
		this.name = name;
	}

	// 생성자 overloading // overloading : 증복정의
	// 생성자 3
	public Circle(int radius, String name) {
//		super();
		this.radius = radius;
		this.name = name;
	}
	
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	// 생성자4
	public Circle(int radius) {
		this.radius = radius;
	}

	
	//메소드
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	
	// override : 부모의 메소드를 재정의
	@Override
	public String toString() {
		return String.format("[%s, %s, %.2f]", radius, name, getArea());
	}


	public void setName(String string) {
		this.name = name;
	}
	
	
}
