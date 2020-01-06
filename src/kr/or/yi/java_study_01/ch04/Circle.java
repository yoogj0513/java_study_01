package kr.or.yi.java_study_01.ch04;

// CircleŸ��
// extends Object�� ��������
public class Circle extends Object{
	public int radius; //�ʵ��� �θ�
	public String name;//�ʵ�
	
	
	// ������ : �ʱ�ȭ �ϴ� ����
	// ������ �� 4�� �������
	// super(): ��������
	// ������ 1
	public Circle() {
		super(); //�θ� �ǹ�, �θ� ������ ȣ��
	}
	
	
	// ������ overloading / ������ 
	// ������ 2
	public Circle(String name) {
		this.name = name;
	}

	// ������ overloading // overloading : ��������
	// ������ 3
	public Circle(int radius, String name) {
//		super();
		this.radius = radius;
		this.name = name;
	}
	
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	// ������4
	public Circle(int radius) {
		this.radius = radius;
	}

	
	//�޼ҵ�
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	
	// override : �θ��� �޼ҵ带 ������
	@Override
	public String toString() {
		return String.format("[%s, %s, %.2f]", radius, name, getArea());
	}


	public void setName(String string) {
		this.name = name;
	}
	
	
}
