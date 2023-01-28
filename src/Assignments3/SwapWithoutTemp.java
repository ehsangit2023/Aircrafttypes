package Assignments3;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int X = 10, Y = 15;
		
		System.out.println("Original values of X and Y");
		System.out.println("X = " + X);
		System.out.println("Y = " + Y);
		
	    X = X ^ Y ^ (Y=X);
	    
	    System.out.println("Swap values of X and Y");
	    System.out.println("X = " + X);
	    System.out.println("Y = " + Y);

	}

}
