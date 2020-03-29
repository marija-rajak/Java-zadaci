package pocetak;
//Napisati program koji ce racunati povrsinu okrecene prostorije. Ivice se ucitavaju preko konzole Pretpostaviti da su zidovi oblika pravougaonika, i da prostorija nema prozora.

import java.util.Scanner;

public class PovrsinaProstorije_6 {

	/*
	 * Napisati program koji ce racunati povrsinu okrecene prostorije Ivice se
	 * ucitavaju preko konzole Pretpostaviti da su zidovi oblika pravougaonika, i da
	 * prostorija nema prozora
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		float duzina, sirina, visina;

		System.out.println("Unesite duzinu prostorije u metrima");

		duzina = s.nextFloat();

		if (duzina <= 0) {
			System.out.println("Duzina mora biti veca od 0!");
		} else {

			System.out.println("Unesite sirinu prostorije u metrima");
		}

		sirina = s.nextFloat();

		if (sirina <= 0) {
			System.out.println("Sirina mora biti veca od 0!");
		} else if  (sirina>0) {

			System.out.println("Unesite visinu prostorije u metrima");
		}

		visina = s.nextFloat();
 
		if (sirina <= 0) {
			System.out.println("Visina mora biti veca od 0!");
		} else {
			float povrsina = 2 * duzina * visina + 2 * sirina * visina + duzina * sirina;
			System.out.println("Okrecena povrsina iznosi " + povrsina + " m2");
		}

	}

}
