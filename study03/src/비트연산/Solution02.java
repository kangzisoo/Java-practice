package 비트연산;

import java.io.BufferedReader; //BufferedReader를 사용하기 위해 import
import java.io.InputStreamReader; //BufferedReader를 사용하기 위해 import
//import java.util.Scanner;

public class Solution02 {

	public static void main(String[] args) throws Exception { ///BufferedReader를 사용하기 위해 예외처리
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		Scanner scan = new Scanner(System.in); //스캐너 사용 시
		System.out.print("0 또는 1 중에 두 수를 입력하세요.(a b)>> ");
		String input = br.readLine();
//		String input = scan.nextLine(); //스캐너 사용 시
		
		int a = Integer.parseInt(input.split(" ")[0]); //공백을 기준으로 잘라서  각 index0과
		int b = Integer.parseInt(input.split(" ")[1]); //index1 값을  a와 b에 대입함.
		
		//입력받은 두 수의 비트연산 결과
		System.out.println(a & b); //AND : 두 수가 모두 1인 경우
		System.out.println(a | b); //OR : 두 수 중 하나라도 1인 경우
		System.out.println(a ^ b); //XOR : 두 수가 다르면 1, 같으면 0
		
	}

}
