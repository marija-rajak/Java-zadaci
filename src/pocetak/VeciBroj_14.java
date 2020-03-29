package pocetak;
//Ucitati dva broja i ispisati koji od njih je veci.

import java.util.Scanner;

public class VeciBroj_14 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		float broj_1, broj_2;

		int operacija = 1;

		while (operacija == 1) {

			System.out.println("Unesite prvi broj:");

			broj_1 = s.nextFloat();

			System.out.println("Unesite drugi broj:");

			broj_2 = s.nextFloat();

			if (broj_1 > broj_2)
				System.out.println("Broj " + broj_1 + " je veci od broja " + broj_2);

			else if (broj_1 < broj_2)
				System.out.println("Broj " + broj_2 + " je veci od broja " + broj_1);

			else
				System.out.println("Brojevi su jednaki");

			System.out.println("Ako zelite da zavrsite, unesite 0, ako zelite da nastavite, unesite 1");

			operacija = s.nextInt();

			while (operacija != 0 && operacija != 1) {
				System.out.println("Niste uneli dobru operaciju, unesite ponovo");
				operacija = s.nextInt();
			}

			if (operacija == 0)
				break;
			/*if (operacija == 1)
				continue;*/

		}

	}

}
