package b18_컬렉션;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
	
	public static void main(String[] args) {
		List<Student> sList = new ArrayList<Student>();
		
		for(int i = 0; i < 10; i++) {
			sList.add(new Student("김준일"+i, 202100+i));
		}
		
		for(Student s : sList) {
			System.out.println(s);
		}
		
		//System.out.println(sList);
		
		System.out.println();
		
		Student s = sList.remove(3); // 제거될 대상의 객체를 가져옴, 삭제와 동시에 객체를 반환
		System.out.println(s);
	
	}
	
}
