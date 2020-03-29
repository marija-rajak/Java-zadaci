package petlje;

//Sabrati sve cifre unetog broja

import java.util.Scanner;

public class ZbirCifara_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		System.out.println("Unesite broj cije cifre zelite da saberete:");

		int broj = s.nextInt();
		int zbir = 0;

		while (broj < 0) {
			System.out.println("Unesite pozitivan broj");
			broj = s.nextInt();
		}

		while (broj > 0) {
			int cifra = broj % 10;
			zbir = zbir + cifra;
			broj = broj / 10;
			
		}
		System.out.println("Zbir je " + zbir);
	}

}
