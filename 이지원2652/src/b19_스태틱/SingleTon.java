package b19_스태틱;

public class SingleTon {
	
	public static void main(String[] args) {
		KIA factory1 = KIA.getInstance();
		KIA factory2 = KIA.getInstance();
		KIA factory3 = KIA.getInstance();
		KIA factory4 = KIA.getInstance(); // 하나의 주소를 공유
		
		Car k3 = factory1.createCar("k3");
		Car k5 = factory2.createCar("k5");
		Car k7 = factory3.createCar("k7");
		Car k8 = factory4.createCar("k8");
		
		k3.carInfo();
		k5.carInfo();
		k7.carInfo();
		k8.carInfo();
		
	}

}
