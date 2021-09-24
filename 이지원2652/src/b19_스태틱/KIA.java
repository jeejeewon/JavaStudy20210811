package b19_스태틱;

public class KIA {

	private static KIA instance = new KIA();
	private int serialNum = 20210001;
	
	private KIA() {
		
	}

	
	public static KIA getInstance() {
		if(instance == null) {
			instance = new KIA();			
		}
		return instance;
	}
	
	public Car createCar(String model) {
		return new Car(serialNum++, model);
		
	}
	
	
}
