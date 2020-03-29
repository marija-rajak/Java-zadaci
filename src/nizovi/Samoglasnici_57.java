package nizovi;

import java.util.Scanner;

//Napisati metodu koja ce da izbroji samoglasnike u prosledjenoj reci.Testirati prethodno napisanu metodu.

public class Samoglasnici_57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String rec = sc.next().toLowerCase();
		String samoglasnici = "aeiou";
		int brSamoglasnika = 0;
		char[] slova = new char[rec.length()];

		slova = rec.toCharArray();
		
		for (int i = 0; i < rec.length(); i++) {

			for (int j = 0; j < 5; j++) {
				if (slova[i] == samoglasnici.charAt(j)) {
					brSamoglasnika ++;
				}
			}
		}

		
		System.out.println(brSamoglasnika);
	}

}
