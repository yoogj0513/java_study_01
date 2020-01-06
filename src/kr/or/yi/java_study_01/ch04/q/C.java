package kr.or.yi.java_study_01.ch04.q;

// 접근 지정 : 디폴트(package)로 다른 패키지에서는 쓸 수 없고 같은 패키지 클래스에서만 사용이 가능
class C {
	void g() {
		B b = new B(); // 같은 패키지 안에 있기 때문에 import 안해도 됨
	}
}
