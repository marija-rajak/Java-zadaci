package nizovi;

//Sortirati clanove niza od najmanjeg do najveceg.

import java.util.Arrays;

public class Sortiranje_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] n = { 2, 4, 9, 1 };

		for (int i = 0; i < n.length; i++) {
			int poz = i;
			int min = n[i];

			for (int j = i; j < n.length; j++) {
				if (n[j] < min) {
					poz = j;
					min = n[j];
				}
			}

			int temp = n[i];
			n[i] = n[poz];
			n[poz] = temp;
		}

		System.out.println(Arrays.toString(n));
	}

}
