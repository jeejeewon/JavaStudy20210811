package b12_상속;

public class Animals {
	public static void main(String[] args) {
		Human h = new Human();
		Tiger t = new Tiger();
		Eagle e = new Eagle();
		
		h.move();
		t.move();
		e.move();
		
		Animal[] a = new Animal[3];
		a[0] = new Human();
		a[1] = new Tiger();
		a[2] = new Eagle();
		
		// 업캐스팅
		// forEach문 (인덱스가 정해져있어야함)
		for(Animal ani : a) { // ani는 클래스 변수
			 ani.move();			
		}		
	}

}

// extends 다중상속이 안됨

class Human extends Animal {
	@Override
	public void move() {
		// super.move(); // 부모 메소드 호출,  같은 메소드를 가짐
		//System.out.println("사람이 네발로 걷습니다.");
	}		
}

class Tiger extends Animal {
	@Override
	public void move() {
		//super.move(); 상속받은 기능을 재정의
		System.out.println("호랑이가 뜁니다.");		
	}	
}

class Eagle extends Animal {
	
	@Override
	public void move() {
		System.out.println("독수리가 납니다.");
	}	
}
