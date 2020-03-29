package nizovi;

//Napisati program koji ce na standardnom izlazu ispisati proizvod elemenata niza koji su veci od svog indeksa (preko konzole uneti duzinu i clanove niza).

import java.util.Scanner;

public class ClanoviIndexi_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite duzinu niza");
		
		int n = sc.nextInt();
		
		while (n < 2) {
			System.out.println("Broj mora biti veci od 1, unesite ponovo");
			n = sc.nextInt();
		}
		
		int[] niz = new int[n];
		
		int proizvod = 1;
		
		for (int i = 0; i < n; i+=1) {
			System.out.println("Unesite " + i+1 + ". clan niza:") ;
			niz[i] = sc.nextInt();
			if (niz[i]>i) proizvod = proizvod * niz[i]; 
		}
		
		System.out.println("Proizvod clanova niza koji su veci od svog indeksa je " + proizvod);
	}

}
