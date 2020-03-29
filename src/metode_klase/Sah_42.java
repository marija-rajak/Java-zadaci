package metode_klase;
//Na tabli stoje beli pion i crni skakac. Beli pion pocinje sa dna table a crni skakac sa vrha. Korisnik prvo unosi poziciju piona kao dva cela broja, a zatim poziciju skakaca, gde prvi broj predstavlja red, a drugi kolonu. Program treba da ispise da li se figure nalaze u poziciji da je skakac napadnut.

import java.util.Scanner;

public class Sah_42 {

	public static int[] definisiPoziciju() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite red:");
		int y = unos(sc, sc.nextInt());
		System.out.println("Unesite kolonu:");
		int x = unos(sc, sc.nextInt());

		int[] pozicija = { y, x };

		return pozicija;
	}

	public static int unos(Scanner sc, int pozicija) {
		int x = pozicija;
		while (x < 1 || x > 8) {
			System.out.println("Unos nije dobar, unesite ponovo:");
			x = sc.nextInt();
		}
		return x;
	}

	public static boolean procena(int[] a, int[] b) {
		if (a[0] != b[0] + 1) {
			return false;
		} else if (a[1] == b[1] + 1 || a[1] == b[1] - 1) {
			return true;
		} else
			return false;
	}

	public static boolean dodatak(int[] a, int[] b) {
		if (Math.abs(a[0] - b[0]) != 1 && Math.abs(a[0] - b[0]) != 2) {
			return false;
		} else if (Math.abs(a[0] - b[0]) == 1 && Math.abs(a[1] - b[1]) == 2) {
			return true;
		} else if (Math.abs(a[0] - b[0]) == 2 && Math.abs(a[1] - b[1]) == 1) {
			return true;
		} else
			return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Unesite poziciju pesaka");

		int pesak[] = definisiPoziciju();

		System.out.println("Unesite poziciju skakaca");

		int skakac[] = definisiPoziciju();

		boolean izvestaj = procena(pesak, skakac);

		if (izvestaj)
			System.out.println("Skakac je napadnut");
		else
			System.out.println("Skakac nije napadnut");

		boolean izvestaj2 = dodatak(pesak, skakac);

		if (izvestaj2)
			System.out.println("Pesak je napadnut");
		else
			System.out.println("Pesak nije napadnut");
	}

}
