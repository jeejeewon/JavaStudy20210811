package b12_상속;

public class ExtendsEx1 {

	public static void main(String[] args) {
		Son s = new Son();
		// System.out.println(s); // Father의 생성자가 호출됨
		s.setMoney(10000);
		System.out.println(s);
	}

}
