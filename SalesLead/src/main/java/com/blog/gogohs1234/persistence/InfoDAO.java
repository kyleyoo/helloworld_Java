package com.blog.gogohs1234.persistence;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;

import com.blog.gogohs1234.domain.InfoVO;

public class InfoDAO {

	
	
	@Inject
	SqlSessionTemplate session;
	private static final String namespace="com.blog.gogohs1234.mapper.InfoMapper"; 
	
	
	public void setSession(SqlSessionTemplate session){
		this.session=session;
	}
	
	public void insertInfo(InfoVO vo){
		System.out.println("세션 시작");
		System.out.println(vo.getPart());
		System.out.println(vo.getName());
		session.insert(namespace+".insertInfo",vo);
		
		System.out.println("세션 완료");
	}
	public List<InfoVO> selectAll(){
		return session.selectList(namespace+".selectAll");
	}
}
