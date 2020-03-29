package petlje;

//Napisati program za bankomat, 1-provera stanja na racunu 2-podize novac 3-uplacuje novac 0-izlaz

import java.util.Scanner;

public class Bankomat_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		float stanje = 0;
		float iznos;
		int n;

		do {

			System.out.println("Unesite 1 za proveru stanja, 2 za podizanje novca, 3 za uplatu, 0 za izlaz:");

			n = s.nextInt();

			switch (n) {

			case 1:
				System.out.println("Stanje na vasem racunu iznosi " + stanje + " RSD");
				break;

			case 2:
				if (stanje != 0) {
					System.out.println("Unesite iznos koji zelite da podignete");
					iznos = s.nextFloat();
					while (iznos > stanje || iznos < 0) {
						System.out.println(
								"Nemate dovoljno novca na racunu, ili ste uneli negativnu vrednost, pokusajte sa drugim iznosom!");
						iznos = s.nextFloat();
					}
					stanje = stanje - iznos;
				} else
					System.out.println("Ne mozete da podignete novac");
				break;

			case 3:
				System.out.println("Unesite iznos koji zelite da uplatite");
				iznos = s.nextFloat();
				while (iznos < 0) {
					System.out.println("Iznos uplate mora biti pozitivan, unesite ponovo");
					iznos = s.nextFloat();
				}
				stanje = stanje + iznos;
				break;

			default:
				System.out.println("Niste uneli dobru opciju!");
			}

		} while (n != 0);

		System.out.println("Hvala sto ste koristili nas bankomat!");
	}

}
