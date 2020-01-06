package kr.or.yi.java_study_01.ch04.p;

// 다른 패키지에 있는 클래스를 불러옴
import kr.or.yi.java_study_01.ch04.q.B;

class A {
	void f() {
		B b = new B();
		
//		C c = new C(); // 사용 불가능 
	}
}
