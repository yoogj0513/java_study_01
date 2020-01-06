package kr.or.yi.java_study_01.ch03;

public class ForWhileLoop02 {
	public static void main(String[] args) {
		// 1 ~ 100까지 합 : sum / 1 ~ 100 까지 짝수합: evenSum / 1 ~ 100까지 홀수합 : oddSum / 1 ~ 100까지 3의 배수 합: threeSum
		int num = 0;
		int sum = 0;
		int evenSum = 0;
		int oddSum = 0;
		int threeSum = 0;
		// for
		forSum(num, sum, evenSum, oddSum, threeSum);
		
		System.out.println();
		
		// while 
		whileSum(num, sum, evenSum, oddSum, threeSum);
		
	}

	private static void whileSum(int num, int sum, int evenSum, int oddSum, int threeSum) {
		while (num < 101) {
			if(num%2 == 0) {
				evenSum = evenSum + num;
			} else if(num%2 != 0) {
				oddSum = oddSum + num;
			}
			
			if(num%3 == 0) {
				threeSum = threeSum + num;
			}
			sum = sum + num;
			num++;
		}
		System.out.printf("while문 - 1~100까지 [합 : %d] / [짝수 합: %d] / [홀수 합: %d] / [3의 배수합: %d]", sum, evenSum, oddSum, threeSum);
	}

	private static void forSum(int num, int sum, int evenSum, int oddSum, int threeSum) {
		
		for(num = 0; num < 101; num++) {
			if(num%2 == 0) {
				evenSum = evenSum + num;
			} else if(num%2 != 0) {
				oddSum = oddSum + num;
			}
			
			if(num%3 == 0) {
				threeSum = threeSum + num;
			}
			sum = sum + num;
		}
		
		System.out.printf("for문     - 1~100까지 [합 : %d] / [짝수 합: %d] / [홀수 합: %d] / [3의 배수합: %d]", sum, evenSum, oddSum, threeSum);
	}
}
