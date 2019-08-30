import java.util.Scanner;

//adaugat metric-converter
public class unit_convert {
	public static void main (String[] args) {
		System.out.println("___the conversion is being started___");
		System.out.println("-\\hai sa comparam mere cu pere\\-");
		int numer = 0;
		Scanner user_int = new Scanner(System.in);
		System.out.print("provide your integer:");
		
		try {
			int numar = user_int.nextInt();
		}
		catch (Exception e) {
			System.out.print("value invalid");
		}
		
		System.out.print("you have entered:" + numar);
	
	}

}
