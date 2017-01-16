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
		System.out.println("P1의 선택카드"+Arrays.toString(card1));
		System.out.println("P2의 선택카드"+Arrays.toString(card1));
		
		
			System.out.println("P1 숫자를 선택하세요");			     
	        number1 = scan.nextInt();       
	        System.out.println(number1);
			
	        System.out.println("P2 숫자를 선택하세요");			     
	        number2 = scan.nextInt();        
	        System.out.println(number2);
	
	        if (number1>number2) {
				System.out.println("P1이 이겼습니다.");
				score_p1++;
			}else if(number1<number2){
				System.out.println("P2이 이겼습니다.");
				score_p2++;
			}else{
				System.out.println("비겼습니다.");
			}System.out.println("현재 점수는"+score_p1+":"+score_p2);
			
			card1.
			
		
		
	}

}
