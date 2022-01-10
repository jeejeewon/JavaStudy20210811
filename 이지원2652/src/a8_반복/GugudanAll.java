package a8_반복;

import java.util.Scanner;

public class GugudanAll {

	public static void main(String[] args) {
		
		/*
		for(int i = 0; i < 8; i++) {
			int i2 = i + 2;
			
			System.out.println(i2 + "단");			
			
			for(int j = 0; j < 9; j++) {
				int j2 = j + 1;
				System.out.println(i2 + "x" + j2 + "=" + i2 * j2);
			}
			System.out.println();
		}
		*/	
		
		Scanner input = new Scanner(System.in);
		int start = input.nextInt();
		int end = input.nextInt();
		
		for(int i = 0; i < 8; i++) { 
			int i2 = i + 2;
			if (i2 >= start && i2 <= end) {
				System.out.println(i2 + "단");					
				for(int j = 0; j < 9; j++) {
					int j2 = j + 1;
					System.out.println(i2 + "x" + j2 + "=" + i2 * j2);
				} System.out.println();			
			} 						
		}	
	}
}
