package kr.or.yi.java_study_01.ch05.inter;

public interface MusicPhoneInterface extends MobilePhoneInterface, MP3Interface {
	void playMP3RingTone();
}
