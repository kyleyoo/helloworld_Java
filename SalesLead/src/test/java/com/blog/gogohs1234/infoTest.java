package com.blog.gogohs1234;

import static org.junit.Assert.fail;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.blog.gogohs1234.domain.InfoVO;
import com.blog.gogohs1234.persistence.InfoDAO;
import com.blog.gogohs1234.persistence.TimeDAO;
import com.mysql.fabric.xmlrpc.base.Array;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/*.xml" })
public class infoTest {
	
	@Inject
	InfoDAO dao;

	

	@Test
	public void test() {
		
		
		InfoVO vo = new InfoVO();
		
		vo.setPart("TV");
		vo.setName("sadasdad");
		System.out.println(vo.getPart());
		System.out.println(vo.getName());
		dao.insert(vo);

	}

}
