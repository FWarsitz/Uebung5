package p3;

public class P3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] Matrix= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i = 0; i <= 2; i++) {
			for (int j = 0 ; j<= 2; j++) {
				System.out.print(Matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("a)");
		
		//a
		for(int i = 0; i <= 2; i++) {
			for (int j = 0 ; j<= 2; j++) {
				System.out.print(Matrix[i][j] + 1 + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		System.out.println("b)");
		
		//b
		int sum = 0;
		for(int i = 0; i <= 2; i++) {
		for (int j = 0 ; j<= 2; j++) {
			sum += Matrix[i][j];
		}	
	}
		System.out.println("Summe der Elemente: " + sum);
		System.out.println();
		
		System.out.println("c)");
		for(int i = 0; i <= 2; i++) {
			for (int j = 2 ; j>= 0; j--) {
				System.out.print(Matrix[j][i] + " ");
			}
			System.out.println();
		}
		System.out.println();

	}

}
