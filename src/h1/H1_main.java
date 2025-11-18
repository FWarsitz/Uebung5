package h1;

public class H1_main {
	public static void main(String[] args) {
		
		int[] myArray = {5, 4, 3}; 
		
		int[] tempArray = new int[myArray.length];
		
		for (int i = 0; i < myArray.length; i++) {
			
			tempArray[i] = myArray[myArray.length - 1 - i];
			
		}
		
		myArray = tempArray;
		
		
	/*	for (int i = 0; i < myArray.length; i++) {
			
			System.out.println(myArray[i]);
			
		}*/

	
		
	}
	
}
