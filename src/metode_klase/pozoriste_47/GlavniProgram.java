package metode_klase.pozoriste_47;

public class GlavniProgram {

	public static void ispis() {
		System.out.println("Ukupan broj klikera je " + Dete.dohvatiBrojKlikera());
		System.out.println("Prosek godina dece je " + Dete.dohvatiProsekGodina());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dete d1 = new Dete("Lionel", "Mesi", 8, 15);
		Dete d2 = new Dete("Ivana", "Spanovic", 5, 16);
		Dete d3 = new Dete("Ana", "Ivanovic", 7, 25);
		Dete d4 = new Dete("Aleksandar", "Djordjevic", 9, 20);
		
		ispis();
				
		d3.dodajKlikere(25);
		d1.dodajKlikere(5);
		
		ispis();
		
		d3.oduzmiKlikere(50);
		
		ispis();
		
		
		
	}

}
