package a5_������;

public class Operation2 {

	public static void main(String[] args) {
		// �� ������
		// AND(&&) = ��
		// OR(||) = ��
		// NOT(!) = ����
		
		// true(1) && false(0) => false(0)
		// && ���꿡�� false�� ����� ��������? : �� �� �ϳ��� 0�̸� �ȴ�.
		//			 ture�� ����� ��������? : �Ѵ� 1�̾�� �Ѵ�.
		// true(1) || false(0) => ture(1)
		// || ���꿡�� false�� ����� ��������? : �Ѵ� 0�̾�� �Ѵ�. 
		//		 	 ture�� ����� ��������? : �� �� �ϳ��� 1�̸� �ȴ�.
		
		// !�� �տ� ������ ture -> false
		
		System.out.println(!(true || false));
	}

}
