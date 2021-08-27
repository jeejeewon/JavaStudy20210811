package b10_클래스;

public class Student {
	
	public Student() {
		// 반환형이 없음
		// 메모리주소
	}
	
	String name;
	String schoolName;
	String year;
	
	public void showInfo() {
		System.out.println("학생 정보");
		System.out.println("이름: " + name);
		System.out.println("학교: " + schoolName);
		System.out.println("학년: " + year);
	}
}
