package kr.or.yi.java_study_01.ch05;

public class Point {
	// 한 점을 구성하는 x, y 좌표
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
	
	// 점의 좌표 출력
	public void showPoint() { 
		System.out.println("(" + x + ", " + y + ")");
	}
}
