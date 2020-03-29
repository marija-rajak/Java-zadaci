package nizovi;

//Napisati program koji ucitava duzinu niza, niz i proverava da li je niz rastuci.

import java.util.Scanner;

public class Rastuci_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj clanova niza");

		int n = sc.nextInt();

		while (n <= 1) {
			System.out.println("Broj mora biti veci od 1, unesite ponovo");
			n = sc.nextInt();
		}

		int[] niz = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Unesite " + (i + 1) + ". clan niza");
			niz[i] = sc.nextInt();
		}

		boolean rastuci = true;

		for (int i = n-1; i > 0 ; i--) {

			if (niz[i-1] < niz[i]) {
				rastuci = false;
				break;
			}
			
		}

		if (rastuci) System.out.println("Niz je rastuci");
		
		else System.out.println("Niz nije rastuci");
	}

}
