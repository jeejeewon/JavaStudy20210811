 package a4_����ȯ;

public class Conversion {

	public static void main(String[] args) {
		//��ĳ����		
		char c = 'A';
		int i_c = c;
		//int i_c = (int)c; ��������
		System.out.println("���� -> ����: " + i_c);
		
		int num = 100;
		double d_num = num;
		System.out.println("���� -> �Ǽ�: " + d_num );
		
		System.out.println("���� + ����: " + (c + num)); // ����� ���� ���� ����ȯ�Ǿ� ������
		 
		//�ٿ�ĳ����
		int i = 67;
		char c_i = (char)i;
		System.out.println("���� -> ����: " + c_i); 
		
		double d_num2 = 1.1;
		int num2 = (int)d_num2;
		System.out.println("�Ǽ� -> ����: " + num2);

	}

}
