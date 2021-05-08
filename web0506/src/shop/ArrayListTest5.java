package shop;

import java.util.ArrayList;

public class ArrayListTest5 {

	public static void main(String[] args) {
		ArrayList<BoardVO> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			BoardVO bag = new BoardVO(); //가방 만들기
			
			//빈 가방에 데이터 넣기
			bag.setId(String.valueOf(i));
			bag.setTitle(i + "");
			bag.setContent(String.valueOf(i));
			bag.setWriter(i + "");
			
			//채워진 가방을 list에 넣기
			list.add(bag);
			
		}
		System.out.println("리스트 안 가방의 개수는 " + list.size() + "개");
		
		for (int i = 0; i < list.size(); i++) {
			BoardVO bag2 = list.get(i); //리스트에서 꺼내서 bag2에 넣기
			//bag2 에 있는 데이터들을 하나씩 꺼내기
			System.out.println("가방에서 꺼낸 id는 " + bag2.getId());
			System.out.println("가방에서 꺼낸 title는 " + bag2.getTitle());
			System.out.println("가방에서 꺼낸 content은 " + bag2.getContent());
			System.out.println("가방에서 꺼낸 writer은 " + bag2.getWriter());
			System.out.println();
		}

	}

}
