package pocetak;
/*Test se ocenjuje uzimajuci obzir broj osvojenih poena na sledeci nacin:
   poeni <50  => ocena je 5
   50<= poeni <60   => ocena je 6
   60<= poeni <70   => ocena je 7
   70<= poeni <80   => ocena je 8
   80<= poeni <90   => ocena je 9
   poeni >= 90  => ocena je 10.
  Napisati program koji sa standardnog ulaza ucitava broj poena i korisniku ispisuje koju je ocenu dobio. */


import java.util.Scanner;

public class OcenaNaTestu_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float poeni;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite broj poena:");
		
		poeni = s.nextFloat();
		
		while (poeni<0 || poeni>100) {
			System.out.println("Niste uneli odgovarajucu vrednost, unesite ponovo:");
			poeni=s.nextFloat();
		}
		
		if (poeni<50) System.out.println("Ocena je 5");
		
		if (poeni>=50 && poeni<60) System.out.println("Ocena je 6");
		
		if (poeni>=60 && poeni<70) System.out.println("Ocena je 7");
		
		if (poeni>=70 && poeni<80) System.out.println("Ocena je 8");
		
		if (poeni>=80 && poeni<90) System.out.println("Ocena je 9");
		
		if (poeni>=90) System.out.println("Ocena je 10");
	
	}

}
