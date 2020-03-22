import java.util.Scanner;

public class ifChecker {

	public static void main(String[] args) {
		try (var input = new Scanner(System.in)) {
			int x = input.nextInt();
			
			if((x % 2)==0) {
				System.out.println("Even Number");
				
			}
			
			else {
				System.out.println("Odd number");
			}
		}
		System.out.println("End!");
	}

}
