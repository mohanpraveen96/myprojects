import java.util.Scanner;

public class AddIntegers {

	public static void main(String[] args) {
	
		Scanner scan= new Scanner(System.in);
		
		System.out.println("enter first integer: ");
		int a=scan.nextInt();
		
		System.out.println("enter second integer: ");
		int b=scan.nextInt();
		
		int c=a+b;
	
	System.out.println("the addition of two integers is: "+ c );

	}

}
