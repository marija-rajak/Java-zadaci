package pocetak;
//Napisati program koji vraca broj dana unetog meseca

import java.util.Scanner;

public class DaniUMesecima_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		System.out.println("Unesite naziv meseca ciji broj dana zelite da saznate:");

		String mesec = s.next();

		switch (mesec) {

			case "januar":
			case "mart":
			case "maj":
			case "jul":
			case "avgust":
			case "oktobar":
			case "decembar":
				System.out.println("Mesec ima 31 dan");
				break;
	
			case "april":
			case "jun":
			case "septembar":
			case "novembar":
				System.out.println("Mesec ima 30 dana");
				break;
	
			case "februar":
				System.out.println("Mesec ima 28 dana");
				break;
	
			default:
				System.out.println("Niste pravilno uneli naziv meseca, pokusajte ponovo!");
				break;
		}

		s.close();

	}

}
