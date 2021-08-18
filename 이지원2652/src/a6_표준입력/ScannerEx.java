package a6_표준입력;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// String 기본제공 클래스
		// Scanner 외부 클래스
		
		// 자동 import
		// Ctrl + space bar : 하나의 클래스 import
		// Ctrl + Shift + o : 모든 클래스 import
		
		Scanner input = new Scanner(System.in);
		System.out.println("숫자 2개를 입력해주세요.");
		
		System.out.print("첫번째 수: ");
		String str = input.nextLine(); // next() : 한 단어(스페이스 또는 엔터로 입력 종료)
		int strInt = Integer.parseInt(str);
	 	
		System.out.print("두번째 수: ");	
 		String str2 = input.nextLine(); 	
 		int str2Int = Integer.parseInt(str2);
		
 		System.out.print("결과: ");
		// System.out.println(strInt + str2Int);
		// System.out.println(Integer.parseInt(str) + Integer.parseInt(str2));
		
		if(strInt == str2Int ) {
			System.out.println("두 문자가 같습니다.");			
		} else {
			System.out.println("두 문자가 다릅니다.");
		}	

	}

}
