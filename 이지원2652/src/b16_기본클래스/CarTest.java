package b16_기본클래스;

public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car(20210001, "k5");
		Car car2 = new Car(20210001, "k5");
		Car car3 = new Car(20210002, "k5");
		Car car4 = car1;
		
		System.out.println(car1 == car2); // 물리적 주소 비교
		System.out.println(car1 == car3);
		System.out.println(car1 == car4);
		System.out.println(car1.equals(car2));
		System.out.println(car1.equals(car3));
		System.out.println(car1.equals(car4));	
		
	}

}
