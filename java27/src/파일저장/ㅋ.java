package 파일저장;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ㅋ {
	public static void main(String[] args) {
		String url = "https://finance.naver.com";
		// 가져오고 싶은 정보가 있는 웹페이지의 url
		Document doc = null;
		try {
			doc = Jsoup.connect(url).get(); // Document에 url 페이지의 데이터를 가져온다.
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 타이틀 가져오기

		String title = doc.select("div.com_header").text().substring(0, 7);
		// 클래스 이름으로 가져오기

		// 2. 주요 헤드라인들 가져오기
		Elements element = doc.select("ul.hdline_article_list");
		// newsnow클래스를 저장
		ArrayList<String> hdns = new ArrayList<String>();

		System.out.println("============================================");
		System.out.println(title);// 타이틀 출력
		System.out.println("============================================");
		for (Element el : element.select("li")) {
			System.out.println(el.text());
		};
	}
}
