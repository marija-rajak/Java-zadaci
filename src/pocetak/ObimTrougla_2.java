package pocetak;
//Izracunati obim trougla na osnovu unetih stranica

import java.util.Scanner;

public class ObimTrougla_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int stranica_a, stranica_b, stranica_c;
		
		System.out.println("Unesite stranicu a:");
		
		Scanner sc = new Scanner(System.in);
		
		stranica_a = sc.nextInt();
		
		System.out.println("a=" + stranica_a + "cm");
		
		System.out.println("Unesite stranicu b:");
		
		stranica_b = sc.nextInt();
		
		System.out.println("b=" + stranica_b + "cm");
		
		System.out.println("Unesite stranicu c:");
		
		stranica_c = sc.nextInt();
		
		System.out.println("c=" + stranica_c + "cm");
		
		int obim = stranica_a + stranica_b + stranica_c;
		
		System.out.println("Obim trougla iznosi " + obim + "cm");

	}

}
