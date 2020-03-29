package nizovi;

//Napisati program koji ucitava duzinu niza, niz i ispisuje niz inverznim redosledom.

import java.util.Scanner;

public class InverzniNiz_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite broj clanova niza");
		
		int n = sc.nextInt(); //duzina niza
		
		while (n <= 1) {
			System.out.println("Broj mora biti veci od 1, unesite ponovo");
			n = sc.nextInt();
		}
		
		int[] niz = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Unesite " + (i + 1) + " clan niza");
			niz[i] = sc.nextInt();
		}

		System.out.println("Inverzni redosled:");
		
		for (int i = 0; i < n; i++) {
			System.out.print(niz[n-1-i]);
			if (i < n-1) System.out.print(", ");
		}
	}

}
