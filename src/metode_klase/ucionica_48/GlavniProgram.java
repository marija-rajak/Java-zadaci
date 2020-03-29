package metode_klase.ucionica_48;

public class GlavniProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Laptop l1 = new Laptop("hp");
		Laptop l2 = new Laptop("dell");
		Laptop l3 = new Laptop("lenovo");
		
		Polaznik p1 = new Polaznik("Marija", "Rajak");
		Polaznik p2 = new Polaznik("Vera", "Nikolic");
		Polaznik p3 = new Polaznik("Jovana", "Cirovic");
		Polaznik p4 = new Polaznik("Vladan", "Vladisavljevic");
		Polaznik p5 = new Polaznik("Aleksandra", "Leontijevic");
		Polaznik p6 = new Polaznik("Neda", "Knezevic");
			
		l1.dodajPolaznika(p1);
		l1.dodajPolaznika(p2);
		l1.dodajPolaznika(p4);
		l1.dodajPolaznika(p5);
		
		l2.dodajPolaznika(p3);
		l2.dodajPolaznika(p2);
		
		l3.dodajPolaznika(p5);
		l3.dodajPolaznika(p1);
		l3.dodajPolaznika(p2);
		l3.dodajPolaznika(p6);
		
		System.out.println(l1.ispis());
		System.out.println(l2.ispis());
		System.out.println(l3.ispis());
		
		l3.ukloniPolaznika(p1);
		
		System.out.println(l3.ispis());
		
	}

}
