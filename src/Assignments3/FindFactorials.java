package Assignments3;

public class FindFactorials {

	public static void main(String[] args) {
		//5! = 5*4*3*2*1
		
		
		int num = 5;
		
		long factorial =1;
		
		for (int i=1; i <=num; i++) {
			
			factorial = factorial *i; 
			
		}
		
		
		
		System.out.println("Factorial of " + num +  "  is: " + factorial);
		}
		

	

}
