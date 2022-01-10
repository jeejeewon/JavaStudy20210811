package a9_메소드;

import java.util.Scanner;

public class Quiz2 {
	
	public void quiz1(int starCount1) {
		for(int i = 0; i < starCount1; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}			
	}
	
	public void quiz2(int starCount2) {
		for(int i = 0; i < starCount2; i++) {
			for(int j = 0; j < 5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}			
	}
	
	public void quiz3(int starCount3) {
		for(int i = 0; i < starCount3; i++) {
			for(int j = 0; j < starCount3-i-1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
	}
	
	public void quiz4(int starCount4) {
		for(int i = 0; i < starCount4; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < starCount4-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
	}
	
	public void quiz5(int starCount5) {
		for(int i = 0; i < starCount5; i++) {	
			for(int j = 0; j < starCount5 - i + 1; j++)	{				
				System.out.print(" ");					
			}
			for(int j = 0; j < (i*2)+1; j++)	{				
				System.out.print("*");				
			}
			System.out.println();			
		}		
	}
	
	
	public void procStart(String selector, int starCount) {
		if(selector.equals("1")) {	
			quiz1(starCount);			
			
		}else if(selector.equals("2")) {
			quiz2(starCount);
			
		}else if(selector.equals("3")) {	
			quiz3(starCount);
			
		}else if(selector.equals("4")) {
			quiz4(starCount);
			
		}else {
			quiz5(starCount);
		}
	}
	
	public void mainMenuPrint() {
		System.out.println("[별찍기 프로그램]");
		System.out.println("1. 문제1");
		System.out.println("2. 문제2");
		System.out.println("3. 문제3");
		System.out.println("4. 문제4");
		System.out.println("5. 문제5");
		System.out.println("q. 프로그램 종료");		
	}

	public static void main(String[] args) {
		Quiz2 m = new Quiz2(); 		
		Scanner in = new Scanner(System.in);	
		boolean loopFlag = true;
		
		while(loopFlag) {				
			m.mainMenuPrint();				
			System.out.print("명령을 입력하세요: ");
			String selector = in.nextLine();			
			
			if(selector.equals("1") || selector.equals("2") || selector.equals("3") || selector.equals("4") || selector.equals("5")) {
				System.out.print("출력할 별의 개수를 입력하세요: ");
				int starCount = in.nextInt();
				in.nextLine(); 
				m.procStart(selector, starCount);
	
			}else if(selector.equals("q")) {
				System.out.println("프로그램 종료중...");
				loopFlag = false;
			}else {
				System.out.println("잘못된 입력입니다.");	
			}
			System.out.println();
		}
		System.out.println("프로그램 종료!");
	}

}
