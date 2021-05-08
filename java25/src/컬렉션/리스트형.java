package 컬렉션;

import java.util.ArrayList;

public class 리스트형 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//순서가 의미있는 데이터들의 모음.
		list.add("먹기");
		list.add("마시기");
		list.add("운동하기");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));		
		}
		for (Object o : list) {
			System.out.println(o);
		}
		System.out.println(list); //ArrayList 생성할 때, 주소 대신에 toString을 오버라이드 해둔 것..
		list.remove(0);
		System.out.println(list);
		list.add(1, "쉬기"); //1번 앞에 끼워넣기.
		System.out.println(list);
		System.out.println(list.size());
		
		list.set(1, "진짜쉬기"); //값을 바꿔줄때 set
		System.out.println(list);
		

	}

}
