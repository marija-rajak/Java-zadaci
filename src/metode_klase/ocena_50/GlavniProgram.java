package metode_klase.ocena_50;

public class GlavniProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ocena o1 = new Ocena(5, 89, "matematika", "jun");
		Ocena o2 = new Ocena(4, 89, "matematika", "jun");
		Ocena o3 = new Ocena(3, 89, "matematika", "jun");
		
		System.out.println(Ocena.getProsek());
		System.out.println(Ocena.rbr);
	}

}
