package kr.or.yi.java_study_01.ch05.inter;

public class SamsungPhone implements PhoneInterface {
	private String pName;	// ��ǰ��
	private int pYear; 		// ���󿬵�
	
	public String getpName() {
		return pName;
	}

	public int getpYear() {
		return pYear;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public void setpYear(int pYear) {
		this.pYear = pYear;
	}

	@Override
	public void sendCall() {
		System.out.println("�츮��������");
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ�� �Խ��ϴ�.");
	}
	
	public void flash() {
		System.out.println("��ȭ�⿡ ��������");
	}
	
}
