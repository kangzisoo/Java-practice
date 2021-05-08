package 리뷰0708;

public class Main2 {

	public static void main(String[] args) {
		음식 food = new 음식();
		food.인분 = 2;//음식
		food.먹다();//음식
		
		떡볶이 떡볶이1 = new 떡볶이();
		떡볶이1.인분 = 1;//음식
		떡볶이1.type = "궁중";//떡볶이
		떡볶이1.요리하다();//한식
		
		갈비찜 갈비찜1 = new 갈비찜();
		갈비찜1.당면유무 = true;//갈비찜
		갈비찜1.포장하다();//갈비찜
		갈비찜1.먹다();//음식
				
	}

}
