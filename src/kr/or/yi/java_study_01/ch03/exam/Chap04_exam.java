package kr.or.yi.java_study_01.ch03.exam;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Chap04_exam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		exam04(sc);
//		exam05(sc);
//		exam06(sc);
//		exam07();
//		exam08(sc);
//		exam09();
//		exam14(sc);
//		exam15(sc);
		
		String com[] = {"가위", "바위", "보"};
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		String res;
		int comResIdx;
		do {
			System.out.println("가위 바위 보!>> ");
			res = sc.nextLine();
			if(res.equals("그만")) {
				System.out.println("프로그램 종료");
				break;
			}
			
			comResIdx = (int)(Math.random()*3);
			System.out.printf("사용자 : %s 컴퓨터 : %s%n", res, com[comResIdx]);
			resultWinOrLose(res, com[comResIdx]);
		}while(true);
		
		
		
		
		
		sc.close();		
	}

	private static void resultWinOrLose(String user, String com) {
		if(user.equals("가위")) {
			if(com.equals("가위")) {
				System.out.println("비김");
			} else if(com.equals("바위")) {
				System.out.println("컴퓨터가 이겼음");
			} else {
				System.out.println("사용자가 이겼음");
			}
		} else if(user.equals("바위")) {
			if(com.equals("가위")) {
				System.out.println("사용자가 이겼음");
			} else if(com.equals("바위")) {
				System.out.println("비김");
			} else {
				System.out.println("컴퓨터가 이겼음");
			}
		} else if(user.equals("보")) {
			if(com.equals("가위")) {
				System.out.println("컴퓨터가 이겼음");
			} else if(com.equals("바위")) {
				System.out.println("사용자가 이겼음");
			} else {
				System.out.println("비김");
			}
		}
	}

	private static void exam15(Scanner sc) {
		System.out.print("곱하고자 하는 두 수 입력 >> ");
		do {			
			try {
				int n = sc.nextInt();
				int m = sc.nextInt();
				System.out.print(n + "x" + m + "=" + n*m);
			}catch(InputMismatchException e) {
				System.out.println("실수는 입력하면 안됩니다.");
				sc.nextLine();
			}
		}while(true);
	}

	private static void exam14(Scanner sc) {
		String[] course = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int [] score = {95, 88, 76, 62, 55};
		
		String subj;
		int findIdx;
		while(true) {
			System.out.print("과목 이름 >> ");
			subj = sc.next();
			if(subj.equals("그만")) {
				break;
			}
			findIdx = find(subj, course);
			if(findIdx == -1) {
				System.out.println("없는 과목");
				continue;
			}
			System.out.printf("%s 과목의 점수는 %d%n", subj, score[findIdx]);
		}
	}

	private static int find(String subj, String[] course) {
		for(int i=0; i<course.length; i++) {
			if(subj.equals(course[i])) {
				return i;
			}
		}
		return -1;
	}

	private static void exam09() {
		int[][] intArray = new int[4][4];
		for(int row = 0; row<intArray.length; row++) {
			for(int col=0; col<intArray[row].length; col++) {
				intArray[row][col] = (int)(Math.random()*10) + 1;
			}
		}
		for(int[] rows : intArray) {
			for(int e : rows) {
				System.out.print(e + " ");
			}
			System.out.println();
		}
	}

	private static void exam08(Scanner sc) {
		System.out.print("정수 몇개?");
		int n = sc.nextInt();
		if(n<=1 || n>100) {
			System.out.println("1~100사이로 입력");
			sc.close();
			return; //프로그램 종료
		}
		
		int [] intArray = new int[n];
		int r;
		for(int i=0; i<intArray.length; i++) {
			r = (int)(Math.random()*100)+1;
			// 중복확인
			if(isDuplicate(r, intArray, i)) {
				i--;
				continue;
			}
			intArray[i] = r;
		}
		
		//sort : 정렬 API
		Arrays.sort(intArray);
		for(int e : intArray) {
			System.out.print(e + " ");
		}
	}

	private static boolean isDuplicate(int key, int[] intArray, int i) {
		if(i<0) return false;
		for(int start = i; start>-1; start--) {
			if(intArray[start]==key) {
				return true;
			}
		}
		return false;
	}

	private static void exam07() {
		int [] intArray = new int[10];
		System.out.println(Arrays.toString(intArray));
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = (int)(Math.random() * 10)+1;
		}
		System.out.println(Arrays.toString(intArray));
		int sum = 0;
		for(int e : intArray) {
			System.out.println(e + " ");
			sum += e;
		}
		// 평균 합/갯수
		System.out.printf("평균은 %.1f%n", (double)sum/intArray.length);
	}

	private static void exam06(Scanner sc) {
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		System.out.print("금액을 입력하시오 >> ");
		int money = sc.nextInt();
		for(int i=0; i<unit.length; i++) {
			int res = money/unit[i];
			if(res > 0) {
				System.out.println(unit[i] + "원 짜리 : " + res + "개");
				money = money % unit[i];
			}
		}
	}

	private static void exam05(Scanner sc) {
		int[] intArray = new int[10];
		System.out.print("양의 정수 10개를 입력하시오 >> ");
		for(int i=0; i<intArray.length;i++) {
			intArray[i] = sc.nextInt();
		}
		System.out.print("\n3의 배수는 ");
		for(int i=0; i<intArray.length; i++){
			if(intArray[i] % 3 == 0) {
				System.out.printf("%d ", intArray[i]);
			}
		}
	}

	private static void exam04(Scanner sc) {
		System.out.println("알파벳 하나만 입력 >> ");
		String s = sc.next();
		if(s.length() != 1) {
			System.out.println("알파벳 하나만 입력하세요.");
			sc.close();
			return;
		}
		
		char ch = s.charAt(0);
		if(ch <'a' || ch > 'z') {
			System.out.println("알파벳 소문자만 입력하세요.");
			sc.close();
			return;
		}
		
		for(char i=ch; i>='a'; i--) {
			for(char j='a'; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
