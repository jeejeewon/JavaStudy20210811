package b14_추상화;

abstract class AbstractEx3Exten extends AbstractEx {
	// 임시로 사용할 때 
	// 메소드 구상 전
}
class AbstractEx2Exten extends AbstractEx {
	@Override
		public void printName() {
			System.out.println("김 준 일");	
		}
}
public class AbstractExExten extends AbstractEx {
	@Override
	public void printName() {
		// 추상클래스는 생성자x
		System.out.println("김 준일");
		
	}

}
