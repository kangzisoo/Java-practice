package 파일저장;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 파일에저장 {
	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog("날짜 입력");
		String s2 = JOptionPane.showInputDialog("제목 입력");
		String s3 = JOptionPane.showInputDialog("내용 입력");
		
		try {
			//해당 폴더와 스트림(연결=통로)을 만든다.
			//스트림의 특징은 한방향!!
			FileWriter f = new FileWriter("d:\\data\\" + s1 + ".txt");
//			FileWriter f = new FileWriter("d:/data/" + s1 + ".txt");
			//절대경로 : 위치를 나타낼때 맨 앞에서부터 쭉 써주는 경로
			//상대경로 : 현재위치를 기준해서 상대적으로 써주는 경로
			f.write(s1 + "\n");
			f.write(s2 + "\n");
			f.write(s3 + "\n");
			f.close(); //스트림을 다 쓴 후 반드시 자원 해제 해줘야 함.!
		} catch (IOException e) {
			System.out.println("파일로 저장 중 에러발생");
			System.out.println("에러 정보는 " + e.getMessage());
		}
	}
}
