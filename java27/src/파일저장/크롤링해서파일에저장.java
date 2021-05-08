package 파일저장;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링해서파일에저장 {

	public static void main(String[] args) throws IOException {
		String[] code = {"005360", "005930", "068270"};
		String[] company = {"모나미", "삼성전자", "셀트리온"};
		
		for (int i = 0; i < company.length; i++) {
			Document doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + code[i]).get();
			Elements elist = doc.select("span.blind");
			System.out.println(company[i]);
			System.out.println("-----------------");
//			System.out.println(elist);
			
			String today = elist.get(12).text();
			System.out.println("오늘: " + today);
			String yesterday = elist.get(15).text();
			System.out.println("어제: " + yesterday);
			String high = elist.get(16).text();
			System.out.println("고가: " + high);
			System.out.println();
			
			Elements elist2 = doc.select("div.wrap_company h2 a");
			System.out.println(elist2.get(0).text());
			
			FileWriter f = new FileWriter("d:/data/크롤링과제.txt");
			
			for (Element el : elist2.select("div")) {
				System.out.println();
				try {
					//해당 폴더와 스트림(연결=통로)을 만든다.
					//스트림의 특징은 한방향!!
					//절대경로 : 위치를 나타낼때 맨 앞에서부터 쭉 써주는 경로
					//상대경로 : 현재위치를 기준해서 상대적으로 써주는 경로
					f.write(elist2.get(0).text());
					f.close(); //스트림을 다 쓴 후 반드시 자원 해제 해줘야 함.!
				} catch (IOException e) {
					System.out.println("파일로 저장 중 에러발생");
					System.out.println("에러 정보는 " + e.getMessage());
				}
				
			}
		}

	}

}
