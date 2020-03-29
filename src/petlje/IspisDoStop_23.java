package petlje;

//Napisati program koji ispisuje unete reci dok korisnik ne unese rec STOP.

import java.util.Scanner;

public class IspisDoStop_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		String rec = s.next();
		String ispis = "";
		
		while (!rec.toLowerCase().equals("stop")) {
			
			ispis = ispis + rec + " ";
			rec = s.next();
			
		}
		
		System.out.println(ispis);

	}

}
