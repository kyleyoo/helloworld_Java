package com.blog.gogohs1234.domain;

public class InfoVO {
	private String part;
	private String name;
	private int no;
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	@Override
	public String toString() {
		return "InfoVO [part=" + part + ", name=" + name + ", no=" + no + "]";
	}
	
}
