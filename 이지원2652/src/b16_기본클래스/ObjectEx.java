package b16_기본클래스;

public class ObjectEx {
	private String className = "Object";
	
	@Override
	public String toString() {
			return className;
	}
	@Override
	public int hashCode() {		// 주소값을 바꿀 수 있음
		return 100;  
	}	
	
	@Override
	public boolean equals(Object obj) {		
		return super.equals(obj);
	}

		
	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println(obj.toString());
	
		ObjectEx oex = new ObjectEx();
		ObjectEx oex2 = new ObjectEx();
		System.out.println(oex);
		
		String str1 = "김준일";
		String str2 = "김준일";
		String str3 = new String("김준일");
		
		
		/* toString() 메소드
		 * 
		String[] toStringArray = new String[5];
		
		for(int i = 0; i < toStringArray.length; i++) {
			Student s1 = new Student("김준일","코리아아카데미",1,1,1);
			toStringArray[i] = s1.toString();
		}	
		
		for(String s : toStringArray) {
			System.out.println(s);
		}
		*/
		
		System.out.println(oex.equals(oex2)); 
		
		System.out.println(str1 + str2 + str3);
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2);

		System.out.println(str1.equals(str3)); // 리터럴값 비교
		System.out.println(str1 == str3); // 주소값 비교 
		
		Student s1 = new Student("김준일","코리아아카데미",1,1,1);
		Student s2 = new Student("김준일","코리아아카데미",1,1,1);
		
		System.out.println(s1.equals(s2));
	}
	
}
