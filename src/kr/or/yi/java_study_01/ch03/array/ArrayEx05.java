package kr.or.yi.java_study_01.ch03.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx05 {

	public static void main(String[] args) {
		/* 1. 12명의 국어, 영어, 수학 점수를 담는 2차원 배열 선언
		 * 2. 12명의 이름을 담는 배열 선언
		 * 3. 61~100 사이의 랜덤한 값을 국어, 영어, 수학 점수로 입력  
		 * 0 <= nextInt(40) < 40
		 * 60 <= nextInt(40) + 60 < 100
		 * 4. 이름 국어 영어 수학 총점 평균을 각각 출력
		 * 5. 과목별 평균을 출력하시오.
		 * 
		 * 이름   국어       영어        수학          총점       평균
		 * ======================================
		 * ...  90     90     90     270   90.00 
		 * ...
		 * ======================================
		 * 전체  60.00  60.00  60.00  180.00  60.00
		 */
		
		String[] names = {"권수진", "정아름", "황태원", "장현서", "현재승", "배진우", "박인선", "이상원", "유경진", "권태헌", "황하나", "이동주"};
		Random rnd = new Random(123456789);
		double[][] scoreArr = new double[12][3];
		int i=0;
		int cnt;
		int eachSum;
		double subjectSum;
		double avg;
		double totalSum = 0;
		double totalAvg = 0;
		
		scoreArr[0][0] = rnd.nextInt(40) + 60;
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("==============================================");
		for(i=0; i<scoreArr.length; i++) {
			System.out.printf("%s\t", names[i]);
			eachSum = 0;
			for(cnt=0; cnt<scoreArr[i].length; cnt++) {
				scoreArr[i][cnt] = rnd.nextInt(40) + 60;
				System.out.print((int)scoreArr[i][cnt] + "\t");
				eachSum = eachSum + (int)scoreArr[i][cnt];
			}
			avg = (double)eachSum / scoreArr[i].length;
			System.out.printf("%d\t%.2f", eachSum, avg);
			System.out.println();
			
			totalSum = totalSum + eachSum;
			totalAvg = totalAvg + avg;
		}
		System.out.println("==============================================");
		System.out.print("전체\t");
		
		for(cnt=0; cnt<scoreArr[0].length; cnt++) {
			subjectSum = 0;
			for(i=0; i<scoreArr.length; i++) {
				subjectSum = subjectSum + scoreArr[i][cnt];
			}
			System.out.printf("%.2f\t", subjectSum / scoreArr.length);
		}
		System.out.printf("%.2f\t%.2f", totalSum / scoreArr.length, totalAvg / scoreArr.length);
		
		
		//-----------------------------------------------------------------------------------------
		//score();
		
	}

	private static void score() {
		double[][] score = {
				{3.3, 3.4}, // 1학년 1, 2학기 평점
				{3.5, 3.6}, // 2학년 1, 2학기 평점
				{3.7, 4.0}, // 3학년 1, 2학기 평점
				{4.1, 4.2}  // 4학년 1, 2학기 평점
		};
		double sum = 0;
		double yearSum = 0;
		
		for(int year=0; year<score.length; year++) {
			yearSum=0;
			System.out.print(year + 1 + "학년 ");
			for(int term=0; term<score[year].length; term++) {
				System.out.print(score[year][term]+" ");
				sum = sum + score[year][term];
				yearSum = yearSum + score[year][term];
			}
			System.out.printf("%.2f%n", yearSum / 2);
		}
		int n = score.length;
		int m = score[0].length;
		System.out.printf("4년 전체 평점 평균은 %.2f", sum / (n*m));
	}

}
