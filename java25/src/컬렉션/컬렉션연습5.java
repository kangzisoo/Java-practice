package 컬렉션;

import java.util.LinkedList;

public class 컬렉션연습5 {

	public static void main(String[] args) {
		//시험 1~4일차 => 큐형 (First Input First Output)
		LinkedList subject = new LinkedList();
		subject.add("국어");
		subject.add("수학");
		subject.add("영어");
		subject.add("컴퓨터");
		System.out.println("전체 시험볼 과목: " + subject);
		subject.remove();
		System.out.println("1일차 시험본 후 남은 과목: " + subject);
		subject.remove();
		System.out.println("2일차 시험본 후 남은 과목: " + subject);
		subject.remove();
		System.out.println("3일차 시험본 후 남은 과목: " + subject);
		

	}

}
