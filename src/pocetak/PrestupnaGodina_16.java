package pocetak;
//Napisati program koji ispituje da li je godina prestupna ili nije sve dok korisnik za godinu ne unese broj koji nije pozitivan.

import java.util.Scanner;

public class PrestupnaGodina_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean error = false;

		Scanner s = new Scanner(System.in);

		int godina;

		while (!error) {

			System.out.println("Unesite godinu:");

			godina = s.nextInt();

			if (godina < 0)
				error = true;

			else if (godina % 4 == 0 && (godina % 100 != 0 || godina % 400 == 0))
				System.out.println("Godina je prestupna");

			else
				System.out.println("Godina nije prestupna");

		}

	}

}
