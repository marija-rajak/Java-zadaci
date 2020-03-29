package metode_klase.planinarenje_51;

public class GlavniProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Planina planina1 = new Planina("Kopaonik", 2169);
		Planina planina2 = new Planina("Alpi", 3008);
		
		Planinar p1 = new Planinar("Pera", "Peric");
		Alpinista a1 = new Alpinista("Mika", "Mikic");
		Alpinista a2 = new Alpinista("Janko", "Jankovic");
		Planinar k1 = new KlasicniPlaninar("Laza", "Lazic");
		
		
		planina1.dodajPlaninare(p1);
		planina2.dodajPlaninare(k1);
		planina2.dodajPlaninare(a1);
		planina2.dodajPlaninare(a2);
		
		a1.postaviPartnera(a2);
		
		System.out.println(a1.dohvatiPartnera());
		System.out.println("\n");
		planina2.ispis();
		System.out.println("\n");
		System.out.println(p1);
		System.out.println("\n");
		System.out.println(a1);
		System.out.println("\n");
		
		
		Planinar.ispisiSve();
		
	}

}
