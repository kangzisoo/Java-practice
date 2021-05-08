package com.mega.mvc43;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 어노테이션, 표시
public class MemberController {

	@Autowired
	MemberDAO dao; // 싱글톤으로 만들어진 객체의 주소를 넣어주세요.

	@RequestMapping("insert.mega")
	public void insert(MemberVO bag) throws Exception {
		System.out.println("(싱글톤)dao의 주소 >>" + dao);
		System.out.println("(프로토타입)vo의 주소 >>" + bag);
		dao.create(bag);
	}

	@RequestMapping("login")
	public void login(MemberVO bag, HttpSession session) {
		MemberVO vo = dao.login(bag);
		if (vo != null) {
			System.out.println("해당 id/pw가 있음.");
			session.setAttribute("userId", vo.getId());

		} else {
			System.out.println("해당 id/pw가 없음.");
		}
	}

}
