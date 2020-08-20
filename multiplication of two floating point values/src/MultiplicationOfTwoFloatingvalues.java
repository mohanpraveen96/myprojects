import java.util.Scanner;

public class MultiplicationOfTwoFloatingvalues {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter first floating point number: ");
		float a= scan.nextFloat();
		
		System.out.println("enter second floating point number: ");
		float b=scan.nextFloat();
		
		float c=a*b;
	
	System.out.println("the multiplication of two numbers  is: "+ c );
	
	}

}
