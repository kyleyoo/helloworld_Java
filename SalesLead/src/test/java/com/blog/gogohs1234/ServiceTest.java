package com.blog.gogohs1234;

import static org.junit.Assert.fail;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.blog.gogohs1234.controller.KoreanService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class ServiceTest {

	@Inject
	ApplicationContext ctx;
	@Inject
	KoreanService service;
	@Test
	public void test() {
		System.out.println(ctx);
	}
	
	@Test
	public void testGreat(){
		System.out.println(service.greet());
	}

}
