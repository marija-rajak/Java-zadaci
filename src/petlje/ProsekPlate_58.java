package petlje;
//Napisati program u programskom jeziku java koji od korisnika trazi da unosi mesecne plate koje je zaradio u prethodnih 7 meseci, i racuna i ispise prosek primanja. Za resavanje ovog zadatka koristiti for petlju.

import java.util.Scanner;

public class ProsekPlate_58 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		float plata;
		float zarada = 0;
		float prosek = 0;

		System.out.println("Unesite svoje zarade u prethodnih sedam meseci:");

		for (int i = 0; i < 7; i++) {
			System.out.println("Unesite zaradu za " + (i + 1) + ". mesec");
			plata = s.nextFloat();
			while (plata < 0) {
				System.out.println("Ne mozete uneti negativnu vrednost, unesite ponovo:");
				plata = s.nextFloat();
			}
			zarada = zarada + plata;
		}

		prosek = zarada / 7;
		
		System.out.println("Vasa ukupna zarada u prethodnih 7 meseci iznosi: " + zarada);
		
		System.out.println("Vasa prosecna plata u prethodnih 7 meseci iznosi: " + prosek);
	}

}
