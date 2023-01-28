package Assignments2;

public class Factorial2 {

	public static void main(String[] args) {
		
		
		int num =10;
		
		long factorial = 1;
		
		for (int i=num; i>=1; i--) {
			
			factorial = factorial *i ;
			
		}
			
			System.out.println("Factorial of " + num + " is: " + factorial);
			
			
		
		
	}

}
