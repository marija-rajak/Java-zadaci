package pocetak;
//Napisati program koji od korisnika trazi da unese dva broja, a nakon toga i broj koji predstavlja operaciju koju zeli (1 za sabiranje, 2 za oduzimanje, 3 za mnozenje, 4 za deljenje). Prikazati rezultat. 

import java.util.Scanner;

public class Kalkulator_8 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		System.out.println("Unesite brojeve");

		double a = s.nextDouble();
 
		double b = s.nextDouble();

		System.out.println("Unesite operaciju: 1 za sabiranje, 2 za oduzimanje, 3 za mnozenje ili 4 za deljenje, 5 za kraj");

		int operacija = s.nextInt();
		
		switch (operacija) {

		case 1:
			System.out.println("Zbir brojeva je " + (a + b));
			break;

		case 2:
			System.out.println("Razlika brojeva je " + (a - b));
			break;

		case 3:
			System.out.println("Proizvod brojeva je" + (a * b));
			break;

		case 4:
			System.out.println("Kolicnik brojeva je " + (a / b));
			break;
			
		case 5:
			System.out.println("Kraj racunanja");
			break;			
		}

		while (operacija < 1 || operacija > 5) {
			System.out.println("Niste uneli odgovarajucu operaciju, pokusajte ponovo");
			operacija = s.nextInt();
		}

	}

}
