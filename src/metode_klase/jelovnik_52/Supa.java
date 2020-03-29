package metode_klase.jelovnik_52;

//Supa je jelo za koje se pamti informacija o tome koliko dugo se kuva koja može da se dohvati.

public class Supa extends Jelo {

	private int vreme;
	
	public Supa(String naziv, int vreme) {
		super(naziv);
		this.vreme = vreme;
	}
	
	public int getVrema() {
		return vreme;
	}
}
