package Assignments3A;

public class FindFactorials1 {

	public static void main(String[] args) {
		
		//Factorial for 5!
		
		int num = 10;
		long factorial = 1;
		
		for (int i = num; i==1; i--) {
			
			 factorial = factorial * i;	
			
		}
		
		System.out.println("Factorial of " + num + " is: " + factorial);
		
		
	}

}
