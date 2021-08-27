package a9_메소드;

import java.util.Scanner;

public class OverloadingEx { 
	
	// 메소드명은 같지만 매개변수가 다름
	// 입력값의 경우의 수
	// 리턴형과 메소드는 세트
	
	public int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	public int add(String num1, int num2) {
		int result = Integer.parseInt(num1) + num2;
		return result;
	}
	
	public int add(int num1) {
		int result = num1 + num1;
		return result;
	}
	
	public int mul(int num1, int num2, int num3) {
		int result = num1 * num2 * num3;
		return result;
	}
	
	public double mul(int num1, double num2) {
		double result = num1 * num2;
		return result;
	}	
	
	public void mainMethod() {
		Scanner in = new Scanner(System.in);
		
		int numberSum = add(10,20); 
		System.out.println("두 수의 합은? " + numberSum);
		
		double numberMul = mul(2,10.5); 
		System.out.println("곱셈은? " + numberMul);
	}

	public static void main(String[] args) {
		OverloadingEx main = new OverloadingEx();
		
		main.mainMethod();

	}

}
