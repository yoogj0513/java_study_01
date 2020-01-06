package kr.or.yi.java_study_01.ch04;

import java.util.Arrays;

public class Ch04Main02 {

	public static void main(String[] args) {
//		Circle[] circleArr = new Circle[5];

//		System.out.println(Arrays.toString(circleArr)); //[null, null, null, null, null]
		
		//circleArr[0] = new Circle(1, "자바피자");
//		System.out.println(Arrays.toString(circleArr));//[반지름 : 1, 제품명 : 자바피자, 면적 : 3.14, null, null, null, null] //0번째에 toString 실행됨
		
		
		Circle[] circleArr = {new Circle(1, "자바"), new Circle(2, "피자"), new Circle(3, "고르곤"), null, null};
//		System.out.println(Arrays.toString(circleArr));
		prnArr(circleArr);
		// 추가
		System.out.println("========== 추가 ==========");
		int idx = 2;
		circleArr[++idx] = new Circle(5, "빅 피자");
		prnArr(circleArr);
		
		//삭제
		System.out.println("========== 삭제 ==========");
		int delNum = 1;
		circleArr[delNum] = null;
		for(int i = delNum; i<circleArr.length-1; i++) {
			circleArr[i] = circleArr[i+1];
		}
		prnArr(circleArr);
		
		//수정
		System.out.println("========== 수정 ==========");
		// radius = 4, name = "치즈피자" index=0
		circleArr[0].setRadius(4);
		circleArr[0].setName("치즈피자");
		prnArr(circleArr);
		
	}

	private static void prnArr(Circle[] circleArr) {
		for (Circle c : circleArr) {
			try {
				System.out.println(c); // 0번째 이후엔 null이라 에러가 뜸

			} catch (NullPointerException e) {
				System.out.print("null ");
			}
		}
		
	}

}
