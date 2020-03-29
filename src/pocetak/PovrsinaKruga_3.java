package pocetak;
//Izracunati povrsinu kruga na osnovu unetog poluprecnika

import java.util.Scanner;

public class PovrsinaKruga_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite poluprecnik:");
		
		float r = s.nextFloat();
		
		while (r < 0) {
			System.out.println("Vrednost ne moze biti negativna, unesite ponovo:");
			r = s.nextFloat();
		}
		
		System.out.println("Povrsina kruga je " + r*r*3.14);
		
	}

}
