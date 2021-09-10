package b11_배열;

import b12_상속.Animal;

public class OXcount {

	public static void main(String[] args) {
				
		int[][][] arr  = {{{1,2,3},{1,2,3}},{{1,2,3},{1,2,3}},{{1,2,3},{1,2,3}}};
		//System.out.println(arr[0][0][0]);
		//System.out.println(arr[0][0][1]);
		//System.out.println(arr[0][0][2]);
		
		System.out.println(arr.length); // {{{1,2,3},{1,2,3}},{{1,2,3},{1,2,3}},{{1,2,3},{1,2,3}}}
		System.out.println(arr[0].length); // 인덱스 0번의  배열의 길이 {{1,2,3},{1,2,3}}
		System.out.println(arr[0][1].length); // 인덱스 1번의  배열의 길이 {1,2,3} 
		
		String[][][] quiz = new String[3][2][3];
		
		int count_0 = 0;
		int count_x = 0;	
		
		for (int i = 0; i < quiz.length; i++) {
			for (int j = 0; j < quiz[i].length; j++) {
				for (int k = 0; k < quiz[i][j].length; k++) {
					quiz[i][j][k] = (i+j+k) % 2 == 0 ? "O" : "X" ;
				}
			}
		}
	
		for (int i = 0; i < quiz.length; i++) {
			for (int j = 0; j < quiz[i].length; j++) {
				for (int k = 0; k < quiz[i][j].length; k++) {
					System.out.print(quiz[i][j][k]);
				}
				System.out.print(quiz[i].length-1 == j ? "\n" : ", ");
			}
		}			
	}

}
