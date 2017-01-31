package com.blog.gogohs1234;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.blog.gogohs1234.persistence.TimeDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class DAOTest {
	
	@Inject
	TimeDAO dao;
	
	@Test
	public void testTime()throws Exception {
	System.out.println(dao.getTime());
	}
	
}

