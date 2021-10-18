import java.util.Scanner;

public class Hornerschema {

	public static void main(String[] args) {
		
		final Scanner scanner = new Scanner(System.in);
		
		String zahl;
		int basis;
		
		System.out.println("Bitte gebe eine Zahl ein: ");
		zahl = scanner.next();
		System.out.println("Bitte gebe die Basis des Zahlensystems ein: ");
		basis = scanner.nextInt();
	
		
		long x = Long.parseLong(String.valueOf(zahl.charAt((int) ((zahl.length()-1)))));

		for(int i = 1; i < zahl.length(); i++) {
			
			System.out.println( x + " * " + basis + " + " + Long.parseLong(String.valueOf(zahl.charAt((int) ((zahl.length()-1)-i)))));
			x = x * basis + Long.parseLong(String.valueOf(zahl.charAt((int) ((zahl.length()-1)-i))));
		
		}
		
		System.out.println("Zahl in Dezimal: " + x);
		scanner.close();
		
	}
	
}
