package com.blog.gogohs1234;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.blog.gogohs1234.domain.InfoVO;
import com.blog.gogohs1234.persistence.InfoDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/*.xml" })
public class infoTest {
	
	@Inject
	InfoDAO dao;

	

	@Test
	public void test() {
		
		
		InfoVO vo = new InfoVO();
		
		vo.setPart("computer12");
		vo.setName("real12");
		dao.insertInfo(vo);

	}
	
	@Test
	public void selectAllTest(){
		List<InfoVO> list = dao.selectAll();
		
		for (InfoVO infoVO : list) {
		System.out.println(infoVO);	
		}
	}

}
