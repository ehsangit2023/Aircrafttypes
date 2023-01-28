package Assignments2;

public class SwapValues {

	public static void main(String[] args) {
		
		int x = 25, y =35;
		System.out.println("Original values of x and y");
		System.out.println("x =  " + x );
		System.out.println("y =  " + y );
		x = x ^ y ^ (y=x);
		
		System.out.println("Swapped values of x and y");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		

		
		}
		
		
	}


