package a8_반복;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		boolean mainFlag = true; 
		
		while(mainFlag) {
			System.out.println("[프로그램 메뉴]");
			System.out.println("1. 김준일 강사 폴더");
			System.out.println("q. 프로그램 종료");
			System.out.print("명령을 입력하세요: ");		
			String selector = in.nextLine(); 
			
			if(selector.equals("1")) {
				while(true) {
					System.out.println("[김준일 강사 폴더]");
					System.out.println("1. javaStudy 폴더");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.print("명령을 입력하세요: ");
					selector = in.nextLine(); 		
					
					if(selector.equals("1")) {
						System.out.println("[javaStudy 폴더]");
						System.out.println();
					}else if(selector.equals("b")) {
						break;
					}else if(selector.equals("q")) {
						System.out.println("프로그램 종료중...");
						mainFlag = false;
						break;
					}else {
						System.out.println("잘못된 입력입니다.");					
					}					
				}				
			}else if(selector.equals("q")) {
				System.out.println("프로그램 종료중...");
				mainFlag = false;
				break;
			}else {
				System.out.println("잘못된 입력입니다.");
			}
		}	
		
		System.out.println("프로그램 종료!");		
		
	}

}
