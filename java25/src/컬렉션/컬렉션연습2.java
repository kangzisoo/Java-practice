package 컬렉션;

import java.util.LinkedList;

public class 컬렉션연습2 {

	public static void main(String[] args) {
		//2. 어제우유 오늘우유 FIFO => 큐형(Queue)
		LinkedList milk = new LinkedList();
		milk.add("상한우유");
		milk.add("싱싱우유");
		System.out.println(milk);
		milk.remove();
		System.out.println(milk);
	}

}
