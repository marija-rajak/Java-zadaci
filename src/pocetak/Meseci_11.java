package pocetak;
//Napisati program koji na osnovu unetog naziva meseca ispisuje koliko ima meseci u godini koji pocinju na to slovo(na taj glas) - za resavanje ovog zadatka koristiti switch

import java.util.Scanner;

public class Meseci_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		boolean error = false;

		System.out.println("Unesite naziv meseca:");

		String mesec = s.next();

		while (!error) {

			mesec = mesec.toLowerCase();

			switch (mesec) {

			case "mart":
			case "maj":
			case "april":
			case "avgust":
				System.out.println("Jos jedan mesec pocinje istim slovom kao i " + mesec);
				break;

			case "januar":
			case "jun":
			case "jul":

				System.out.println("Jos dva meseca pocinju istim slovom kao i " + mesec);
				break;

			case "februar":
			case "septembar":
			case "oktobar":
			case "novembar":
			case "decembar":

				System.out.println("Nema drugih meseci koji pocinju istim slovom kao i " + mesec);
				break;

			default:

				System.out.println("Niste pravilno uneli naziv meseca!");
				error = true;
				break;

			}

			if (error) {
				System.out.println("Unesite mesec ponovo");

				mesec = s.next();

				error = false;

			} else
				break;

		}

	}

}