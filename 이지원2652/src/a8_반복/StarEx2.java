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
			for(int j = 5 - 1; j > i; j--)	{	// 기준이 되는 값 필요			
				System.out.print(" ");
			}	
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
			for(int j = 0; j < i + 1; j++)	{				
				System.out.print(" ");				
			}					
		}	
		System.out.println();		
		
		for(int i = 0; i < 5; i++) {	
			for(int j = 5 - 1; j > i; j--)	{				
				System.out.print(" ");					
			}
			for(int j = 0; j < i; j++)	{				
				System.out.print("*");				
			}
			for(int j = 0; j < i + 1; j++)	{				
				System.out.print("*");				
			}
			System.out.println();			
		}	
		System.out.println();
	}

}
