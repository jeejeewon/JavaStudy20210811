package a2_����;

public class MyInfo {

	public static void main(String[] args) {
		/** <�ڷ���>
		* ����(boolean) = true, false
		* boolean ������ = true;
		* boolean ������ = false;
		*  
		* ������(char) = a ~ z, �ѱ�(1���ڸ�)
		* char ������ = 'a';
		* char ������ = '��';
		* char ������ = '1';
		* char ������ = '$';
		* 
		* ���ڿ��ڷ���(String) = "���ڿ��� ����"
		* String ������ = "�ȳ��ϼ���.";
		* 
		* ������(int) = 0 ~ 10 �������� ǥ��
		* int ������ = 100;
		* 
		* �Ǽ���(double) = 0.0 ~ 0.9999 �Ǽ� ����(�Ҽ���)�� ǥ��
		* double ������ = 100.0123
		*/
		
		int year = 1993;
		int month = 9;
		int day = 1;
		
		char f = '��';
		char s = '��';
		char th = '��';
		String name = "������";
		
		double right = 1.5;
		double left = 1.25;
		
		boolean maleFemale = false;
		
		System.out.print("�������: ");
		System.out.print(year);
		System.out.print("�� ");
		System.out.print(month);
		System.out.print("�� ");
		System.out.print(day);
		System.out.println("�� ");
		
		System.out.print("�̸�: ");
		System.out.print(f);
		System.out.print(s);
		System.out.println(th);
		
		System.out.print("�̸�: ");
		System.out.println(name);
		
		System.out.print("�÷�(R): ");
		System.out.println(right);		
		System.out.print("�÷�(L): ");
		System.out.println(left);
		
		System.out.print("����: ");
		System.out.println(maleFemale);		

	}

}
