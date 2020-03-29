package petlje;

//Napisati program koji racuna sumu parnih brojeva i proizvod neparnih brojeva od 0 do n - za resavanje ovog zadatka koristiti samo jednu petlju (ne jednu vrstu petlje, vec samo jednu petlju). Podrazumeva se da se n ucitava preko standardnog ulaza.

import java.util.Scanner;

public class ZbirProizvod_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		System.out.println("Unesite broj brojeva koji ce se racunati:");

		int n = s.nextInt();
		int zbir, proizvod, i;

		while (n <= 0) {
			System.out.println("Morate uneti pozitivan broj, unesite ponovo:");
			n = s.nextInt();
		}

		for (zbir = 0, proizvod = 1, i = 0; i <= n; i++) {

			if (i % 2 == 0)
				zbir = zbir + i;
			else
				proizvod = proizvod * i;

		}

		System.out.println("Proizvod svih neparnih brojeva do " + n + " iznosi " + proizvod);
		System.out.println("Zbir svih parnih brojeva do " + n + " iznosi " + zbir);

	}

}
