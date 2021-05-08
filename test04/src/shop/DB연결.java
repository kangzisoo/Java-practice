package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DB연결 {
   
   public static void main(String[] args) throws Exception {
      String id = "window";
      String pw = "window";
      String name = "window";
      String tel = "window";
      //1. 커넥터 사용 설정
      Class.forName("com.mysql.jdbc.Driver");
      //2. db연결
      String url = "jdbc:mysql://localhost:3306/test04";
      Connection con = DriverManager.getConnection(url, "root", "1234");
      //  db연결하기 위한 url 및 값 입력
      String sql = "insert into member values (?, ?, ?, ?)";
      PreparedStatement ps = con.prepareStatement(sql);
      ps.setString(1, id);
      ps.setString(2, pw);
      ps.setString(3, name);
      ps.setString(4, tel);
      
      ps.executeUpdate();
            
   }

}