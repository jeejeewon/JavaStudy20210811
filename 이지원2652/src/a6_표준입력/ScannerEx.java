package a6_ǥ���Է�;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// String �⺻���� Ŭ����
		// Scanner �ܺ� Ŭ����
		
		// �ڵ� import
		// Ctrl + space bar : �ϳ��� Ŭ���� import
		// Ctrl + Shift + o : ��� Ŭ���� import
		
		Scanner input = new Scanner(System.in);
		System.out.println("���� 2���� �Է����ּ���.");
		
		System.out.print("ù��° ��: ");
		String str = input.nextLine(); // next() : �� �ܾ�(�����̽� �Ǵ� ���ͷ� �Է� ����)
		int strInt = Integer.parseInt(str);
	 	
		System.out.print("�ι�° ��: ");	
 		String str2 = input.nextLine(); 	
 		int str2Int = Integer.parseInt(str2);
		
 		System.out.print("���: ");
		// System.out.println(strInt + str2Int);
		// System.out.println(Integer.parseInt(str) + Integer.parseInt(str2));
		
		if(strInt == str2Int ) {
			System.out.println("�� ���ڰ� �����ϴ�.");			
		} else {
			System.out.println("�� ���ڰ� �ٸ��ϴ�.");
		}	

	}

}
