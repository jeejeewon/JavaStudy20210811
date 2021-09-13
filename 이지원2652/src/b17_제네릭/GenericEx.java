package b17_제네릭;

/*
 * Generic(제네릭)
 * 클래스 내부의 자료형을 원하는 형태로 지정할 수 있음
 * 
 */


public class GenericEx<T> {
	T generic;
	public T getGeneric(T t) {
		T t2 = t;
		return t2;
	}
	
	public static void main(String[] args) {
		GenericEx<String> gex = new GenericEx<String>();
		String str = gex.getGeneric("김준일");
		GenericEx<Integer> gex2 = new GenericEx<Integer>();
		Integer num1 = gex2.getGeneric(100);
		
		System.out.println(str);
		System.out.println(num1);
	}
		
}
