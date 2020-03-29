package petlje;
import java.util.Scanner;

//Napisati program u programskom jeziku Java koji ispunjava sledece funkcionalnosti: sacuva jednu rec proizvoljno odabranu u jednoj promeljivoj, omogucava korisniku da unosi reci sve dok ne pogodi rec koja je odabrana u prethodnom koraku. Nakon svakog korisnickog unosa ispisati poruku da li je pogodio rec ili nije
//Modifikovati zadatak tako da korisnik moze da pogadja rec najvise pet puta. 

public class PogodiRec_59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		String a = "skola";

		String b;

		boolean error = true;

		for (int i = 0; i < 5 && error; i++) {

			System.out.println("Ovo je Vas " + (i + 1) + ". pokusaj. Unesite rec:");

			b = s.next();

			b = b.toLowerCase();

			if (b.contentEquals(a)) {
				System.out.println("Pogodili ste zadatu rec! Cestitamo!");
				error = false;
			} else if (a.contains(b) && i < 4) {
				System.out.println("Pogodili ste deo reci");
			} else if (i < 4) {
				System.out.println("Niste uspeli, pokusajte ponovo!");
			} else System.out.println("Niste uspeli da pogodite zadatu rec iz pet puta");

		}
		
	}

}
