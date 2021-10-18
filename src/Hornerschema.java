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
	
		String element = String.valueOf(zahl.charAt(0));
		
		if(element.equalsIgnoreCase("f")) {
			element = "15";
		} else if(element.equalsIgnoreCase("e")) {
			element = "14";
		} else if(element.equalsIgnoreCase("d")) {
			element = "13";
		}else if(element.equalsIgnoreCase("c")) {
			element = "12";
		}else if(element.equalsIgnoreCase("b")) {
			element = "11";
		} else if(element.equalsIgnoreCase("a")) {
			element = "10";
		}
		
		long x = Long.parseLong(element);

		System.out.println(zahl.length());
		
		for(int i = 0; i+1 < zahl.length(); i++) {
			
			String element1 = String.valueOf(zahl.charAt(1+i));
			if(element1.equalsIgnoreCase("f")) {
				element1 = "15";
			} else if(element1.equalsIgnoreCase("e")) {
				element1 = "14";
			} else if(element1.equalsIgnoreCase("d")) {
				element1 = "13";
			}else if(element1.equalsIgnoreCase("c")) {
				element1 = "12";
			}else if(element1.equalsIgnoreCase("b")) {
				element1 = "11";
			} else if(element1.equalsIgnoreCase("a")) {
				element1 = "10";
			}
			
			System.out.println( x + " * " + basis + " + " + Long.parseLong(element1 ) );
			x = x * basis + Long.parseLong(element1);
		
		}
		
		System.out.println("Zahl in Dezimal: " + x);
		scanner.close();
		
	}
	
}
