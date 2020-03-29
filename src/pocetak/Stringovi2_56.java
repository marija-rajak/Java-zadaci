package pocetak;

import java.util.Scanner;

/*Napisati metodu koja ce naci srednji karakter stringa koji mu se prosledjuje kao argument.
Ukoliko niz znakova ima paran broj elemenata onda ce vratiti dva srednja karaktera*/

public class Stringovi2_56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String rec = sc.next();
		
		if (rec.length() %2 == 0) {
			System.out.println(rec.charAt(rec.length()/2-1) + "" + rec.charAt(rec.length()/2));
		} else {
			System.out.println(rec.charAt(rec.length()/2));
		}
	}

}
