package kr.or.yi.java_study_01.ch02;

// 패키지가 다른 클래스 불러오는 것
import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		System.out.print("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요. >> ");
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		String city = sc.next();
		int age = sc.nextInt();
		double weight = sc.nextDouble();
		boolean isSingle = sc.nextBoolean();
		System.out.printf("이름:%s / 도시:%s / 나이:%d / 체중:%.2f / 독신여부:%b %n",
						   name, city, age, weight, isSingle);
		sc.close();
		
		//System.out.println(sc.nextLine());
	}

}
