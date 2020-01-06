package kr.or.yi.java_study_01.ch05;

public class ColorPoint extends Point {
	private String color; // ���� ��
	
	// �÷� ���� ��ǥ ���
	public ColorPoint(int x, int y, String color) {
		super(x, y);		// Point�� ������ Point(x, y) ȣ��
		this.color = color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	// �÷� ���� ��ǥ ���
	public void showColorPoint() {
		System.out.print(color);
		showPoint();// Point Ŭ������ showPoint() ȣ��
	}
}
