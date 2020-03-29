package metode_klase.jelovnik_52;

public class GlavniProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sastojak s1 = new Sastojak("batak", 500);
		Sastojak s2 = new Sastojak("sargarepa", 150);
		Sastojak s3 = new Sastojak("voda", 0);
		
		Supa pileca = new Supa("pileca supa", 130);
		pileca.dodajSastojak(s1, 400);
		pileca.dodajSastojak(s2, 200);
		pileca.dodajSastojak(s3, 800);
		
		Sastojak margarin = new Sastojak("margarin", 400);
		Sastojak cokolada = new Sastojak("cokolada", 1000);
		Sastojak brasno = new Sastojak("brasno", 500);
		
		Torta cokoladna = new Torta("cokoladna torta");
		cokoladna.dodajSastojak(margarin, 250);
		cokoladna.dodajSastojak(cokolada, 300);
		cokoladna.dodajSastojak(brasno,300);
		
		System.out.println("Sastojci za cokoladnu tortu kostaju: " + cokoladna.izracunajCenu() + " dinara.");
		
		Meni meni = new Meni();
		meni.dodajNaMeni(pileca);
		meni.dodajNaMeni(cokoladna);

		System.out.println(meni);
		
		System.out.println(cokoladna.proveriMargarin());
	}

}
