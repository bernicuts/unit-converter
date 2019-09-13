import java.util.InputMismatchException;
import java.util.Scanner;

public class unit_convert {

	public static void main (String[] args) {
		System.out.println("Unit converter has started (v1.0)");
		getUserInt();
		//isLegal("22");
	}

	private static void getUserInt() {	
		boolean isCorrectlyProvisioned = false ;
		Scanner consoleReader = null;
		
		while(!isCorrectlyProvisioned) {
			System.out.print("Enter a valid integer:");
			consoleReader = new Scanner(System.in);
			String enteredNumber = consoleReader.nextLine();
			
			try {
				
				isCorrectlyProvisioned = isLegal(enteredNumber);
				System.out.print("You have successfully entered: " + enteredNumber);			
			} 
			catch (NumberFormatException ex) {
				System.out.println("Please enter a valid number...\n");
			}
		}
		
		 consoleReader.close();
	}
	
	private static boolean isLegal(String str) throws NumberFormatException {
		System.out.print("\n checking value validity:\n");
		System.out.print(Integer.parseInt( str ));
		if (Integer.parseInt( str ) > 0) {
			System.out.print("\n your value is valid\n");
			return true;
		}
			return false;
	}
		
}

	