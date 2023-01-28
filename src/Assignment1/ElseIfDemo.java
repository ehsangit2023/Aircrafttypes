package Assignment1;

public class ElseIfDemo {

	public static void main(String[] args) {
		int num1 =15;
		int num2 =20;
		
		if (num1>num2)
			System.out.println("num1 is bigger");

		else if (num1<num2)
			System.out.println("num2 is bigger");
		else if (num1==num2)
			System.out.println("Both are same");
		else 
			System.out.println("error");
					
	}

}
