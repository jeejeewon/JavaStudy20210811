package b10_클래스;

public class CarTest {
	public static void main(String[] args) {
				
		Car sonata = new Car();
		sonata.setCompany("현대자동차");
		sonata.setModel("소나타");
		sonata.setColor("블랙");
		sonata.setYear(2019);
		sonata.carInfo();
		
		Car k7 = new Car();
		k7.setCompany("KIA자동차");
		k7.setModel("k7");
		k7.setColor("화이트");
		k7.setYear(2020);
		k7.carInfo();
		
		Car tesla_mode13 = new Car();
		tesla_mode13.setCompany("tesla");
		tesla_mode13.setModel("model13");
		tesla_mode13.setColor("블루");
		tesla_mode13.setYear(2019);
		tesla_mode13.carInfo();
	}
}

// 사물 객체화(클래스화) 연습
// 예) 스위치 값: light on / light off
