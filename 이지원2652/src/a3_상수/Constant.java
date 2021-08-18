package a3_상수;

public class Constant {
	
	/**
	 * 
	 * 상수
	 * 1. final 예약어를 자료형 앞에 사용
	 * 2. 이름은 모두 대문자
	 * 3. 경로에도 사용
	 * 
	 */

	public static void main(String[] args) {
		int maxNum = 100;
		final int MAX_NUM = 100;
		
		maxNum = 200;
		//MAX_NUM = 200;
		
		System.out.println("일반 변수: " + maxNum);
		System.out.println("상수: " + MAX_NUM);
		
	}

}
