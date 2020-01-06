package kr.or.yi.java_study_01.ch05;

public class Point {
	// �� ���� �����ϴ� x, y ��ǥ
	private int x;
	private int y; 
	
	public Point() {
		this.x = this.y = 0;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// ���� ��ǥ ���
	public void showPoint() { 
		System.out.println("(" + x + ", " + y + ")");
	}
}
