package a7_����;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		System.out.print("������ �Է����ּ���(A ~ F): ");
		
		Scanner input = new Scanner(System.in);
		String grade = input.nextLine();
		
		if(grade.equals("A") || grade.equals("a")) {
			System.out.println("�л��� ������ 90 ~ 100�� �Դϴ�.");
		} else if(grade.equals("B") || grade.equals("b")) {
			System.out.println("�л��� ������ 80 ~ 89�� �Դϴ�.");				
		} else if(grade.equals("C") || grade.equals("c")) {
			System.out.println("�л��� ������ 70 ~ 79�� �Դϴ�.");				
		} else if(grade.equals("D") || grade.equals("d")) {
			System.out.println("�л��� ������ 60 ~ 69�� �Դϴ�.");				
		} else if(grade.equals("F") || grade.equals("f")) {
			System.out.println("�л��� ������ 0 ~ 59�� �Դϴ�.");				
		} else {
			System.out.println("A ~ F ������ �Է��� �� �ֽ��ϴ�.");
		}		
	}
}
