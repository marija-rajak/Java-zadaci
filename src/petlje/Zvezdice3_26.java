package petlje;

//Napravi program koji ce na izlazu izbaciti sliku pravougaonika zadatih dimenzija od zvezdica

import java.util.Scanner;

public class Zvezdice3_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m, n, i, j; // m=broj zvezdica u redu, n=broj redova

		Scanner s = new Scanner(System.in);

		System.out.println("Unesi broj zvezdica u redu");
		m = s.nextInt();

		System.out.println("Unesi broj redova");
		n = s.nextInt();

		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
