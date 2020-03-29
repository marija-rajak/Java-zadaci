package petlje;

//Napisati program koji ce prebrojati koliko je brojeva od 9 do 250 (ukljucujuci i njih) deljivih brojem 3.

public class DeljiviSa3_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 9;
		int b = 250;
		int broj = 0;
		int c;

		for (; a <= b; a++) {
			c = a % 3;
			if (c == 0)
				broj = broj + 1;
		}
		System.out.println("Broj brojeva deljivih sa 3, od 9 do 250 je " + broj);
	}

}
