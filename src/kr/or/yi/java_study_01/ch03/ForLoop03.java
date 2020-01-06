package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class ForLoop03 {
	public static void main(String[] args) {
		
		mult01(5);
		
		System.out.println();
		
		extracted(5);
		
		System.out.println();
		
//		5! = 1 * 2 * 3 * 4 * 5 = 120
		fac01(5);
		
	}
	
	private static void fac01(int fac) {
		int res = 1;
		System.out.printf("%d!= ", fac);
		for (int i=1; i < fac+1; i++) {
			res = res * i;
			System.out.printf("%d %s ", i, i == fac? "=" : "*");
		}
		System.out.printf("%d", res);
	}
	
	// 내가 푼 거 
	private static void extracted(int cnt) {
		int res = cnt;
		int i = 0;
		System.out.printf("%d!= ", res);
		for(i=1; i < cnt; i++) {
			System.out.printf("%d * ", i);
			res = res*i;
		}
		System.out.printf("%d = %d", i, res);
	}

	private static void mult01(int cnt) {
		int res = cnt;
		int i = 0;
		System.out.printf("%d!= %d * ", res, res);
		for(i=cnt-1; i > 0; i--) {
			System.out.printf("%d %s ", i, i > 1 ? "*" : "=");
			res = res * i;
		}
		System.out.printf("%d", res);
	}
}
