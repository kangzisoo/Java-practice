package 형변환;

import java.util.ArrayList;
import java.util.Random;

public class 참조형형변환5 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//Object로 자동형변환.!
		//Object이면 안에 모든 것이 다 들어갈 수 있음.
		list.add("홍길동"); //0번 index
		list.add(100); //int(기본형)-object의 상속관계는 없음.
		//int(기본형) --auto-boxing--> Integer(참조형) --upcasting--> Object
		list.add(11.22); //object-참조형 상속관계 있음.
		
		int num = (Integer)list.get(1); //다운캐스팅
		//int(기본형) <--auto-unboxing-- Integer(참조형) <--downcasting-- Object
		
		System.out.println(list);
	}

}
