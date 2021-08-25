package a8_반복;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {		
		
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();		
		
		/*
		for(int i = 0; i <= 8; i++ ) {
			int gu_i = i + 1;
			int result = gu_i * 2;			
			//System.out.println("2 x " + gu_i + " = " + result);
		}
		*/
		
		System.out.println(num + "단");
		for(int i = 0; i < 9 ; i++ ) {
			int i2 = i + 1;				
			System.out.println(num + " x " + i2 + " = " + num * i2);
		}
		
		/*
		int i = 0;
		while(i < 9) {		
			int i2 = i + 1;					
			System.out.println("2 x " + i2 + " = " + 2 * i2);
			i++;	
		}
		*/		 
		
		

	}

}
