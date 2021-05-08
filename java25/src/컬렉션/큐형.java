package 컬렉션;

import java.util.LinkedList;

public class 큐형 {

	public static void main(String[] args) {
		
		LinkedList milk = new LinkedList();
		//FIFO, 대기줄형	<=> FILO
		milk.add("상한우유");
		milk.add("오늘우유");
		milk.add("내일우유");
		System.out.println(milk);
		milk.remove();
		System.out.println(milk);
		milk.remove();
		System.out.println(milk);
	}

}
