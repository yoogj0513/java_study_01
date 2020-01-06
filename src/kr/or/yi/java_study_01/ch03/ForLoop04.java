package kr.or.yi.java_study_01.ch03;

public class ForLoop04 {
	public static void main(String[] args) {
		pibo(8);
		
	}

	private static void pibo(int cnt) {
		
		int pibo = cnt;
		int res1 = 0;
		int res2 = 1;
		int res3 = 0;
		
		for(int i=0; i<pibo; i++) {
			System.out.print(res1 + " ");
			res3 = res1 + res2;
			res1 = res2;
			res2 = res3;
			
		}
	}
}
