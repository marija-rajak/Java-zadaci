package metode_klase.drum_49;

/*Napraviti paket drum.
Unutar paketa drum, pisati klase.
Vozac ima ime i prezime koje se zadaje prilikom kreiranja vozaca. Vozac poseduje i broj vozacke dozvole koji se moze dohvatiti i postaviti. Ime vozaca se moze dohvatiti ali ne i postaviti. Vozac se ispisuje u obliku: IME_PREZIME{BROJ_VOZACKE}.
Automobil ima serijski broj koji se zadaje pri kreiranju automobila. Serijski broj se moze samo dohvatiti. Takodje poseduje snagu koja se moze dohvatiti i postaviti. Auto poseduje vozaca i stvara se bez njega(u konstruktoru treba da se vozac postavi na null); Vozac se naknadno postavlja koristeci setter. Vozac se moze postaviti i dohvatiti. Automobil se ispsuje u sledecem formatu: SERIJSKI_BROJ{SNAGA}VOZAC
*/
public class GlavniProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vozac v1 = new Vozac("Pera", "Peric", "123456");
		Auto a1 = new Auto("987654321");
		a1.setVozac(v1);
		a1.setSnaga(150);
		
		System.out.println(a1.getVozac());
		
		System.out.println(a1.toString());
		
	}

}
