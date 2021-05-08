package 배열기본;

import java.util.Random;
//import 생성: 자동완성, 마우스올리기, F2누르기
//많은 양의 자동import: Ctrl + Shift + o(영문)

public class 랜덤값생성 {

	public static void main(String[] args) {
		Random r = new Random(); //seed값 넣으면 고정랜덤값
		int[] num = new int[1000]; //num이라는 정수배열 생성하기(1000개 저장공간)
		for (int i = 0; i < num.length; i++) { //index가 0~999까지 반복, 배열의 길이만큼
			num[i] = r.nextInt(1000); //0~1000 사이의 정수 난수 생성해서 배열에 넣어라
		}
		for (int x : num) { //num 배열에 있는 변수들 모두 각각 반복
			System.out.print(x + " ");	
		}
		System.out.println();
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		int count0 = 0;
		for (int x : num) { // ~이상 갯수니까 위부터 잘라내기 *범위*
//			
			if(x >= 600) { //num 배열 안의 변수 중 600이상이면 count
				count6++;
			}else if(x >= 500){//나머지 num배열 안의 변수 중 500이상이면 count
				count5++;
			}else if(x >= 400){//나머지 num배열 안의 변수 중 400이상이면 count
				count4++;				
			}else if(x >= 300) {//나머지 num배열 안의 변수 중 300이상이면 count
				count3++;
			}else {
				count0++;
			}
		} //이제 개수 센거 출력하기
		System.out.println("300이상의 개수>> " + count3);
		System.out.println("400이상의 개수>> " + count4);
		System.out.println("500이상의 개수>> " + count5);
		System.out.println("600이상의 개수>> " + count6);
		//전체 몇개인지 한번 더 확인 (300이상도 아닌 나머지 count0) 
		System.out.println(count3+count4+count5+count6+count0);
	}

}
