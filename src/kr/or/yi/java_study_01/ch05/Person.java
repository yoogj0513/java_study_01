package kr.or.yi.java_study_01.ch05;

public class Person {
	private int weigth;		// private ���� ����. Student Ŭ�������� ���� �Ұ���
	int age;				// ����Ʈ ���� ����. Student Ŭ�������� ���� ����
	protected int height;	// protected ���� ����. Student Ŭ�������� ���� ����
	public String name;		// public ���� ����. Student Ŭ�������� ���� ����
	
	// private ����� weight�� �����ϱ� ���� get/set �޼ҵ�
	public int getWeigth() {
		return weigth;
	}
	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}
}
