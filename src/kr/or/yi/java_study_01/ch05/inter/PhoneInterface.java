package kr.or.yi.java_study_01.ch05.inter;

public interface PhoneInterface {
	// ���, �߻�޼���, default �޼���

	// ���
	// public static final ���� ����
	public static final int TIMEOUT = 1000; // ���

	// �߻� �޼ҵ�
	// public abstract ���� ����
	public abstract void sendCall();

	void receiveCall();

	// default �޼ҵ�
	default void prnLogo() {
		System.out.println("** phone **");
	}

}
