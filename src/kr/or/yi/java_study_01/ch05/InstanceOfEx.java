package kr.or.yi.java_study_01.ch05;

class A {
	void prnA() {
		System.out.println("a");
	};
}

class B extends A {
	void prnB() {
		System.out.println("b");
	};
}

class C extends B {
	void prnC() {
		System.out.println("c");
	};
}


public class InstanceOfEx {

	public static void main(String[] args) {
		// 부모는 자식을 참조할수 있으나, 자식은 부모를 참조할 수 없다.
//		instanceofEx01();
		
		A a = new A();
		B b = new B();
		C c = new C();
		
		// 최상위 부모로 다 받을 수 있음. 그러므로 하나의 메소드로 가능함
		prnObj(a);
		prnObj(b);
		prnObj(c);
		
	}

	

	private static void prnObj(A a) {
		if(a instanceof C) {
			C cc = (C) a;
			cc.prnC();
		} else if(a instanceof B) {
			B bb = (B) a;
			bb.prnB();
		} else if(a instanceof A) {
			a.prnA();
		}
	}



	private static void instanceofEx01() {
		//		A a = new C(); // 업캐스팅
		//		A a = new B(); // 업캐스팅
				A a = new A();
				
				// 낮은 순서부터 검사
				if(a instanceof C) {
					System.out.println("a는 C의 객체를 가지고 있음");
				} else if(a instanceof B) {
					System.out.println("a는 B의 객체를 가지고 있음");			
				} else if(a instanceof A) {			
					System.out.println("a는 A의 객체를 가지고 있음");			
				}
	}

}
