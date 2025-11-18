package p2;

public class P2_main {
	public static void main(String[] args) {
		
		int[] numbers = {-55,9000,0055,2,5514,877,9000};
		int max = 10, minIndex = 3;
		
		max = numbers[0];
		for( int i = 0; i < numbers.length; i++) {
			if(max < numbers[i]) {
				max = numbers[i];
				minIndex = i;
			}
		}
		
		System.out.println(max);
		System.out.println(minIndex);
	}
	

}
