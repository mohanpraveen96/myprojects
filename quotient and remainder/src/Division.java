import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter dividend value: ");
		int dividend=scan.nextInt();
		
		System.out.print("Enter divisor value: ");
		int divisor=scan.nextInt();
		
		int quotient=dividend/divisor;
		int remainder=dividend%divisor;
		
		System.out.println("Quotient= "+ quotient + "\nRemainder= "+ remainder);
		

	}

}
