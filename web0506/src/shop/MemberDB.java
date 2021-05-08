package shop;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MemberDB {
	
	 public ArrayList<MemberVO> list() throws Exception  {
	      ArrayList<MemberVO> list = new ArrayList<>(); //리스트 생성
	      
	      // 1. 커넥터 사용하겠다고 설정해야함.
	      Class.forName("com.mysql.jdbc.Driver");
	      // PrintWriter out = new PrintWriter();
	      System.out.println("1. 커넥터 사용 설정 성공. <br>");

	      // 2. db연결해보자!-shop, root, 1234
	      String url = "jdbc:mysql://localhost:3306/shop";
	      // jsp에서의 자동 import: 클릭 후, 컨트롤+쉬프트+m
	      Connection con = DriverManager.getConnection(url, "root", "1234");

	      System.out.println("2. db연결 성공. <br>");

	      String sql = "select * from member";
	      PreparedStatement ps = con.prepareStatement(sql);
	      
	      System.out.println("3. SQL문을 만들기 성공. <br>");

	      // 4. SQL문을 mySQL서버로 전송함.
	      ResultSet rs = ps.executeQuery();
	      System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");
	      
	      //1. 검색결과가 있는지 체크해야한다.
	      //System.out.println(rs.next());//true이면 있다라는 얘기
	      //2. 만약에 결과가 있으면, 테이블에서 원하는 데이터항목을 꺼내주면 됨.
	      while (rs.next()) { //디비에서 값을 꺼내서 bag에 넣고, 그 가방을 다시 리스트에 넣고, 리스트를 리턴
	    	  //rs.next()를 호출할 때 마다 한 행씩 내려가서 그 행이 존재하는지 체크 : boolean
	    	  // 있으면 true, 없으면 false
	    	  // true이면 각 항목의 값들을 꺼내주어야 한다.
	         //꺼내주는 방법은 2가지, 1)항목명, 2)항목의 인덱스
	         String id2 = rs.getString("id");//"apple"
	         String pw = rs.getString(2);
	         String name = rs.getString(3);
	         String tel = rs.getString(4);

	       //가방만들어서 꺼내준 값들을 가방에 넣는다
	         MemberVO bag = new MemberVO();  
	         bag.setId(id2);
	         bag.setPw(pw);
	         bag.setName(name);
	         bag.setTel(tel);
	         
	         //가방들을 컨테이너에 하나씩 넣어준다.
	         list.add(bag);
	      }
	      return list;
	   }
	   
	
	
	public boolean check(String id, String pw) throws Exception { // 필요한 값은 id 하나 / String 매개변수
		// 1. 커넥터 연결(커넥터 사용하겠다고 설정해야함.)
		Class.forName("com.mysql.jdbc.Driver"); // D 대문자 class
		// PringWriter out = new Print Writer();
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		// 2. db 연결(db연결해보자!) - 필요한 데이터 세가지(shop, root, 1234 / db, id, pw)
		String url = "jdbc:mysql://localhost:3306/shop";
		// url 직접써도 되지만 길어서 별도로 작성 / jdbc java db connection
		// jsp에서의 자동 import: click 후 cont + shift + m
		// 포트 확인 : mysql => status, localhost => ip
		Connection con = DriverManager.getConnection(url, "root", "1234");
		// con = 참조형 변수(주소를 가진 변수), 3단계에서 사용
		System.out.println("2. db 연결 성공. <br>");

		// 3. SQL문 만들기(SQL문을 만들다.) => 해당 부품을 써서 SQL으로 인식하게 해야함.
		// String url = "http://www.naver.com"; 스트링으로 인식
		// URL url = new URL("http://www.naver.com");
		// String file = "test.hwp";
		String sql = "select * from member where id = ? and pw = ?"; // ""중복 불가 , 입력값을 가지고 올때 ? 적용
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id); // ps로 맵핑(입력값 가지고올떄)
		ps.setString(2, pw); // ps로 맵핑(입력값 가지고올떄)
		System.out.println("3. sql문을 만들기 성공. <br>");

		// 4. 전송(SQL문을 mysql 서버로 전송함.)
		ResultSet rs = ps.executeQuery(); // db에 테이블 전체를 가져옴(하나씩 꺼내기 순서 또는 컬럼명)
		System.out.println("4. sql문을 mysql서버로 전송 성공. <br>");

		boolean result = false;
		
		if (rs.next()) {
			result = true;
		}
		return result;
	}
	// CRUD 기능
	public void create(MemberVO bag) throws Exception {// 매개변수(입력값)--> 참조형변수, 네개를 가리키는 주소값
		// 1. (다운받은)커넥터 사용하겠다고 설정
		Class.forName("com.mysql.jdbc.Driver"); // Driver(클래스는 대문자)
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		// 2. db 연결 해보기 - shop(db) , root(id), 1234(pw)
		String url = "jdbc:mysql://localhost:3306/shop"; // jdbc:mysql//ip:0000/db명
		// url 너무 길어서 변수로 따로 뺌.
		Connection con = DriverManager.getConnection(url, "root", "1234");
		// 반환값이 있어서 con변수에 넣음
		System.out.println("2. DB 연결 성공. <br>");

		// 3. SQL문을 만든다.
		String sql = "insert into member values (?,?,?,?)"; // 따옴표로 구분
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bag.getId());
		ps.setString(2, bag.getPw());
		ps.setString(3, bag.getName());
		ps.setString(4, bag.getTel());
		System.out.println("3. SQL문 만들기 성공. <br>");

		// 4. SQL문을 mySQL서버로 전송
		ps.executeUpdate();
		System.out.println("4. mySQL서버로 SQL문 전송 성공. <br>");

	}

	public MemberVO read(String id) throws Exception { // 필요한 값은 id 하나 / String 매개변수
		// 1. 커넥터 연결(커넥터 사용하겠다고 설정해야함.)
		Class.forName("com.mysql.jdbc.Driver"); // D 대문자 class
		// PringWriter out = new Print Writer();
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		// 2. db 연결(db연결해보자!) - 필요한 데이터 세가지(shop, root, 1234 / db, id, pw)
		String url = "jdbc:mysql://localhost:3306/shop";
		// url 직접써도 되지만 길어서 별도로 작성 / jdbc java db connection
		// jsp에서의 자동 import: click 후 cont + shift + m
		// 포트 확인 : mysql => status, localhost => ip
		Connection con = DriverManager.getConnection(url, "root", "1234");
		// con = 참조형 변수(주소를 가진 변수), 3단계에서 사용
		System.out.println("2. db 연결 성공. <br>");

		// 3. SQL문 만들기(SQL문을 만들다.) => 해당 부품을 써서 SQL으로 인식하게 해야함.
		// String url = "http://www.naver.com"; 스트링으로 인식
		// URL url = new URL("http://www.naver.com");
		// String file = "test.hwp";
		String sql = "select * from member where id = ?"; // ""중복 불가 , 입력값을 가지고 올때 ? 적용
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id); // ps로 맵핑(입력값 가지고올떄)
		System.out.println("3. sql문을 만들기 성공. <br>");

		// 4. 전송(SQL문을 mysql 서버로 전송함.)
		ResultSet rs = ps.executeQuery(); // db에 테이블 전체를 가져옴(하나씩 꺼내기 순서 또는 컬럼명)
		System.out.println("4. sql문을 mysql서버로 전송 성공. <br>");

		// 1. 검색 결과가 있는지 체크해야 한다.
		// System.out.println(rs.next()); // true이면 있다라는 얘기
		// 2. 만약에 결과가 있으면, 테이블에서 원하는 데이터 항목을 꺼내주면 된다.
		MemberVO bag = new MemberVO(); // 가방만들기

		if (rs.next()) {
			// 꺼내주는 방법 2가지, 1) 항목명, 2) 항목의 인덱스
			String id2 = rs.getString("id");// "apple";
			String pw = rs.getString(2);
			String name = rs.getString(3);
			String tel = rs.getString(4);

			bag.setId(id2);
			bag.setPw(pw);
			bag.setName(name);
			bag.setTel(tel);
		}
		return bag;

	}

	public void update(MemberVO bag) throws Exception {// 매개변수(입력값)
		// 1. (다운받은)커넥터 사용하겠다고 설정
		Class.forName("com.mysql.jdbc.Driver"); // Driver(클래스는 대문자)
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		// 2. db 연결 해보기 - shop(db) , root(id), 1234(pw)
		String url = "jdbc:mysql://localhost:3306/shop"; // jdbc:mysql//ip:0000/db명
		// url 너무 길어서 변수로 따로 뺌.
		Connection con = DriverManager.getConnection(url, "root", "1234");
		// 반환값이 있어서 con변수에 넣음
		System.out.println("2. DB 연결 성공. <br>");

		// 3. SQL문을 만든다.
		String sql = "update member set pw = ?, tel = ? where id =?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bag.getPw());
		ps.setString(2, bag.getTel());
		ps.setString(3, bag.getId());
		System.out.println("3. SQL문 만들기 성공. <br>");

		// 4. SQL문을 mySQL서버로 전송
		ps.executeUpdate();
		System.out.println("4. mySQL서버로 SQL문 전송 성공. <br>");

	}

	public void delete(String id) throws Exception {
		// 1. 커넥터 사용하겠다고 설정해야함.
		Class.forName("com.mysql.jdbc.Driver");
		// PrintWriter out = new PrintWriter();
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		// 2. db연결해보자!-shop, root, 1234
		String url = "jdbc:mysql://localhost:3306/shop";
		// jsp에서의 자동 import: 클릭 후, 컨트롤+쉬프트+m
		Connection con = DriverManager.getConnection(url, "root", "1234");

		System.out.println("2. db연결 성공. <br>");

		String sql = "delete from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL문을 만들기 성공. <br>");

		// 4. SQL문을 mySQL서버로 전송함.
		ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL서버로 전송 성공. <br>");

	}

}
