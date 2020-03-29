package pocetak;
//Napisati program koji sabira prvih n prirodnih brojeva

import java.util.Scanner;

public class ZbirPrvihN_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);

		System.out.println("Saberi sve prirodne brojeve zakljucno sa");

		int broj = s.nextInt();

		int i = 1;

		int rezultat = 0;

		while (i <= broj) {

			rezultat = rezultat + i;

			i += 1;

		}

		System.out.println("Zbir prvih " + broj + " prirodnih brojeva je: " + rezultat);
	}

}
