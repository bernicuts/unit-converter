import java.util.InputMismatchException;
import java.util.Scanner;


public class unit_convert {

	public static void main (String[] args) {
		System.out.println("Unit converter has started (v1.0)");
		
		boolean isCorrectlyProvisioned = false ;
		Scanner consoleReader = null;

		while(!isCorrectlyProvisioned) {
			System.out.print("Enter a valid integer:");
			try {
				consoleReader = new Scanner(System.in);
				int enteredNumber = consoleReader.nextInt();
				isCorrectlyProvisioned = true;
				System.out.print("You have successfully entered: " + enteredNumber);
			} catch (InputMismatchException ex) {
				System.out.println("Please enter a valid number...\n");
			}
		}

		consoleReader.close();
	}
}