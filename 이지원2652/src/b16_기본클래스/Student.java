package b16_기본클래스;

public class Student {
	private String name;
	private String schoolName;
	private int year;
	private int group;
	private int number;	
	
	public Student(String name, String schoolName, int year, int group, int number) {
		super();
		this.name = name;
		this.schoolName = schoolName;
		this.year = year;
		this.group = group;
		this.number = number;
	}
	
	// 기본 셋팅은 물리적 주소
	// 논리적 비교가 가능하게 재정의하기
	@Override
	public int hashCode() {
		return number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj.hashCode() == this.hashCode()) {
			return true;		
		} else {
			return false;
		}		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", schoolName=" + schoolName + ", year=" + year + ", group=" + group
				+ ", number=" + number + "]";
	}	
	
}
