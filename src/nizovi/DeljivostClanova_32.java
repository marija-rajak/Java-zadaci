package nizovi;

//Korisnik ucitava niz od n elemenata niza, kao i neki broj br. Program ispisuje elemente niza deljive brojem br.

import java.util.Scanner;

public class DeljivostClanova_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj clanova niza");

		int n = sc.nextInt();

		while (n <= 0) {
			System.out.println("Broj mora biti veci od 0, unesite ponovo");
			n = sc.nextInt();
		}

		int[] niz = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Unesite " + (i + 1) + " clan niza");
			niz[i] = sc.nextInt();
		}

		System.out.println("Unesite broj za proveru deljivosti");

		int br = sc.nextInt();

		while (br == 0) {
			System.out.println("Nula ne moze biti delilac, unesite ponovo");
			br = sc.nextInt();
		}

		String deljivi = "";

		for (int i = 0; i < n; i++) {
			int ostatak = niz[i] % br;

			if (ostatak == 0)
				deljivi = deljivi + " " + niz[i];

		}

		if (deljivi.isEmpty())
			System.out.println("Nema clanova niza deljivih brojem " + br);
		else
			System.out.println("Brojem " + br + " deljivi su sledeci clanovi niza:" + deljivi);

	}

}
