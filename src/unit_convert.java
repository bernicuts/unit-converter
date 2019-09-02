import java.util.Scanner;

//adaugat metric-converter
public class unit_convert {
	public static void main (String[] args) {
		System.out.println("___the conversion is being started___");
		System.out.println("-\\hai sa comparam mere cu pere\\-");
		
		boolean varType = true ; // that would be a sentinel variable
		
		while(varType) {
			
			try {
				Scanner user_int = new Scanner(System.in);
				System.out.print("provide your integer:");
				int numar = user_int.nextInt();
				System.out.print("you have successfuly entered:" + numar);
				varType = false;
			}
			catch (Exception e) {
				System.out.println("value invalid, try again with a number...\n");
			}
		}

		
		
	
	}

}
