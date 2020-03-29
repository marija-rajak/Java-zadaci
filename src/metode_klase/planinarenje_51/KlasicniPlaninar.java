package metode_klase.planinarenje_51;

/*Klasicni planinar je plainar koji se penje po planinama nizim od 2000m,inace je penjanje
neuspesno.Tekstualni oblik je K_ime-ident.*/

public class KlasicniPlaninar extends Planinar {

	private boolean uspesnost;
	private Planina planina;

	public KlasicniPlaninar(String ime, String prezime) {
		super(ime, prezime);
	}
	
	public void setPlanina(Planina p) {
		this.planina = p;
	}
	
	public Planina getPlanina() {
		return planina;
	}
	
	public boolean proveriUspesnost(Planina p) {
		if (p.getVisina() <= 2000) return uspesnost = true;
		else return uspesnost = false;
	}
	
	@Override
	public String toString() {
		return "K_"+(super.toString());
	}
}
