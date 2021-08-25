package a8_반복;

public class DoubleForEx {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			int i2 = i + 1;
			System.out.println("�ڳ����� " + i2 + "��°");
			
			for(int j = 0; j < 10; j++) {
				int j2 = j + 1;
				System.out.println("�ڼ� " + j2 + "��");
			}
		} 
	}
}
