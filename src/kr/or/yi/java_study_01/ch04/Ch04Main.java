package kr.or.yi.java_study_01.ch04;

public class Ch04Main {

	public static void main(String[] args) {
//		ch04_01();		
//		ch04_02();
//		ch04_03();
//		ch04_04();
		
		ch04_05();
		
		
	}

	private static void ch04_05() {
		Book book1 = new Book();
		System.out.println(book1);
	}

	private static void ch04_04() {
		Circle ob1 = new Circle(1);
		Circle ob2 = new Circle(1);
		Circle ob3 = new Circle(1);
		
		// ������ 1
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);
		
		// ������ ����
		ob1.setRadius(4);
		ob2.setRadius(5);
		ob3.setRadius(6);
		
		// ������ 4, 5, 6���� ����Ǿ� ��Ÿ��
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);
	}

	private static void ch04_03() {
		Book littlePrince = new Book("�����", "�����㺣��");
		Book loveStory = new Book("������");
		Book book2 = new Book();
		
		System.out.printf("%s : %s%n", littlePrince.title, littlePrince.author);
		System.out.printf("%s : %s%n", loveStory.title, loveStory.author);
		
		System.out.println(littlePrince);
	}

	private static void ch04_02() {
		Rectancle rect = new Rectancle();
		rect.width = 4;
		rect.height = 5;
		
		System.out.printf("�簢���� ������ %d%n", rect.getArea());
		
		Rectancle rect2 = new Rectancle(5, 5);
		System.out.printf("�簢���� ������ %d%n", rect.getArea());
	}

	private static void ch04_01() {
		// Circle Ÿ���� �������� ��
		Circle c1 = new Circle();
		c1.name = "��������";
		c1.radius = 100;
//		System.out.printf("�̸� %s ������ %d ���� %.2f %n", c1.name, c1.radius, c1.getArea());
		System.out.println(c1);
		
		// Object�� �������� ��
		Object c2 = new Circle();
		// Circle Ÿ������ ��ȯ
		((Circle)c2).name = "���۷δ�";
		((Circle)c2).radius = 50;
//		System.out.printf("�̸� %s ������ %d ���� %.2f%n", ((Circle)c2).name, ((Circle)c2).radius, ((Circle)c2).getArea());
		System.out.println(c2);
		
		
		Circle c3 = new Circle(30, "��ī������");
		System.out.println(c3);
	}

}
