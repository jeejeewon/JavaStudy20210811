package b13_다형성;

import b12_상속.Animal;

class Human extends Animal {	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
	@Override
	public void move() {		
		System.out.println("사람이 네발로 걷습니다.");
	}		
}

class Tiger extends Animal {
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}	
	@Override
	public void move() {		
		System.out.println("호랑이가 뜁니다.");		
	}	
}

class Eagle extends Animal {	
	public void flying() {
		System.out.println("독수리가 멀리 날아갑니다.");
	}
	@Override
	public void move() {
		System.out.println("독수리가 납니다.");
	}	
}


public class AnimalTest {
	
	Animal[] list = new Animal[3];
	
	public void addAnimal() {
		list[0] = new Human();
		list[1] = new Tiger();
		list[2] = new Eagle();
				
	}
	
	public void animalMove() {
		for(Animal ani : list) {
			ani.move();
		}
	}
	
	public void casting() {
		for(Animal ani : list) {
			if(ani == null) { 
				continue;		
			}else if(ani instanceof Human) {
				Human h = (Human)ani;
				h.readBook();
			}else if(ani instanceof Tiger) {
				Tiger t = (Tiger)ani;
				t.hunting();				
			}else if(ani instanceof Eagle) {
				Eagle e = (Eagle)ani;
				e.flying();
			} else {
				System.out.println("지원하지않는 자료형");
			}
		}
		
	}

	public static void main(String[] args) {
		AnimalTest aniTest = new AnimalTest();
		
		// 업캐스팅 Animal <- Human, Tiger, Eagle
		aniTest.addAnimal();
		aniTest.animalMove();
		
		System.out.println("------------");
		
		// 다운캐스팅 (업캐스팅 된 것을 다시 원래 형태로)
		aniTest.casting();
			

	}

}
