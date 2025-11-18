package h2;

public class H2_main {

	public static void main(String[] args) {

		int n = 299;
		int digits = 0; 
		//int[] a = new int[9];
		int[] a = {0,0,0,0,0,0,0,0,0};
		
		
		if (n == 0) {
			digits = 1;
		}else
		{
			int temp = n;
			while (temp> 0) {
				digits++;
				temp /= 10; 
			}
		}
		
		int index = 8;
		int number = n;
		
		if (number == 0) {
			a[8] = 0;
			
		}
		else {
			while (number > 0 ) {
				int z  = number % 10;
				a[index] = z ; 
				number /= 10;
				index--;
			}
		}
		
		/* System.out.println(digits);

	       
	     for (int i = 0; i < a.length; i++) {
	         System.out.print(a[i] + " ");
	     }*/
		
	}

}
