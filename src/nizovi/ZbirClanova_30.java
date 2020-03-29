package nizovi;

//Sabrati sve clanove niza.

import java.util.Scanner;

public class ZbirClanova_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		int[] brojevi = new int[5];
		int zbir = 0;
		int proizvod = 1;

		// unos
		for (int i = 0; i < brojevi.length; i++) {
			brojevi[i] = s.nextInt();
		}

		// sumiranje
		for (int i = 0; i < (brojevi.length); i++) {
			zbir = zbir + brojevi[i];
			proizvod = proizvod * brojevi[i];
		}

		System.out.println("Zbir svih brojeva u nizu je " + zbir);

		System.out.println("Proizvod svih brojeva u nizu je " + proizvod);

		for (int i = 0; i < brojevi.length; i++) {
			System.out.print(brojevi[i]);
			if(i<brojevi.length -1){
				System.out.print(", ");
			} 
		}
	}

}
