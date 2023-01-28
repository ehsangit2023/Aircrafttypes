package Assignments3;

public class SwapValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x =90, y= 60;
		System.out.println("Original values of x and y");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x =x ^ y ^ (y=x);
        
        System.out.println("Swap values of x and y ");
        System.out.println("x = " + x );
        System.out.println("y = " + y );
        
        		
	}

}
