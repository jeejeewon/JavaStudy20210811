 package a4_형변환;

public class Conversion {

	public static void main(String[] args) {
		//업캐스팅		
		char c = 'A';
		int i_c = c;
		//int i_c = (int)c; 생략가능
		System.out.println("문자 -> 정수: " + i_c);
		
		int num = 100;
		double d_num = num;
		System.out.println("정수 -> 실수: " + d_num );
		
		System.out.println("문자 + 정수: " + (c + num)); // 계급이 낮은 쪽이 형변환되어 더해짐
		 
		//다운캐스팅
		int i = 67;
		char c_i = (char)i;
		System.out.println("정수 -> 문자: " + c_i); 
		
		double d_num2 = 1.1;
		int num2 = (int)d_num2;
		System.out.println("실수 -> 정수: " + num2);

	}

}
