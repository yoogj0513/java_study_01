package kr.or.yi.java_study_01.ch05;

public class Student extends Person {
	public void set() {
		age = 30;		// ���� Ŭ������ ����Ʈ ��� ���� ����
		name = "ȫ�浿";	// ���� Ŭ������ public ��� ���� ����
		height = 175;	// ���� Ŭ������ protected ��� ���� ����
		//weigth = 99;  // ����. ���� Ŭ������ private ��� ���� �Ұ�
		setWeigth(99);  // private ��� weight�� setWeight()���� ���� ����
	}
}
