package metode_klase.racun_43;

public class Racun {

	private String brRacuna;

	private double stanje;

	public String dohvatiBrRacuna() {
		return brRacuna;
	}

	public double dohvatiStanje() {
		return stanje;
	}

	public boolean uplati(double iznos) {
		if (iznos > 0) {
			stanje += iznos;
			return true;
		}
		System.out.println("Doslo je do greske");
		return false;
	}

	public double podigni(double iznos) {
		if (iznos > 0 && iznos <= stanje) {
			stanje -= iznos;
		} else {
			System.out.println("Greska...");
		}
		return stanje;
	}
}
