package kr.or.yi.java_study_01.ch05.override;

public class Overrideing {

	public static void main(String[] args) {
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("�⺻ ������ ��� �ɷ��� " + weapon.fire());
		
		weapon = new Cannon();
		System.out.println("������ ��� �ɷ��� " + weapon.fire());
	}

}
