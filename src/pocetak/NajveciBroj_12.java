package pocetak;
//Ucitati tri broja i ispisati njihov maksimum

import java.util.Scanner;

public class NajveciBroj_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		float broj_1, broj_2, broj_3;

		int operacija = 1;

		while (operacija == 1) {

			System.out.println("Unesite prvi broj:");

			broj_1 = s.nextFloat();

			System.out.println("Unesite drugi broj:");

			broj_2 = s.nextFloat();

			System.out.println("Unesite treci broj:");

			broj_3 = s.nextFloat();

			if (broj_1 > broj_2 && broj_1 > broj_3)
				System.out.println("Broj " + broj_1 + " je najveci");

			else if (broj_2 > broj_1 && broj_2 > broj_3)
				System.out.println("Broj " + broj_2 + " je najveci");

			else if (broj_3 > broj_1 && broj_3 > broj_2)
				System.out.println("Broj " + broj_3 + " je najveci");

			else {
				System.out.println("Neki od unetih brojeva su isti, unesite ponovo");
				continue;
			}

			System.out.println("Ako zelite da zavrsite, unesite 0, ako zelite da nastavite, unesite 1");

			operacija = s.nextInt();

			while (operacija != 0 && operacija != 1) {
				System.out.println("Niste uneli dobru operaciju, unesite ponovo");
				operacija = s.nextInt();
			}

			if (operacija == 0)
				break;

		}

	}

}
