package kr.or.yi.java_study_01.ch03;

public class ContinueBreak01 {
	public static void main(String[] args) {
		
//		gugudanContinue01();
//		gugudanContinue02();
		
//		gugudanBreak01();
		gugudanBreak02();
		
	}

	private static void gugudanBreak02() {
		for(int num=1; num<10; num++) {
			if(num == 6) {
				break;
			}
			for(int dan=2; dan<10; dan++) {
				if(dan == 6) {
					break;
				}
				System.out.printf("%d * %d = %2d | ", dan, num, dan*num);
			}
			System.out.println();
		}
	}

	private static void gugudanBreak01() {
		for(int num=1; num<10; num++) {
			if(num == 6) {
				break;
			}
			for(int dan=2; dan<10; dan++) {
				System.out.printf("%d * %d = %2d | ", dan, num, dan*num);
			}
			System.out.println();
		}
	}

	private static void gugudanContinue02() {
		for(int i=2; i<10; i++) {
			if(i==5) {
				continue;
			}
			
			for(int j=2; j<10; j++) {
				if(j==5) {
					continue;
				}
				
				System.out.printf("%d * %d = %2d | ", j, i, j*i);
			}
			System.out.println();
		}
		
	}

	private static void gugudanContinue01() {
		for(int i=2; i<10; i++) {
			if(i==5) {
				continue;
			}
			
			for(int j=2; j<10; j++) {				
				System.out.printf("%d * %d = %2d | ", j, i, j*i);
			}
			System.out.println();
		}
	}
}
