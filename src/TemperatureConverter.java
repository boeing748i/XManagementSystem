import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {

			System.out.println("Input the F - Temp : ");
			Scanner input = new Scanner(System.in);
			int f = input.nextInt();
			double result = (5.0/9) * (f-32);
			System.out.println("Here are the Anwer! : ");
			System.out.println(result);
			
		}
}