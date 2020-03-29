package metode_klase.racun_43;

public class GlavniProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Racun mojRacun = new Racun();
		
		mojRacun.uplati(10000);
		System.out.println(mojRacun.dohvatiStanje());
		
		mojRacun.podigni(1000);
		System.out.println(mojRacun.dohvatiStanje());
		
		
	}

}
