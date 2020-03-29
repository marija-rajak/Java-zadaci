package petlje;

//Napisati program koji ce ispisati n brojeva Fibonacijevog niza.

import java.util.Scanner;

public class FibonacijevNiz_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		int a = 0;
		int b = 1;
		int i;
		String niz = "0, 1";
		int c; // sledeci broj u nizu

		System.out.println("Unesito koliko brojeva Fibonacijevog niza zelite:");

		int n = s.nextInt();

		if (n < 2)
			System.out.println("Niz mora imati najmanje dva clana! Unesito ponovo koliko brojeva Fibonacijevog niza zelite:");

		for (i = 0; i < n-2; i++) {

			c = a + b;
			niz = niz + ", " + c;
			a = b;
			b = c;
		}
		
		System.out.println(niz);

	}

}
