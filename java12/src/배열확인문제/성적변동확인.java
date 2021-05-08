package 배열확인문제;

public class 성적변동확인 {

	public static void main(String[] args) {
		String[] title = {"국어", "수학", "영어", "과학", "컴퓨터"};
		int[] term1 = {100, 90, 70, 30, 50};
		//1학기, 2학기 점수 목록이 별도로 있어야 하므로 깊은 복사 필요.!
		int[] term2 = term1.clone(); //깊은 복사
		term2[3] = 55;
		term2[4] = 77; //2학기 성적의 값만 변경
		
		System.out.print("1학기 성적 : ");
		for (int a : term1) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		System.out.print("2학기 성적 : ");
		for (int a : term2) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		//두 배열 비교해서 성적 향상된 과목만 count
		int count = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term2[i] > term1[i]) {
				System.out.println(title[i] + " 성적 향상!");
				count++;
			}
			
		}
		System.out.println("성적이 향상된 과목의 수 : " + count);
	}

}
