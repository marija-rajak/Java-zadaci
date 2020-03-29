package metode_klase.drum_49;

/*Automobil ima serijski broj koji se zadaje pri kreiranju automobila. Serijski broj se moze samo dohvatiti. Takodje poseduje snagu koja se moze dohvatiti i postaviti. Auto poseduje vozaca i stvara se bez njega(u konstruktoru treba da se vozac postavi na null); Vozac se naknadno postavlja koristeci setter. Vozac se moze postaviti i dohvatiti. Automobil se ispsuje u sledecem formatu: SERIJSKI_BROJ{SNAGA}VOZAC*/

public class Auto {

	private String broj;
	private int snaga;
	private Vozac vozac;
	
	public Auto(String serijskiBroj) {
		this.broj = serijskiBroj;
		this.vozac = null;
	}
	
	public String getSerijski() {
		return broj;
	}
	
	public int getSnaga() {
		return snaga;
	}
	
	public Vozac getVozac() {
		return vozac;
	}
	
	public void setSnaga(int snaga) {
		this.snaga =snaga;
	}
	
	public void setVozac(Vozac v) {
		this.vozac = v;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(broj).append("{").append(snaga).append("}").append(vozac);
		return sb.toString();
	}
}
