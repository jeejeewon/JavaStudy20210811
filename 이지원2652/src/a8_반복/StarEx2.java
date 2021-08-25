package a8_반복;

public class StarEx2 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i + 1; j++)	{
				System.out.print("*");
			} 
			System.out.println();		
		}
		System.out.println();	
		
		for(int i = 0; i < 5; i++) {
			for(int j = 5; j > i; j--)	{				
				System.out.print("*");
			}	
			System.out.println();		
		}
		System.out.println();	
		
		for(int i = 0; i < 5; i++) {
			for(int j = 4; j > i; j--)	{				
				System.out.print(" ");
			}	
			for(int k = 0; k < i + 1; k++)	{				
				System.out.print("*");
			}
			System.out.println();		
		}
		System.out.println();

		for(int i = 0; i < 5; i++) {	
			for(int k = 5; k > i; k--)	{				
				System.out.print("*");				
			}
			System.out.println();	
			for(int j = 0; j < i + 1; j++)	{				
				System.out.print(" ");				
			}
					
		}	
		System.out.println();		
		
		for(int i = 0; i < 5; i++) {	
			for(int j = 4; j > i; j--)	{				
				System.out.print(" ");	
				//System.out.print("j");
			}
			for(int k = 0; k < i; k++)	{				
				System.out.print("*");	
				//System.out.print("k");
			}
			for(int l = 0; l < i + 1; l++)	{				
				System.out.print("*");
				//System.out.print("l");
			}
			System.out.println();			
		}	
		System.out.println();
	}

}
