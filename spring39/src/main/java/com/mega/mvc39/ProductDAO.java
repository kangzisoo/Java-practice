package com.mega.mvc39;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductDAO {

	// myBatis싱글톤 주소를 주입!
	@Autowired
	SqlSessionTemplate my;

	public void create(ProductVO bag) throws Exception {
//		my.insert("product.insert", bag);
	}

	public ProductVO select(ProductVO vo3) {
		return my.selectOne("product.select", vo3);
	}

	public void delete() {

	}

}
