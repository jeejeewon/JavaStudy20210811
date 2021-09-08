package b11_배열;

import b12_상속.Animal;

public class OXcount {

	public static void main(String[] args) {
		String[][][] quiz = new String[3][2][3];
		
		int count_0 = 0;
		int count_x = 0;
		
		//System.out.println(quiz.length);
		
		int[][][] arr  = {{{1,2,3},{1,2,3}},{{1,2,3},{1,2,3}},{{1,2,3},{1,2,3}}};
		//System.out.println(arr[0][0][0]);
		//System.out.println(arr[0][0][1]);
		//System.out.println(arr[0][0][2]);
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[0][1].length);
		
		int[] a = new int[3];
		//System.out.println(a.length);
		
		
		for (int i = 0; i < quiz.length; i++) {
			for (int j = 0; j < quiz[i].length; j++) {
				for (int k = 0; k < quiz[i][j].length; k++) {
					quiz[i][j][k] = (i+j+k) % 2 == 0 ? "O" : "X" ;
				}
			}
		}
		
		// OXO, OOO
		// OOX, OOO	
		// OXO, OOX
	
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
