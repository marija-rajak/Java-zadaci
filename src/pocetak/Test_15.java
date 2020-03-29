package pocetak;
/*
* Napisati program koji ce da testira poznavanje while petlje na sledeci nacin:
* Ispisuje poruku sa pitanjem koja kljucna rec izlazi iz petlje u programskom
* jeziku Java, i ponudjene odgovore: A: int B: continue C: exit D: break
* Obezbediti da nakon odabira korisnik dobije informaciju da li je tacno
* odgovorio na pitanje.
* Ukoliko nije, pitati ga da li zeli da pokusa ponovo i ako je odgovor potvrdan
* omoguciti ponovni pokusaj.
*/

import java.util.Scanner;

public class Test_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		System.out.println("Koja kljucna rec izlazi iz petlje u programskom jeziku Java?");
		System.out.println("A: int");
		System.out.println("B: continue");
		System.out.println("C: exit");
		System.out.println("D: break");
		System.out.println("Unesite odgovor");

		String odgovor = s.next();
		boolean error = true;
		String odluka;

		while (error) {
			if (odgovor.equals("D")) {
				System.out.println("Odgovor je tacan!");
				error = false;
			} else {
				System.out.println("Odgovor nije tacan. Zelite li da pokusate ponovo?");
				odluka = s.next();

				switch (odluka) {

				case "DA":
					System.out.println("Unesite odgovor");
					odgovor = s.next();
					error = true;

				case "NE":
					error = false;

				}

			}

		}

	}

}
