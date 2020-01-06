package kr.or.yi.java_study_01.ch04;

public class Book {
	String title;
	String author;

	public Book(String title) {
		this.title = title;
		this.author = "작자미상";
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public Book() {
//		super(); //생략 가능, 있으면 상호오류가 남
		this("춘향뎐", "작자미상");
		System.out.println("매개변수가 없는 생성자");
//		this("춘향뎐", "작자미상"); // 기본값을 초기화 / 첫 줄이 아니라서 에러나 뜸
	}

	@Override
	public String toString() {
		return String.format("Book [title=%s, author=%s]", title, author);
	}
	
	
	
	
}
