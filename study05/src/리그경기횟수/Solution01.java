package 리그경기횟수;

import java.util.Scanner;

public class Solution01 {

	public static void main(String[] args) {
		int n = 0; //팀의 수
		int a = 0; //경기의 수
		//입력
		Scanner scan = new Scanner(System.in);
		System.out.print("리그에 참여하는 팀의 수를 입력하세요 >> ");
		n = scan.nextInt();
		// 출력
		// n개의 팀 => n
		// 자기 자신과는 경기하지 않음 => n-1
		// 한 리그는 두 팀끼리 이루어지므로 => 나누기 2
		a = n * (n-1) / 2 ;
		// 리그에 참여하는 팀의 수가 n팀이면 a경기가 치루어 진다.
		System.out.println(a);
		scan.close();
	}

}
