package pocetak;
//Korisnik unosi dve dimenzije pravougaonika. Potrebno je proveriti da li je u pitanju kvadrat i ispisati informaciju o tome.

import java.util.Scanner;

public class Pravougaonik_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		float a, b;

		System.out.println("Unesite dimenzije pravougaonika");

		a = s.nextFloat();
		b = s.nextFloat();

		while (a <= 0 || b <= 0) {

			System.out.println("Vrednosti moraju biti vece od 0, unesite ponovo");
			a = s.nextFloat();
			b = s.nextFloat();

		}

		if (a == b)
			System.out.println("Figura je kvadrat");
		else
			System.out.println("Figura je pravougaonik");

	}

}
