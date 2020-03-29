package petlje;

/*Napisati program koji ispisuje zadati oblik od zvezdica:
	*
	*  *
	*  *  *
	*  *  *  *
*/


public class Zvezdice1_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=0;  i<4; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("  *");
			}
			System.out.println();
		}
	}

}
