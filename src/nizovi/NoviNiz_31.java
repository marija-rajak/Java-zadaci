package nizovi;

//Uneti dva niza, duzinu unosi korisnik, sabrati elemente sa istovetnih pozicija i od zbirova formirati nove clanove niza

import java.util.Scanner;

public class NoviNiz_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		System.out.println("Unesite broj clanova prvog niza");

		int n = s.nextInt();

		System.out.println("Unesite broj clanova drugog niza");

		int m = s.nextInt();

		int[] niz1 = new int[n];

		int[] niz2 = new int[m];
		

		System.out.println("Unesite clanove prvog niza");

		for (int i = 0; i < n; i++) {
			niz1[i] = s.nextInt();
		}

		System.out.println("Unesite clanove drugog niza");

		for (int j = 0; j < m; j++) {
			niz2[j] = s.nextInt();
		}

		System.out.println("Clanovi prvog niza su:");

		for (int i = 0; i < n; i++) {
			System.out.print(niz1[i]);
			if (i < n - 1) {
				System.out.print(", ");
			}
		}
		
		System.out.println();
		
		System.out.println("Clanovi drugog niza su:");

		for (int i = 0; i < m; i++) {
			System.out.print(niz2[i]);
			if (i < m - 1) {
				System.out.print(", ");
			}
		}
		
		System.out.println();
		
		int[] niz3 = new int[Math.max(m,n)];
		
		for (int i = 0; i<Math.min(m,n); i+= 1) {
			niz3[i] = niz1[i] + niz2[i];
		}
		
		for (int i = Math.min(m,n); i<Math.max(m,n); i++) {
			if (m>n) niz3[i] = niz2[i];
			else niz3[i] = niz1[i];
		}
		
		System.out.println("Clanovi novog niza su:");

		for (int i = 0; i < niz3.length; i++) {
			System.out.print(niz3[i]);
			if (i < niz3.length - 1) {
				System.out.print(", ");
			}
		}
	}

}
