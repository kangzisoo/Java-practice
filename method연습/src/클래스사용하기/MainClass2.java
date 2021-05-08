package 클래스사용하기;

import java.util.ArrayList;

import 클래스만들기.BbsVO;
import 클래스만들기.게시판;

public class MainClass2 {

	public static void main(String[] args) {
		게시판 bbs = new 게시판();
		
		String r1 = bbs.get("java", "java is fun.!");
		System.out.println(r1);
		System.out.println("-------------------------------");
		
		String[] l1 = bbs.get();
		System.out.println("for");
		for (int i = 0; i < l1.length; i++) {
			System.out.println(l1[i]);
		}
		System.out.println("for-each");
		for (String x : l1) {
			System.out.println(x);
		}
		System.out.println("-------------------------------");
		
		ArrayList<BbsVO> all = bbs.get(5);
		System.out.println("for");
		for (int i = 0; i < all.size(); i++) {
			BbsVO bbsVO = all.get(i);
			System.out.println(bbsVO);
		}
		System.out.println("for-each");
		for (BbsVO bbsVO : all) {
			System.out.println(bbsVO);
		}
	}

}
