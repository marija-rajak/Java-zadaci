package pocetak;
//U zgradi se nalazi lift nosivosti 680kg. Napisati program koji proverava da li ce lift bezbedno krenuti u zavisnostii od tezine koju treba da ponese. Podrazumevane 3 opcije: Lift je preopterecen; Na granici je; Lift je pokrenut

import java.util.Scanner;

public class Lift_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		float tezina = 0; // tezina jednog putnika

		float opterecenje = 0; // ukupno opterecenje u kabini

		while (opterecenje < 680) {

			System.out.println("Lift moze da primi jos putnika");

			tezina = s.nextFloat();

			opterecenje = opterecenje + tezina;

			if (opterecenje >= 650 && opterecenje < 680) {

				System.out.println(
						"Upozorenje! Opterecenje se priblizava granicnoj vrednosti, lift ne moze da primi vise putnika!");

				break;
			}
		}

		if (opterecenje >= 680)
			System.out.println("Opasnost! Lift je preopterecen!");

	}

}
