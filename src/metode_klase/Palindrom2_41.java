package metode_klase;

//Zadatak Palindrom uraditi koristeci metode.

import java.util.Scanner;

public class Palindrom2_41 {

	public static int unosDuzine(Scanner s) {
		
		System.out.println("Unesite broj elemenata u nizu");
		
		int n = s.nextInt();

		while (n <= 1) {
			System.out.println("Niz mora imati najmanje 2 clana, unesite ponovo");
			n = s.nextInt();
		}

		return n;

	}

	public static int[] unosNiza(int n, Scanner s) { 
		
		System.out.println("Unesite clanove niza");
		
		int[] niz = new int[n];
		
		for (int i = 0; i < n; i++) {
			niz[i] = s.nextInt();
		}
		
		return niz;
	}
	
	public static void provera(int[] niz) {
		
		boolean palindrom = true;

		for (int a = 0, b = niz.length - 1; a <= niz.length / 2 && b >= niz.length / 2; a++, b--) {
			if (niz[a] != niz[b]) {
				palindrom = false;
				System.out.println("Niz nije palindrom");
				break;
			}
		}
		if (palindrom) System.out.println("Niz jeste palindrom");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		provera(unosNiza(unosDuzine(sc), sc));
		
		
			
	}

}
