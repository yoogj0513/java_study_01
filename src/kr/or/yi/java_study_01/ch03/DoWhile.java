package kr.or.yi.java_study_01.ch03;

public class DoWhile {

	public static void main(String[] args) {
		char a = 'a';
		do {
			System.out.print(a + " ");
			a = (char)(a+1);
		}while(a <= 'z');
	}

}
