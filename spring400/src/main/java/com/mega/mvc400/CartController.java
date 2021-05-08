package com.mega.mvc400;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CartController {

	@Autowired //싱글톤으로 만든 주소 넣어주세요.!(주입, Injection)
	CartDAO dao;
	
	@RequestMapping("input") //가상주소
	public void insert(CartVO cartVO) throws Exception {
		dao.create(cartVO);		
	}
}
