package a2_변수;

public class MyInfo {

	public static void main(String[] args) {
		/** <자료형>
		* 논리형(boolean) = true, false
		* boolean 변수명 = true;
		* boolean 변수명 = false;
		*  
		* 문자형(char) = a ~ z, 한글(1글자만)
		* char 변수명 = 'a';
		* char 변수명 = '가';
		* char 변수명 = '1';
		* char 변수명 = '$';
		* 
		* 문자열자료형(String) = "문자열을 저장"
		* String 변수명 = "안녕하세요.";
		* 
		* 정수형(int) = 0 ~ 10 십진수를 표현
		* int 변수명 = 100;
		* 
		* 실수형(double) = 0.0 ~ 0.9999 실수 단위(소수점)를 표현
		* double 변수명 = 100.0123
		*/
		
		int year = 1993;
		int month = 9;
		int day = 1;
		
		char f = '이';
		char s = '지';
		char th = '원';
		String name = "이지원";
		
		double right = 1.5;
		double left = 1.25;
		
		boolean maleFemale = false;
		
		System.out.print("생년월일: ");
		System.out.print(year);
		System.out.print("년 ");
		System.out.print(month);
		System.out.print("월 ");
		System.out.print(day);
		System.out.println("일 ");
		
		System.out.print("이름: ");
		System.out.print(f);
		System.out.print(s);
		System.out.println(th);
		
		System.out.print("이름: ");
		System.out.println(name);
		
		System.out.print("시력(R): ");
		System.out.println(right);		
		System.out.print("시력(L): ");
		System.out.println(left);
		
		System.out.print("성별: ");
		System.out.println(maleFemale);		

	}

}
