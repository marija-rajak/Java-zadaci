package metode_klase.drum_49;

/*Vozac ima ime i prezime koje se zadaje prilikom kreiranja vozaca. Vozac poseduje i broj vozacke dozvole koji se moze dohvatiti i postaviti. Ime vozaca se moze dohvatiti ali ne i postaviti. Vozac se ispisuje u obliku: IME_PREZIME{BROJ_VOZACKE}.*/

public class Vozac {

	private String ime;
	private String prezime;
	private String brVozacke;
	
	public Vozac(String ime, String prezime, String brVozacke) {
		this.ime = ime.toUpperCase();
		this.prezime = prezime.toUpperCase();
		this.brVozacke = brVozacke;
	}
	
	public String getIme() {
		return ime;
	}
	
	public String getPrezime() {
		return prezime;
	}
	
	public String getBrVozacke() {
		return brVozacke;
	}

	public void setBrVozacke(String broj) {
		this.brVozacke = broj;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(ime).append("_").append(prezime);
		return sb.toString();
	}
	
}
