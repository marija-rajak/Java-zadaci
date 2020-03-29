package pocetak;
//Proveriti da li je uneti broj paran

import java.util.Scanner;

public class ParNepar_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj");

		int broj = sc.nextInt();

		if (broj == 0) {
			System.out.println("Ne mozete uneti 0, pokusajte sa nekim drugim brojem");
		}

		else {

			if (broj % 2 == 0) {

				System.out.println("Broj je paran");
			}

			else {

				System.out.println("Broj je neparan");
			}
		}
	}

}
