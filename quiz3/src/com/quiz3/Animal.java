package com.quiz3;

public class Animal {

	String name;
	String action;

	void Eat(String name) {
		this.name = name;
		this.action = "먹는다";
	}

	void Run(String name) {
		this.name = name;
		this.action = "달린다";
	}

	void Howl(String name) {
		this.name = name;
		this.action = "울부짖는다";
	}

	void Vomit(String name) {
		this.name = name;
		this.action = "토한다";
	}

	void Sleep(String name) {
		this.name = name;
		this.action = "잔다";
	}

	void Sit(String name) {
		this.name = name;
		this.action = "앉아있는다";
	}

	void Cry(String name) {
		this.name = name;
		this.action = "운다";
	}

	void Attack(String name) {
		this.name = name;
		this.action = "공격한다";
	}

}
