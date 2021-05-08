package 파일저장;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 크롤링연습1 {

	public static void main(String[] args) throws IOException {
		String[] code = {"005360", "005930", "068270"};
		String[] company = {"모나미", "삼성전자", "셀트리온"};
		
		for (int i = 0; i < company.length; i++) {
			Document doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + code[i]).get();
			Elements elist = doc.select("span.blind");
			System.out.println(company[i]);
			System.out.println("-----------------");
			
			String today = elist.get(12).text();
			System.out.println("오늘: " + today);
			String yesterday = elist.get(15).text();
			System.out.println("어제: " + yesterday);
			String high = elist.get(16).text();
			System.out.println("고가: " + high);
			System.out.println();
			
			Elements elist2 = doc.select("div.wrap_company h2 a");
			System.out.println(elist2.get(0).text());
		}

	}

}
