package b14_추상화;

public class AbstractExTest {
	
	public static void main(String[] args) {
		// AbstractEx absEx = new AbstractEx(); 생성할 수 없음
		// 생성은 불가능하지만 업캐스팅하여 사용은 가능
		
		AbstractEx absEx = new AbstractExExten();
		AbstractEx absEx2 = new AbstractEx2Exten();
	}

}
