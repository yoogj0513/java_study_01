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
		// �θ�� �ڽ��� �����Ҽ� ������, �ڽ��� �θ� ������ �� ����.
//		instanceofEx01();
		
		A a = new A();
		B b = new B();
		C c = new C();
		
		// �ֻ��� �θ�� �� ���� �� ����. �׷��Ƿ� �ϳ��� �޼ҵ�� ������
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
		//		A a = new C(); // ��ĳ����
		//		A a = new B(); // ��ĳ����
				A a = new A();
				
				// ���� �������� �˻�
				if(a instanceof C) {
					System.out.println("a�� C�� ��ü�� ������ ����");
				} else if(a instanceof B) {
					System.out.println("a�� B�� ��ü�� ������ ����");			
				} else if(a instanceof A) {			
					System.out.println("a�� A�� ��ü�� ������ ����");			
				}
	}

}
