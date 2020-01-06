package kr.or.yi.java_study_01.ch05.ab;

public class MethodOverridingEx {
	static void paint(Shape p) {
		p.draw();
	}
	
	public static void main(String[] args) {
		array_to();
		
	}

	private static void array_to() {
		Shape[] shapes = {new Line(), new Rect(), new Circle()};
		for(Shape s : shapes) {
			paint(s);
		}
	}

}
