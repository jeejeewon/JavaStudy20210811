package a8_반복;

public class WhileEx {

	public static void main(String[] args) {
		int num = 1;
		int result = 0;
		while(num <= 100) {
//			System.out.println(num);
			result += num;
			num++;		// 반복 후 작업
		}
		System.out.println(result);

	}

}
