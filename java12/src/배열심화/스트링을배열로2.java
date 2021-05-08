package 배열심화;

public class 스트링을배열로2 {

	public static void main(String[] args) {
		String all = "국어, 영어, 수학, 컴퓨터";
		//1. String[]로 바꿔보세요.
		String[] all2 = all.split(",");

		//2. 공백이 포함되어 있다면, 공백을 모두 제거 후 다시 배열에 넣으세요
		for (int i = 0; i < all2.length; i++) {
			all2[i] = all2[i].trim();
		}
				
		for (String s : all2) {
			System.out.print(s + " ");
		}
		//3. 과목 수는?
		System.out.println();
		System.out.println("과목의 수는 " + all2.length);
		
		//4. 컴퓨터의 위치는?		
		int count = 0;
		for (int i = 0; i < all2.length; i++) {
			if (all2[i].equals("컴퓨터")) {
				System.out.println("컴퓨터의 위치는 index " + i);
			}
		//5. 과목명이 3글자 미만인 과목수는?
			if (all2[i].length() < 3) {
				count++;
			}
		}//for문 끝.
		System.out.println("과목명이 3글자 미만인 과목 수는 " + count);
		
		System.out.println();
		String s = "나는 프로그래머야";
		String s2 = "진짜!!";
		System.out.println(s + s2);//스트링 결합
		System.out.println(s.concat(s2));//스트링 결합
		System.out.println(s.charAt(0));//문자1글자 추출
		System.out.println(s.endsWith("야"));//특정한 문자로 끝나는지 확인
		System.out.println(s.substring(3));//인덱스3이후 글자들 모두 추출
		System.out.println(s.substring(3, 8));//인덱스 3~7까지 추출
		System.out.println(s.contains(s2));//s에 s2가 포함되어 있는가?
		System.out.println(s.lastIndexOf("프"));//s중 글자"프"의 위치
		System.out.println(s.toUpperCase());//대문자로
		System.out.println(s.toLowerCase());//소문자로
		System.out.println(s.length());//글자수	
		System.out.println(s.replace("나", "너"));//나를 너로 변경

	}

}
