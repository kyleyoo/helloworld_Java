package com.game.genius;

import java.util.Arrays;
import java.util.Scanner;

public class Genius_G {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number1,number2;
		int score_p1 = 0;
		int score_p2 = 0;
		String  card1[] = {"0","1","2","3","4","5","6","7","8","9",};
		String  card2[] = {"0","1","2","3","4","5","6","7","8","9",};
		System.out.println("P1�� ����ī��"+Arrays.toString(card1));
		System.out.println("P2�� ����ī��"+Arrays.toString(card1));
		
		
			System.out.println("P1 ���ڸ� �����ϼ���");			     
	        number1 = scan.nextInt();       
	        System.out.println(number1);
			
	        System.out.println("P2 ���ڸ� �����ϼ���");			     
	        number2 = scan.nextInt();        
	        System.out.println(number2);
	
	        if (number1>number2) {
				System.out.println("P1�� �̰���ϴ�.");
				score_p1++;
			}else if(number1<number2){
				System.out.println("P2�� �̰���ϴ�.");
				score_p2++;
			}else{
				System.out.println("�����ϴ�.");
			}System.out.println("���� ������"+score_p1+":"+score_p2);
			
			card1.
			
		
		
	}

}
