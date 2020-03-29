package nizovi;

import java.util.Scanner;

//Odrediti maximum niza realnih brojeva

public class MaxNIza_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj clanova niza");

		int n = sc.nextInt();

		while (n <= 1) {
			System.out.println("Broj mora biti veci od 1, unesite ponovo");
			n = sc.nextInt();
		}

		float[] niz = new float[n];

		System.out.println("Unesite clanove niza");

		for (int i = 0; i < n; i++) {
			niz[i] = sc.nextFloat();
		}

		float veci = Math.max(niz[0], niz[1]);

		for (int i = 2; i < n; i++) {
			veci = Math.max(veci, niz[i]);

		}

		System.out.println("Najveci je " + veci);
	}

}
