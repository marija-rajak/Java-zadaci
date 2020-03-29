package metode_klase.autobus_45;
/*Covek poseduje ime i prezime koji se dodeljuju prilikom kreiranja objekta. Svi podaci mogu da se dohvate, ali ne i postave.
Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).
Putnik je covek koji poseduje novac. Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje prilikom kreiranja. Odredjena svota novca moze da mu se doda i/ili oduzme, gde je potrebno vratiti indikator uspesnosti.
Autobus poseduje naziv, vozaca, cenu karte i listu putnika koji se njime voze. Naziv i cena karte i zadaju se prilikom kreiranja. Moguce je dodati/ukloniti putnika kao i vozaca. Moguce je naplatiti kartu putnicima samo ako je vozac prisutan. 
Autobus ispisati u sledecem obliku: Naziv ( vozac - Putnik1[novac], Putnik2 [novac],... )*/

public class GlavniProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Karta Grcka1 = new Karta("Beograd-Lefkada", 50);
		Karta Grcka2 = new Karta("Beograd-Halkidiki", 35);
		Karta Grcka3 = new Karta("Beograd-Tasos", 40);
		
		Autobus a1 = new Autobus("Beograd-Nidri", new Karta("Bgd-Ndr", 50), 50);
		Autobus a2 = new Autobus("Beogard-Lefkas", Grcka1, 35);
		Autobus a3 = new Autobus("Beograd-Limenaria", Grcka3, 48);
		Autobus a4 = new Autobus("Beograd-Vourvourou", Grcka2, 3);
		
		Putnik p1 = new Putnik("Pera", "Peric", 200);
		Putnik p2 = new Putnik("Zika", "Zikic", 120);
		Putnik p3 = new Putnik("Laza", "Lazic", 20);
		Putnik p4 = new Putnik("Ana", "Ancic", 80);
		Putnik p5 = new Putnik("Cana", "Canic", 150);
		
		a1.dodajVozaca(new Vozac("Majstor", "Mile"));
		a4.dodajVozaca(new Vozac("Majstor", "Bole"));
		
		a1.dodajPutnika(p3);
		a4.dodajPutnika(p2);
		a4.dodajPutnika(p1);
		a4.dodajPutnika(p5);
		a4.dodajPutnika(p4);
		
		System.out.println(a4.toString());
		System.out.println(p4.dohvatiNovac());
		System.out.println();
		
		
		
		
		
		
	}

}
