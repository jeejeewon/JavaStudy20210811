package a8_นÝบน;

import java.util.Scanner;

public class StarEx1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int star = input.nextInt();
		
		/*
		for(int i = 0; i < star; i++) {
			for(int j = star; j >= 0; j--)	{
				if (i < j) {					
				} else {
					System.out.print("*");
				}
			}	System.out.println();		
		}
		*/
		
		for(int i = 0; i < star; i++) {
			for(int j = 0; j < i + 1; j++)	{
				System.out.print("*");
			}	
			System.out.println();		
		}
	}

}
