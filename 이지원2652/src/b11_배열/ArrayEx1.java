package b11_배열;

/*
 * Array(배열)
 * 같은 자료형 끼리의 묶음
 * index(인덱스) 
 * index연산자 기호 = [] 대괄호
 * 
 * */

public class ArrayEx1 {
	public static void main(String[] args) {
		
		// 배열 선언 및 대입 방법
		// 1.
		int[] num = new int[100];
		
		 for(int i = 0; i < 100; i++) {
			 num[i] = i*10;
		 }
		 for(int i =0; i < 100; i++) {
				System.out.println(num[i]);
			}
		
		//2.
		int[] arr_i = new int[] {10,20,30,40,50}; // 공간의 제약
		int[] arr_i2 = {10,20,30,40,50};			
		
	}
	

}
