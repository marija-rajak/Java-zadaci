package petlje;

//Korisnik unosi broj brojeva koji ce biti ucitani, a onda se sabiraju svi brojevi

import java.util.Scanner;

public class ZbirUnetih_18 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite koliko brojeva zelite da sabirate");
		int n = s.nextInt();
				
		if (n>0) {
			
			int broj;
			int zbir;
			int i;
			
			for (zbir = 0, i = 0; i < n; i++) {
				System.out.println("Unesite " + (i+1) + ". broj");
				broj = s.nextInt();
				zbir += broj;
			}
			System.out.println("Zbir je " + zbir);
		}
		
		else System.out.println("Greska");
	}

}
