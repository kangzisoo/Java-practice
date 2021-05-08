package 파일저장;



import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 크롤링연습 {

	   public static void main(String[] args) throws Exception  {
		      Connection con = Jsoup.connect("https://movie.naver.com/movie/running/current.nhn");
		      //System.out.println(con);
		      
		      //2. 연결한 사이트에 html문서를 받아오세요.
		      Document doc = con.get();
		      //System.out.println(doc);
		      Elements anav = doc.select("dt.tit  a");
		      //System.out.println(anav.size());
		      for (int i = 0; i < anav.size(); i++) {
		         System.out.println(anav.get(i).text());
		      }
	   }
}
