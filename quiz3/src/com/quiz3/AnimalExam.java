package com.quiz3;

public class AnimalExam {

	public static void main(String[] args) {
	
		
		Animal ani = new Animal();
		
		
		ani.Attack("용");
		System.out.println(ani.name+"이 "+ani.action);
		ani.Cry("말");
		System.out.println(ani.name+"이 "+ani.action);
		ani.Eat("돼지");
		System.out.println(ani.name+"가 "+ani.action);
		ani.Howl("늑대");
		System.out.println(ani.name+"가 "+ani.action);
		ani.Run("뱀");
		System.out.println(ani.name+"이 "+ani.action);
		ani.Sit("닭");
		System.out.println(ani.name+"이 "+ani.action);
		ani.Sleep("잠만보");
		System.out.println(ani.name+"가 "+ani.action);
		ani.Vomit("다람쥐");
		System.out.println(ani.name+"가 "+ani.action);
	}
}
