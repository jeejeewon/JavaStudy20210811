package b12_상속;

public class Son extends Father {
	private int bitcoin;	
	
	public Son() {
		super("김", 10000, "삼정타워"); // new Father();
		System.out.println(super.toString());
		System.out.println("아들 생성");
	}	
	
	// override 재정의
	// 우선순위 생성
	
	@Override // 어노테이션
	public void setLastName(String lastName) {
		super.setLastName(lastName);
	}
	
	@Override
	public void setMoney(int money) {
		super.setMoney((int)(money * 1.1));
	}

	public int getBitcoin() {
		return bitcoin;
	}
	public void setBitcoin(int bitcoin) {
		this.bitcoin = bitcoin;
	}

	
}
