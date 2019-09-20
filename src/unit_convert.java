import java.util.InputMismatchException;
import java.util.Scanner;

public class unit_convert {

	public static void main (String[] args) {
		
		System.out.println("Unit converter has started (v1.0)\n");
		System.out.println("What are you converting today?");	
		selectWhatToConvert();
		int number = getUserInt();
		System.out.println("Your Value is:" + number);	
	}
	
	private static void selectWhatToConvert() {
		
		System.out.println("1) Distance");
		System.out.println("2) Mass");
		System.out.println("3) Temperature\n");
		
		String userConverts = null;
		Scanner converParameter = new Scanner(System.in);
		int userSelection = converParameter.nextInt();
		
		
		switch(userSelection) {
			case 1:  userConverts = "You have chosen Distance\n\n\n";
					break;
			case 2:  userConverts = "You have chosen Mass\n\n\n";
					break;
			case 3:  userConverts = "You have chosen Temperature\n\n\n";
					break;
			default: userConverts = "Parameter not supported bye :(";
            		break;
		}
		System.out.println(userConverts);
		//converParameter.close();
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