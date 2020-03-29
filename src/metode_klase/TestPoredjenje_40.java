package metode_klase;

import java.util.Arrays;
import java.util.Scanner;

//Ucitavanje rezultata 1. testa, 2. testa i racunanje proseka-metoda koja ucitava niz, ispisuje niz, racuna poredjenje
//Dodatak: ispisati redni broj osobe s najvecim prosekom

public class TestPoredjenje_40 {

	public static float[] unesi() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj studenata");

		int br = sc.nextInt();

		float[] rezultati = new float[br];

		for (int i = 0; i < rezultati.length; i++) {

			System.out.println("Unesite rezultate " + (i + 1) + ". studenta:");
			rezultati[i] = sc.nextFloat();

			while (rezultati[i] < 0) {

				System.out.println("Ne moze biti negativno, unesite ponovo");
				rezultati[i] = sc.nextFloat();
			}
		}
		return rezultati;
	}

	public static float[] poredjenje(float[] a, float[] b) {

		float[] prosek = new float[Math.max(a.length, b.length)];

		for (int i = 0; i < prosek.length; i++) {

			if (i < Math.min(a.length, b.length))
				prosek[i] = (a[i] + b[i]) / 2;

			else if (a.length > b.length)
				prosek[i] = a[i] / 2;
			else
				prosek[i] = b[i] / 2;
		}
		return prosek;
	}

	public static void ispis(float[] niz) {

		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Unesite rezultate prvog testa");

		float[] test1 = unesi();

		ispis(test1);

		System.out.println("Unesite rezultate drugog testa");

		float[] test2 = unesi();

		ispis(test2);

		System.out.println("Poredjenje rezultata");

		float[] prosek = poredjenje(test1, test2);

		System.out.println(Arrays.toString(prosek));

		float max = prosek[0];
		int rbr = 1;

		for (int i = 1; i < prosek.length; i += 1) {

			if (prosek[i] > max) {
				max = prosek[i];
				rbr = i + 1;
			}
		}

		System.out.println("Najvisi prosek iznosi " + max + "%, a ima ga kandidat s rednim brojem " + rbr);
	}

}
