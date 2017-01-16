package quiz2;

import java.util.*;

public class quiz2 {

	public static void main(String[] args) {

		int a;
		String b;
		b = "a";

		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		do {
			System.out.println("숫자를 입력하세요");
			a = sc.nextInt();
			System.out.println(a);
			if (a == 1) {
				System.out.println("*");
				System.out.println("**");
				System.out.println("***");
				System.out.println("****");

			} else if (a == 2) {
				System.out.println("   *");
				System.out.println("  **");
				System.out.println(" ***");
				System.out.println("****");
				System.out.println("Sdsdsds");
			} else if (a == 3) {
				System.out.println("****");
				System.out.println(" ***");
				System.out.println("  **");
				System.out.println("   *");

			} else if (a == 4) {
				System.out.println("****");
				System.out.println("***");
				System.out.println("**");
				System.out.println("*");

			}
			System.out.println("더하려면 d 그만하려면 y");
			b = sc2.nextLine();
		}

		while (!b.equals("y"));
		System.out.println();
		System.out.println("프로그램 종료");
	}

}
