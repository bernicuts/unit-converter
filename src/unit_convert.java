import java.util.InputMismatchException;
import java.util.Scanner;


public class unit_convert {

	public static void main (String[] args) {
		System.out.println("Unit converter has started (v1.0)");
		
		boolean isCorrectlyProvisioned = false ;
		
		while(!isCorrectlyProvisioned) {
			Scanner userInt = null;
			try {
				userInt = new Scanner(System.in);
				System.out.print("Enter a valid integer:");
				int number = userInt.nextInt();
				System.out.print("You have successfully entered: " + number);
				isCorrectlyProvisioned = true;
			} catch (InputMismatchException ex) {
				System.out.println("Please enter a valid number...\n");
			} finally {
				if (userInt != null) {
					userInt.close();
				}
			}
		}
	}
}