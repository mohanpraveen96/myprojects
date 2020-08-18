import java.util.Scanner;

public class ReadInput {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number: ");
		
		int number=scan.nextInt();
		System.out.println("You entered: "+number);
	}

}
