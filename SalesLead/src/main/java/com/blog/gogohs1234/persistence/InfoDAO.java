package com.blog.gogohs1234.persistence;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;

import com.blog.gogohs1234.domain.InfoVO;

public class InfoDAO {

	
	@Inject
	SqlSessionTemplate session;
	private static final String namespace="com.blog.gogohs1234.persistence.mapper.infoMapper"; 
	
	public void setSession(SqlSessionTemplate session){
		System.out.println("일함??");
		this.session=session;
		System.out.println("이릍나?");
	}
	
	public void insert(InfoVO vo){
		System.out.println("SADSADASDSADSADS");
		
		session.insert(namespace+".insertInfo",vo);
		
		System.out.println("세션이 문제야?");
	}
}
