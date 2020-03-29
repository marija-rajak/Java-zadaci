package nizovi;

import java.util.Scanner;

/*U sistemu postoji sedam korisnika. Korisnici unose iznos svoje meseène zarade sve dok ne unesu negativnu vrednost za iznos. Nakon toga kreæe unos za sledeæeg korisnika i tako dalje. Program se prekida kada neki korisnik unese vrednost 0. Pre prekida treba ispisati svim korisnicima proseène plate.
Napomena: Dakle, obezbediti da ne mora svih sedam unositi zarade!*/

public class Zarade_55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double[] proseci = new double[7];

			for (int i = 0; i < 7; i++) {

				System.out.println("Unesite zarade za " + (i + 1) + ". korisnika");

				float zarada = sc.nextFloat();
				float ukupno = 0;
				double n = 0;

				while (zarada > 0) {
					ukupno += zarada;
					n++;
					zarada = sc.nextFloat();
				}

				proseci[i] = ukupno / n;

				if (zarada < 0)
					continue;
				else break;
			}

		for (int i =0; i < proseci.length; i++) {
			if (proseci[i] != 0)
				System.out.println("Prosek zarada za " + (i+1) + ". korisnika je: " + proseci[i]);
		}

	}

}
