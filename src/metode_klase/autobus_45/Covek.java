package metode_klase.autobus_45;
//Covek poseduje ime i prezime koji se dodeljuju prilikom kreiranja objekta. Svi podaci mogu da se dohvate, ali ne i postave.
public class Covek {

	private String ime;
	private String prezime;
	
	public Covek(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
	}
	
	public String dohvatiIme() {
		return ime;
	}
	
	public String dohvatiPrezime() {
		return prezime;
	}
}
