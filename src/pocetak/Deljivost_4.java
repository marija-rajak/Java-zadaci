package pocetak;
//Proveriti da li je broj deljiv sa 2 i 7

import java.util.Scanner;

public class Deljivost_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj");

		int broj = sc.nextInt();

		if (broj == 0) {
			System.out.println("Ne mozete uneti 0, pokusajte sa drugim brojem");
		} else {
			if (broj % 2 == 0 && broj % 7 == 0) {
				System.out.println("Broj " + broj + " je deljiv sa 2 i 7");
			}

			else if (broj % 2 == 0 && broj % 7 != 0) {
				System.out.println("Broj " + broj + " je deljiv sa 2, a nije sa 7");
			}

			else if (broj % 2 != 0 && broj % 7 == 0) {
				System.out.println("Broj " + broj + " je deljiv sa 7, a nije sa 2");
			}

			else if (broj % 2 != 0 && broj % 7 != 0) {
				System.out.println("Broj nije deljiv ni sa 2, ni sa 7");
			}

		}
	}

}
