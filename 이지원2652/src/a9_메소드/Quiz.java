package a9_메소드;

import java.util.Scanner;

public class Quiz {
	
	void quiz1(int count1){
		for(int i = 0; i < count1; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
	}
	
	void quiz2(int count2){
		for(int i = 0; i < count2; i++) {
			for(int j = 0; j < 5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
	}
	
	void quiz3(int count3){
		for(int i = 0; i < count3; i++) {
			for(int j = 0; j < count3-i-1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}					
	}
	
	void quiz4(int count4){
		for(int i = 0; i < count4; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < count4-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	void quiz5(int count5){
		for(int i = 0; i < count5; i++) {	
			for(int j = 0; j < count5 - i + 1; j++)	{				
				System.out.print(" ");					
			}
			for(int j = 0; j < (i*2)+1; j++)	{				
				System.out.print("*");				
			}
			System.out.println();			
		}
	}	
		
	void procStart(String selector, int count) {
				
		if(selector.equals("1")) {	
			quiz1(count);		
			
		}else if(selector.equals("2")) {
			quiz2(count);	
			
		}else if(selector.equals("3")) {	
			quiz3(count);	
			
		}else if(selector.equals("4")) {
			quiz4(count);	
			
		}else if(selector.equals("5")) {
			quiz5(count);	
			
		}else {
			System.out.println("잘못된 입력입니다.");
			
		}	
	}		
	
	public static void main(String[] args) {
		Quiz q = new Quiz();		
		Scanner in = new Scanner(System.in);		

		while(true) {
			System.out.println("[별찍기 프로그램]");
			System.out.println("1. 문제1");
			System.out.println("2. 문제2");
			System.out.println("3. 문제3");
			System.out.println("4. 문제4");
			System.out.println("5. 문제5");
			System.out.println("q. 프로그램 종료");
			System.out.print("명령을 입력하세요: ");
			String selector = in.next();			
			
			if(selector.equals("1") || selector.equals("2") || selector.equals("3") || selector.equals("4") || selector.equals("5")) {
				System.out.print("출력할 별의 개수를 입력하세요: ");
				int count = in.nextInt();				
				q.procStart(selector, count);
				System.out.println();				
								 								
			}else if(selector.equals("q")) {
				System.out.println("프로그램 종료중...");
				break;
			}else {
				System.out.println("잘못된 입력입니다.");					
			}	
		} 		
		System.out.println("프로그램 종료!");	
	}	

}
