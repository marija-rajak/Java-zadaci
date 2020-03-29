package nizovi;

import java.util.Scanner;

public class NizMinMax_53 {

//Napraviti niz celih brojeva velièine 20. Uèitavati sa standardnog ulaza elemente niza, a zatim ispisati 6 najmanjih brojeva u jednom redu, a u narednom redu 5 najveæih.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int[] niz = new int[20];

		System.out.println("Unesite clanove niza");
		for (int i = 0; i < 20; i++) {
			System.out.println("Unesite " + (i + 1) + ". clan:");
			niz[i] = sc.nextInt();
		}

		for (int i = 0; i < 20; i++) {
			int min = niz[i];
			int pozMin = i;

			for (int j = i; j < 20; j++) {
				if (niz[j] < min) {
					min = niz[j];
					pozMin = j;
				}

			}
			int privremena = niz[i];
			niz[i] = min;
			niz[pozMin] = privremena;
		}

		System.out.print("Pet najmanjih su: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(niz[i]);
			if (i < 5 - 1)
				System.out.print(", ");
			else
				System.out.println();
		}

		System.out.print("Pet najvecihih su: ");
		for (int i = 15; i < 20; i++) {
			System.out.print(niz[i] + " ");
			if (i < 20 - 1)
				System.out.print(", ");
			else
				System.out.println();
		}
	}
}
