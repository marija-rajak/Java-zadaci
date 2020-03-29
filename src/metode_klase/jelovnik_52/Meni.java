package metode_klase.jelovnik_52;

import java.util.ArrayList;

/*Meni sadrži listu jela. Sadrži metodu koja dodaje jelo u meni. Može da se ispiše ceo meni u sledeæem formatu: 
	Naziv_jela: nazivNamirnice, nazivNamirnice, … , nazivNamirnice
	Naziv_jela: nazivNamirnice, nazivNamirnice, … , nazivNamirnice
	Naziv_jela: nazivNamirnice, nazivNamirnice, … , nazivNamirnice
*/

public class Meni {

	private ArrayList<Jelo> meni;

	public Meni() {
		meni = new ArrayList<Jelo>();
	}

	public void dodajNaMeni(Jelo j) {
		this.meni.add(j);
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < meni.size(); i++) {
			sb.append(meni.get(i).getNaziv().toString()).append(": ");

			for (int j = 0; j < meni.get(i).getSastojci().size(); j++) {
				sb.append(meni.get(i).getSastojci().get(j).getNaziv());

				if (j < meni.get(i).getSastojci().size() - 1)
					sb.append(", ");
				if (j == meni.get(i).getSastojci().size() - 1)
					sb.append("\n");
			}
		}
		return sb.toString();
	}
}
