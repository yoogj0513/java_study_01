package kr.or.yi.java_study_01.ch04;

import java.util.Arrays;

public class Ch04Main02 {

	public static void main(String[] args) {
//		Circle[] circleArr = new Circle[5];

//		System.out.println(Arrays.toString(circleArr)); //[null, null, null, null, null]
		
		//circleArr[0] = new Circle(1, "�ڹ�����");
//		System.out.println(Arrays.toString(circleArr));//[������ : 1, ��ǰ�� : �ڹ�����, ���� : 3.14, null, null, null, null] //0��°�� toString �����
		
		
		Circle[] circleArr = {new Circle(1, "�ڹ�"), new Circle(2, "����"), new Circle(3, "����"), null, null};
//		System.out.println(Arrays.toString(circleArr));
		prnArr(circleArr);
		// �߰�
		System.out.println("========== �߰� ==========");
		int idx = 2;
		circleArr[++idx] = new Circle(5, "�� ����");
		prnArr(circleArr);
		
		//����
		System.out.println("========== ���� ==========");
		int delNum = 1;
		circleArr[delNum] = null;
		for(int i = delNum; i<circleArr.length-1; i++) {
			circleArr[i] = circleArr[i+1];
		}
		prnArr(circleArr);
		
		//����
		System.out.println("========== ���� ==========");
		// radius = 4, name = "ġ������" index=0
		circleArr[0].setRadius(4);
		circleArr[0].setName("ġ������");
		prnArr(circleArr);
		
	}

	private static void prnArr(Circle[] circleArr) {
		for (Circle c : circleArr) {
			try {
				System.out.println(c); // 0��° ���Ŀ� null�̶� ������ ��

			} catch (NullPointerException e) {
				System.out.print("null ");
			}
		}
		
	}

}
