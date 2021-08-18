package a7_조건;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		System.out.print("성적을 입력해주세요(A ~ F): ");
		
		Scanner input = new Scanner(System.in);
		String grade = input.nextLine();
		
		if(grade.equals("A") || grade.equals("a")) {
			System.out.println("학생의 성적은 90 ~ 100점 입니다.");
		} else if(grade.equals("B") || grade.equals("b")) {
			System.out.println("학생의 성적은 80 ~ 89점 입니다.");				
		} else if(grade.equals("C") || grade.equals("c")) {
			System.out.println("학생의 성적은 70 ~ 79점 입니다.");				
		} else if(grade.equals("D") || grade.equals("d")) {
			System.out.println("학생의 성적은 60 ~ 69점 입니다.");				
		} else if(grade.equals("F") || grade.equals("f")) {
			System.out.println("학생의 성적은 0 ~ 59점 입니다.");				
		} else {
			System.out.println("A ~ F 까지만 입력할 수 있습니다.");
		}		
	}
}
