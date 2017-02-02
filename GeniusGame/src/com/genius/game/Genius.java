package com.genius.game;

import java.util.Arrays;
import java.util.Scanner;

public class Genius {
	public static void main(String[] args) {
		

		Player p1 = new Player();
		Player p2 = new Player();
		
		p1.give(4);
		System.out.println(Arrays.toString(p1.pcard));
		p2.give(4);
		System.out.println(Arrays.toString(p2.pcard));
	}
	
}
