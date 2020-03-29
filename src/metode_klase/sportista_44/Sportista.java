package metode_klase.sportista_44;

import java.util.Scanner;

public class Sportista {

	private String imePrezime;
	private String sport;
	private String klub;
	public int brojDresa;

	public Sportista(String ip, String s, String k, int brd) {
		imePrezime = ip;
		sport = s;
		klub = k;
		brojDresa = brd;
	}

	public void promeniPodatak() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite naziv podatka koji zelite da promenite: klub ili broj dresa");

		String podatak = proveraUnosa(sc.nextLine().toLowerCase());

		if (podatak.equals("klub"))
			klub = sc.next();

		else if (podatak.equals("broj dresa")) 
			brojDresa = sc.nextInt();
		
		else System.out.println("Ne mozete da izmenite ovaj podatak");
		return;
	}

	public String dohvatiPodatak() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite naziv podatka koji zelite da vidite: ime i prezime, sport, klub ili broj dresa");

		String podatak = proveraUnosa(sc.nextLine().toLowerCase());
		
		if (podatak.equals("ime i prezime"))
			return imePrezime;

		else if (podatak.equals("sport"))
			return sport;

		else if (podatak.equals("klub"))
			return klub;

		else
			return "" + brojDresa;
	}

	public String proveraUnosa(String podatak) {

		while (!podatak.equals("ime i prezime") && !podatak.contentEquals("sport") && !podatak.contentEquals("klub")
				&& !podatak.equals("broj dresa")) {

			System.out.println("Pogresan unos, unesite ponovo");

			Scanner sc = new Scanner(System.in);
			
			podatak = sc.nextLine().toLowerCase();
		}

		return podatak;
	}

}