package b10_클래스;

public class StudentTest {
	public static void main(String[] args) {
		Student lee = new Student("이지원", 2);
		Student kim = new Student("김준일", "USA아이티", 4);
		Student park = new Student("박호훈","코리아아이티", 3);
		
		
		// kim.name = "김준일"; // .은 해당 '메모리 주소값을 참조한다'라고 함 
				
		lee.showInfo();		
		
		Integer i = new Integer(100);
		
		System.out.println(lee.hashCode()); // heap메모리주소
		System.out.println(i.hashCode());
		
		lee.getFreebies();
		kim.getFreebies();
		park.getFreebies();
		
	}

}
