package pocetak;

import java.util.Scanner;

//U�itati jednu re� sa standardnog ulaza, zatim drugu i proveriti da li prva re� u sebi sadr�i drugu i ispisati ishod provere

public class Stringovi1_54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite prvu rec:");
		String rec1 = sc.next().toLowerCase();
		
		System.out.println("Unesite drugu rec");
		String rec2 = sc.next().toLowerCase();
		
		if (rec1.contains(rec2)) System.out.println("Rec " + rec1 + " sadrzi rec " + rec2);
		else System.out.println("Rec " + rec1 + " ne sadrzi rec " + rec2);
	}

}
