package pocetak;
//Ucitati nosivost mosta i masu vozila na njemu i ispisati informaciju da li je preopterecen, na granici, ili je sve u redu.

import java.util.Scanner;

public class NosivostMosta_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite nosivost mosta u tonama");

		float nosivost = sc.nextFloat();

		System.out.println("Unesite opterecenje u tonama");

		float opterecenje = sc.nextFloat();

		if (opterecenje <= 0 || nosivost <= 0) {
			System.out.println("Nisu unete adekvatne vrednosti!");
		}

		else if (nosivost > opterecenje) {
			System.out.println("Sve je u redu.");
		} else if (nosivost == opterecenje) {
			System.out.println("Opterecenje je na granici!");
		}

		else {
			System.out.println("Most je preopterecen!!!");
		}
	}

}
