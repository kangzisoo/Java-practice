package 컬렉션;

import java.util.HashSet;

public class 컬렉션연습1 {

	public static void main(String[] args) {
		//1. 팀을 구성하려고 한다. 한명씩만 필요하다. => set
		HashSet team = new HashSet();
		team.add("디자이너");
		team.add("프로그래머");
		team.add("DB관리자");
		System.out.println(team);
	}

}
