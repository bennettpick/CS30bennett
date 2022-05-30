/*
 * Author Bennett [pick 
 * Purpose: Square 
 */
package square;

public class squares {
	
	public static void main(String[]args) {
		int[] a = new int[5]; //array
		
		for (int i = 0; i < a.length; i++) {
			int square = i * i;
			a[i] = square;
			System.out.print(a[i]); // print array
		}
	}
}


