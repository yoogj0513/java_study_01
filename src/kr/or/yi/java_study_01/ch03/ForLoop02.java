package kr.or.yi.java_study_01.ch03;

public class ForLoop02 {
	public static void main(String[] args) {
//		exam01();
				
//		별찍기
//		별찍기01();
//		별찍기02();
//		별찍기03();
//		별찍기04();
//		별찍기05();
		
		
		
	}

	private static void 별찍기05() {
		String dan = "";
		for(int j=0; j<5; j++) {
			System.out.print(dan);
			dan = dan + " ";
			for(int i=0; i<5-j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void 별찍기04() {
		String star = "*";
		for(int j=0; j<5; j++) {
			for(int i=0; i<4-j; i++) {
				System.out.print(" ");
			}
			System.out.println(star);
			star = star + "*";
		}
	}

	private static void 별찍기03() {
		for(int j=0; j<5; j++) {
			for(int i=0; i<5-j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void 별찍기02() {
		for(int j=0; j<5; j++) {
			for(int i=0; i<j+1; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void 별찍기01() {
		for(int j=0; j<5; j++) {
			for(int i=0; i<5; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void exam01() {
		int sum = 0;
		for(int i=0; i<11; i++) {
			sum = sum+i;
		}
		System.out.println(sum);
		
		int evenSum = 0;
		int oddSum = 0;
//		int sum = 0;
		// 1부터 100까지 짝수합과 홀수합, 전체합을 구하는 반복문을 작성하시오.
		for(int i=0; i<101; i++) {
			if(i % 2 == 0) {
				evenSum = evenSum + i;
			} else if (i % 2 != 0) {
				oddSum = oddSum + i;
			}
		}
		System.out.printf("홀수합 : %d 짝수합: %d 전체합: %d", oddSum, evenSum, oddSum + evenSum);
	}
}
