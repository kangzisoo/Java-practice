package substring;

import java.io.BufferedReader; //BufferedReader를 사용하기 위해 import
import java.io.InputStreamReader; //BufferedReader를 사용하기 위해 import
//import java.util.Scanner;

public class Solution01 {
	
	//키보드의 입력이 있을 때마다 즉시 전달되는 입력과 다르게
	//입력이 있을 때마다 한문자씩 버퍼에 담아뒀다가,
	//개행문자(Enter)가 나타나면, 버퍼 안의 내용을 한번에 전송함.
	//Scanner보다 처리속도가 빠름

	public static void main(String[] args) throws Exception{ ////BufferedReader를 사용하기 위해 예외처리
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		Scanner scan = new Scanner(System.in); //스캐너 사용 시
		System.out.print("문자열 입력>> ");
		String input = br.readLine(); //문자열을 입력받음
//		String input = scan.nextLine(); //스캐너 사용 시

		System.out.print("a번째 문자부터 b개의 문자를 잘라 새로운 문자열을 만들어보자.('a b'입력) >> ");
		String input2 = br.readLine(); //두 숫자를 입력받음
		int a = Integer.parseInt(input2.split(" ")[0]); //공백을 기준으로 잘라서  각 index0과
		int b = Integer.parseInt(input2.split(" ")[1]); //index1 값을  a와 b에 대입함.
		
		//substring화 된 문자열의 길이 = (끝index - 시작index)
		//문제에서는 순번을 1부터 계산하므로 a번째 -> index a-1
		//b는 '시작점으로부터 자를 문자의 수'이므로 => 잘라진 문자열의 길이 -> a-1+b
		String sub2 = input.substring(a-1, a-1+b);
		System.out.println(sub2);

	}

}
