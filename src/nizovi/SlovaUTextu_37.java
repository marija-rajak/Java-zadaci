package nizovi;

//Izbrojati koliko reci pocinje na odredjeno slovo, i koliko tog slova ima u tekstu.

import java.util.Scanner;

public class SlovaUTextu_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String recenica;

		System.out.println("Unesite recenicu");

		recenica = sc.nextLine().toLowerCase();

		String[] reci = recenica.split(" ");

		int broj = 0;
		int pocinjeNa = 0;

		for (int i = 0; i < reci.length; i += 1) {

			if (reci[i].charAt(0) == 'd')
				pocinjeNa ++;
			
			for (int j = 0; j < reci[i].length(); j++) {

				if (reci[i].charAt(j) == 'd')
					broj++;
			}
		}
		
		System.out.println(pocinjeNa + " reci pocinje slovom d");

		System.out.println("Ukupno ima " + broj + " slova d");
		
		

	}

}
