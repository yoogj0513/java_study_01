package kr.or.yi.java_study_01.ch05;

public class B02 extends A02{
	// A�� �⺻�����ڰ� ������ �Ǿ����� �ʴٸ� B�� ����ǥ�ð� ��.
	// A�� �⺻ �����ڰ� �ִٸ� B�� ����ǥ�ð� ����
	
	private int b;

	public B02(int b) {
		this.b = b;
	}
	
	public void prnB() {
		System.out.println("BBB");
	}
	
	public static void main(String[] args) {
		//A a = new A();
		// �����Ͽ����� ������ �±� ������ ����ǥ�ð� �ȶ����� ����(��Ÿ��)�ϸ� ���� �߻�
		//B b = (B) a; 	// DownCasting ����(B��ü�� ����(X))
		
		// Down Casting 
		B02 bb = new B02(1);
		A02 ab = bb;
		B02 bbb = (B02) ab;
		
		// Up Casting
		A02 a = new B02(1);
	}
}
