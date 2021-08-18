package a7_¡∂∞«;

import java.util.Scanner;

public class Quiz2753 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int year = input.nextInt();
		int result;
				
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
			result = 1;
			System.out.println("¿±≥‚¿‘¥œ¥Ÿ.!!");
		} else {
			result = 0;
			System.out.println("¿±≥‚¿Ã æ∆¥’¥œ¥Ÿ.!!");
		}
		

	}

}
