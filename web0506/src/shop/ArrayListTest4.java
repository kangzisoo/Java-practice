package shop;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListTest4 {

	public static void main(String[] args) {
		ArrayList<MemberVO> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			//가방을 만들어서
			MemberVO bag = new MemberVO();
			//가방에 값들을 넣은 다음에
			bag.setId(String.valueOf(i)); //int를 string으로 바꾸기
			bag.setPw(i + ""); //int를 String으로 바꾸기(2)
			bag.setName(i + "");
			bag.setTel(i + "");
			//list에 가방을 넣음.
			list.add(bag);
		}
		System.out.println("리스트 안에 가방 개수는 " + list.size() + "개");
		
		for (int i = 0; i < list.size(); i++) {
			MemberVO bag2 = list.get(i); //꺼내기
			System.out.println("가방에서 꺼낸 id는 " + bag2.getId());
			System.out.println("가방에서 꺼낸 pw는 " + bag2.getPw());
			System.out.println("가방에서 꺼낸 name은 " + bag2.getName());
			System.out.println("가방에서 꺼낸 tel은 " + bag2.getTel());
			System.out.println();
		}
	}
	

}
