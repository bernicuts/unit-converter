import java.util.InputMismatchException;
import java.util.Scanner;

public class unit_convert {

	public static void main (String[] args) {
		System.out.println("Unit converter has started (v1.0)");
		
		int number = getUserInt();
		System.out.println("Your Value is:" + number);		
	}

	private static int getUserInt() {	
		boolean isCorrectlyProvisioned = false ;
		Scanner consoleReader = null;
		int enteredNumber = 0;
		
		while(!isCorrectlyProvisioned) {
			System.out.print("Enter a valid integer:");
			consoleReader = new Scanner(System.in);
						
			try {
				enteredNumber = consoleReader.nextInt();
				isCorrectlyProvisioned = valueIsLegal(enteredNumber);					
			} 
			
			catch (InputMismatchException ex) {
				System.out.println("Please enter a valid number...\n");
			}
		}
		 consoleReader.close();
		 return enteredNumber;
	}
	
	private static boolean valueIsLegal(int value) {
		System.out.print("\n checking value validity:\n");
		return value > 0;			
	}
}	