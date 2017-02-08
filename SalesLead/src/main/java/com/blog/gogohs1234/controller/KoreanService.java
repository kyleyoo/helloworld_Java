package com.blog.gogohs1234.controller;

import javax.inject.Inject;

public class KoreanService {
	
	private String name;
	
	@Inject
	private KoreanService(String name){
		this.name=name;
	}
	
	
	public String greet(){
		return this.name+"Korean Hello";
		
	}
}
