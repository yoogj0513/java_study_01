package kr.or.yi.java_study_01.ch05.inter;

public class InterfaceEx {
	public static void main(String[] args) {
		SamsungPhone gallexy10 = new SamsungPhone();
		PhoneInterface gallexyNote = new SamsungPhone();
		
		gallexy10.setpName("���½�10");
		gallexy10.setpYear(2019);
		
		gallexyNote.prnLogo();
		gallexyNote.receiveCall();
		gallexyNote.sendCall();
		
		gallexy10.prnLogo();
		gallexy10.sendCall();
		gallexy10.sendCall();
	}
}
