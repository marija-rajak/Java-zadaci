package nizovi;

//Napisati program koji ce na standarnom izlazu ispisati poruku “Niz je palindrom” ili “Niz nije palindrom” (u zavisnosti da li niz jeste ili nije palindrom). Korisnik unosi int [ ].

import java.util.Scanner;

public class Palindrom_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj elemenata u nizu");

		int n = sc.nextInt();

		int[] niz = new int[n];

		while (n <= 1) {
			System.out.println("Niz mora imati najmanje 2 clana, unesite ponovo");
			n = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			niz[i] = sc.nextInt();
		}

		boolean palindrom = true;

		for (int a = 0, b = niz.length - 1; a <= niz.length / 2 || b >= niz.length / 2; a++, b--) {
			if (niz[a] != niz[b]) {
				palindrom = false;
				System.out.println("Niz nije palindrom");
				break;
			}
		}
		
		if (palindrom)
				System.out.println("Niz jeste palindrom");
	}

}
