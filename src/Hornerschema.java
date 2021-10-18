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
	
		long x = 0L;
		long length = 0l;

		while(zahl.length() > length) {
			
			x = x * basis + Long.parseLong(
					String.valueOf(
									zahl.charAt((int) ((zahl.length()-1)-length))
							      )
					);
			length++;
		}
		
		System.out.println("Zahl in Dezimal: " + x);
	
	}
	
}
