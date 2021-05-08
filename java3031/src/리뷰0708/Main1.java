package 리뷰0708;

public class Main1 {

	public static void main(String[] args) {
		Truck 트럭 = new Truck();
		트럭.type = "덤프"; //Truck
		트럭.color = "red"; //Car
		트럭.name = "A"; //Car
		트럭.stop();//Car
		System.out.print(트럭.color + " 색상의 " + 트럭.type + 트럭.name + "에 ");
		트럭.싣다();//Truck
		
		Sedan 세단 = new Sedan();
		세단.연식 = 2019; //Sedan
		세단.color = "black"; //Car
		세단.name = "B";//Car
		System.out.print("연식이 " + 세단.연식 +"인 " + 세단.color + "색상의 " + 세단.name + "가 ");
		세단.주유하다(); //Sedan
		세단.drive(); //Car
				
	}

}
