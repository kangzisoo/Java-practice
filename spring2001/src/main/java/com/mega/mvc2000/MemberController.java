package com.mega.mvc2000;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	@RequestMapping("delete.mega")
	public void delete(MemberVO bag, MemberDAO2 dao) throws Exception { //VO 사용
//	public void delete(String id, String pw) {
		dao.delete(bag);
		System.out.println("내가 호출됨...!!");
		System.out.println("나는 컨트롤 하는 메서드");
		System.out.println("컨트롤러에서 받은 id: " + bag.getId());
		System.out.println("컨트롤러에서 받은 pw: " + bag.getPw());
	}
	
	@RequestMapping("insert.mega")
	public void insert(MemberVO bag, MemberDAO2 dao) throws Exception { //VO 사용
//	public void insert(String id, String pw, String name, String tel) {
		dao.create(bag);
		System.out.println("내가 호출됨...!!");
		System.out.println("나는 컨트롤 하는 메서드");
		System.out.println("컨트롤러에서 받은 id: " + bag.getId());
		System.out.println("컨트롤러에서 받은 pw: " + bag.getPw());
		System.out.println("컨트롤러에서 받은 name: " + bag.getName());
		System.out.println("컨트롤러에서 받은 tel: " + bag.getTel());
	}
	
	@RequestMapping("login.mega")
	//login.까지만 인식해서 views아래의 jsp파일로 넘어감
	public String login(String id, String pw) {
		System.out.println("내가 호출됨...!!");
		System.out.println("나는 컨트롤 하는 메서드");
		System.out.println("컨트롤러에서 받은 id: " + id);
		System.out.println("컨트롤러에서 받은 pw: " + pw);
		
		boolean result = false;
		if(id.equals("root")&&pw.contentEquals("1234")) {
			result=true;
		}
		if(result) {
			return "ok"; //views 아래에 있는 ok.jsp 호출
		}else
			return "no"; //views 아래에 있는 no.jsp 호출
	}
	
	
}
