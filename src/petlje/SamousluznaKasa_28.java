package petlje;

/*Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za potrosace sadrzi sledece opcije:

0 - Izlaz iz programa
1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)
2 - naplata racuna

Ukoliko korisnik unese opciju 0 program se zavrsava.
Ukoliko korisnik unese opciju 1 program pita korisnika da unese cenu proizvoda i ta cena se dodaje na racun u prodavnici.
Ukoliko korisnik unese opciju 2 program pita korisnika da unese kolicinu novca za naplatu racuna.
Ukoliko korisnik unese vrednost manju od vrednosti racuna, potrebno je da se ispise greska, bez umanjenja racuna i da se ponovo ispise meni.
Ukoliko korisnik unese vrednost vecu ili jednaku od cene racuna ispisuje se kusur i racun se ponovo postavlja na nulu. Zatim se ponovo ispisuje meni.*/

import java.util.Scanner;

public class SamousluznaKasa_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		System.out.println("Dobrodosli na samousluznu kasu. Izaberite opciju:");
		System.out.println("1-dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)");
		System.out.println("2-naplata racuna");
		System.out.println("0-Izlaz iz programa");

		int izbor = s.nextInt();
		float cena, racun, uplata, kusur;
		racun = 0;

		do {
			switch (izbor) {
			case 0:
				break;
			
			case 1:
				do {
					System.out.println("Unesite cenu");
					cena = s.nextFloat();
					racun = racun + cena;
					System.out.println("Vas racun iznosi " + racun);
					System.out.println("Izaberite 1 da dodate sledeci proizvod, 2 za placanje");
					izbor = s.nextInt();
				} while (izbor == 1);
				continue;
			case 2:
				if (racun == 0) {
					System.out.println("Jos uvek niste dodali proizvode, vratite se na glavni meni");

				} else {
					System.out.println("Unesite iznos uplate:");
					uplata = s.nextFloat();
					kusur = uplata - racun;
					if (kusur < 0) {
						System.out.println("Greska! Vratite se na glavni meni");
					} else {
						System.out.println("Vas kusur iznosi " + kusur);
						racun = 0;
					}
				}

			default:
				if (izbor < 0 || izbor > 2) {
					System.out.println("Izabrali ste nepostojecu opciju, birajte ponovo");
				} else {
					System.out.println("Izaberite opciju za nastavak");
				}
				System.out.println("1-dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)");
				System.out.println("2-naplata racuna");
				System.out.println("0-Izlaz iz programa");
				izbor = s.nextInt();

			}
		} while (izbor != 0);
		System.out.println("Hvala sto ste koristili samousluznu kasu!");

	}
}
