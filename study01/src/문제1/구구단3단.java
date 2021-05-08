package 문제1;

public class 구구단3단 {//구구단3단에서 4의배수 제외하고 출력

	public static void main(String[] args) {
		for (int i = 1	; i < 10; i++) {
			if(i%4==0) { //4의 배수 제외
				
			}else {
			System.out.println(3 + "x" + i + "=" + (3*i));
			}
		}
	}

}
