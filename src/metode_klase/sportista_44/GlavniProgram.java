package metode_klase.sportista_44;

public class GlavniProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sportista s1 = new Sportista ("Ronaldinjo", "fudbal", "Barcelona", 10);
		Sportista s2 = new Sportista ("Michael Jordan", "kosarka", "Chicago Bulls", 23);
		Sportista s3 = new Sportista ("Stefana Veljkovic", "odbojka", "reprezentacija", 11);
		
		
		s1.promeniPodatak();
		System.out.println(s1.dohvatiPodatak());
		
		s2.promeniPodatak();
		System.out.println(s2.dohvatiPodatak());
		System.out.println(s2.brojDresa);
		
		s3.brojDresa = 12;
		System.out.println(s3.dohvatiPodatak());
		
		
	}

}
