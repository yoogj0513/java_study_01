package kr.or.yi.java_study_01.ch03;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx1205 {

	public static void main(String[] args) {
		twoBinary();
		
		System.out.println();
		System.out.println("===============================================");
		
		Random rnd = new Random(1234567890);
		int[] arrWin = new int[6];
		int[][] arrRank = new int[5][6];
		
		// 당첨번호
		for(int i=0; i<arrWin.length; i++) {
			arrWin[i] = rnd.nextInt(45)+1;
		}
		
		// 정렬
		for(int j=0; j<arrWin.length-1; j++) {			
			for(int i=0; i<arrWin.length-1; i++) {
				int temp = 0;
				if(arrWin[i] > arrWin[i+1]) {
					temp = arrWin[i];
					arrWin[i] = arrWin[i+1];
					arrWin[i+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arrWin) + " 당첨번호");
		System.out.println();
		
		// 당첨자
		for(int i=0; i<arrRank.length; i++) {
			for(int j=0; j<arrRank[i].length; j++) {	
				arrRank[i][j] = arrWin[j];
				switch(i) {
					case 1:
						arrRank[i][5] = arrWin[5]-5;
						break;
					case 2:
						arrRank[i][3] = arrWin[3]-5;
						break;
					case 3:
						arrRank[i][3] = arrWin[3]-5;
						arrRank[i][2] = arrWin[2]-5;
						break;
					case 4:
						arrRank[i][3] = arrWin[3]-5;
						arrRank[i][2] = arrWin[2]-5;
						arrRank[i][4] = arrWin[4]-5;						
						break;
				}
//				arrRank[i][j] = rnd.nextInt(45)+1;
			}
		}
			
		// 당첨등수 확인
		int cnt = 0;
		String rank = "1등";
		
		
		for(int i=0; i<arrRank.length; i++) {// 번호 확인 줄 반복
			// 번호 확인 누적 초기화
			cnt = 0;
			
			// 번호 검색 후 일치하면 누적 // 선형 검색
			for(int j=0; j<arrWin.length; j++) {
				for(int k=0; k<arrWin.length; k++) {
					if(arrRank[i][k] == arrWin[j]) {
						cnt++;
					}
				}
			}
			
			// 같은 번호 누적 갯수에 따른 등수 조건
			if(cnt == 6) {
				rank = "1등";
			} else if(cnt == 5) {
				if(arrRank[i][5] == arrWin[5]) {
					rank = "3등";
				} else {
					rank = "2등";
				}
			} else if(cnt == 4) {
				rank = "4등";
			} else if(cnt == 3) {
				rank = "5등";
			} else if (cnt == 0) {
				rank = "다음기회에...";
			}
			
			System.out.print(Arrays.toString(arrRank[i]));
			System.out.printf(" %s  %d개\n", rank, cnt);
		}
		
		
	}

	private static void twoBinary() {
		int num = 35;
		int binary;
		int cnt;
		int [] intArray = new int[10];
		
		for(cnt=0; num>0; cnt++) {
			binary = num%2;
			num = num/2;
			intArray[cnt] = binary;
		}
		
		for(int i=cnt-1; i>-1; i--) {
			System.out.print(intArray[i] + " ");
		}
	}

}
