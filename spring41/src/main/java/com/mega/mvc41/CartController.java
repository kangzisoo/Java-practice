package com.mega.mvc41;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CartController {

	@Autowired //싱글톤으로 만든 주소 넣어주세요.!(주입, Injection)
	CartDAO dao;
	
	@RequestMapping("select")
	public void select(CartVO cartVO, Model model) {
		CartVO vo = dao.read(cartVO);
		//views까지 검색된 정보를 가지고 가야한다.
		//model로 속성으로만 등록하면 됨.
		model.addAttribute("vo", vo);
	}
	
	@RequestMapping("insert10") //가상주소
	public void insert(CartVO cartVO) throws Exception {
					  //프로토타입으로 객체 생성해줌
		//bbsVO를 model속성으로 자동 등록해줌.
		//model.addAttirbute("bbsVO", bbsVO);
		dao.create(cartVO);		
				  //싱글톤
	}
}
