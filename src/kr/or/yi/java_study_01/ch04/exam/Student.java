package kr.or.yi.java_study_01.ch04.exam;

public class Student {
	// 필드는 무조건 private
	private int stdNo;
	private String stdName;
	private int kor;
	private int math;
	private int eng;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int stdNo, String stdName, int kor, int math, int eng) {
		this.stdNo = stdNo;
		this.stdName = stdName;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	// 수정할 때
	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}


	public void setStdName(String stdName) {
		this.stdName = stdName;
	}


	public void setKor(int kor) {
		this.kor = kor;
	}


	public void setMath(int math) {
		this.math = math;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}
	
	// 값을 가지고 올때
	public int getStdNo() {
		return stdNo;
	}

	public String getStdName() {
		return stdName;
	}

	public int getKor() {
		return kor;
	}

	public int getMath() {
		return math;
	}

	public int getEng() {
		return eng;
	}

	public int total() {
		return kor+math+eng;
	}
	
	public double avg() {
		return total() / 3.0;
	}


	@Override
	public String toString() {
		return String.format("[%2d, %-5s, %3d, %3d, %3d, %3d, %.2f]", 
							  stdNo, stdName, kor, math, eng, total(), avg());
	}
	

}
