
public class NizoviTest {

	public static void main(String[] args) {
		int[] niz = { 8, 2, 4, 5, 1, 8 };

		Provjera provjera = new Provjera();

		System.out.println(provjera.najmanji(niz));
		System.out.println(provjera.najveci(niz));
		System.out.println(provjera.zbir(niz));
		System.out.println(provjera.prosjek(niz));
		int [] unikatniNiz = provjera.unikatni(niz);
		for (int i = 0; i < unikatniNiz.length; i++) {
			System.out.print(unikatniNiz[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < niz.length; i++) {
			System.out.print(provjera.sortiran(niz)[i] + " ");
		}
	}

}
