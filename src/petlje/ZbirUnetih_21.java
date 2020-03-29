package petlje;

//Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan broj, i ispisuje njihov zbir (zbir pozitivnih brojeva).

import java.util.Scanner;

public class ZbirUnetih_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		System.out.println("Unesite prvi broj:");

		float broj = s.nextFloat();

		float zbir = 0;

		while (broj < 0) {

			System.out.println("Unesite broj veci od 0!");

			broj = s.nextFloat();
		}

		do { 

			zbir = zbir += broj;

			System.out.println("Unesite sledeci broj:");

			broj = s.nextFloat();

		} while (broj > 0);

		System.out.println("Zbir unetih brojeva vecih od 0 je " + zbir);

	}

}
