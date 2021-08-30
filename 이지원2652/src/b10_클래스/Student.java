 package b10_클래스;

public class Student {
	
	private String name;
	private String schoolName;
	private int year;	
	// 모든 변수는 캡슐화
	
	Student() { 
		// 기본 생성자
		// 반환형이 없음
		// 메모리주소
	}
	public Student(String name, int year) {
		super(); // 상속 관계
		this.name = name;	
		this.year = year;
		this.showInfo();	
	}			
	public Student(String name, String schoolName, int year) {
		super(); // 상속 관계
		this.name = name;
		this.schoolName = schoolName;
		this.year = year;
		this.showInfo();	
	}	
	public String getName( ) {
		return name;
	}		
	public void setName(String name) {
		this.name = name + " 학생";		
	}	
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}	
	public void getFreebies() {
		Regular regular = new Regular();
		
		regular.setYearCheck(year, schoolName);
				
		if(regular.isYearCheck()) {
			System.out.println("사은품 대상자");			
		} else {
			System.out.println("대상자 제외");
		}		
	}	
	public void showInfo() {
		System.out.println("학생 정보");
		System.out.println("이름: " + name);
		System.out.println("학교: " + schoolName);
		System.out.println("학년: " + year);
	
	}
}
