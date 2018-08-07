import java.util.ArrayList;
import java.util.Arrays;

public class Provjera {

	public int[] niz;

	public int najmanji(int[] niz) {

		int najmanji = niz[0];

		for (int i = 0; i < niz.length; i++) {
			if (najmanji > niz[i]) {
				najmanji = niz[i];
			}
		}

		return najmanji;

	}

	public int najveci(int[] niz) {

		int najveci = niz[0];

		for (int i = 0; i < niz.length; i++) {
			if (najveci < niz[i]) {
				najveci = niz[i];
			}
		}
		return najveci;
	}

	public int zbir(int[] niz) {

		int zbir = 0;

		for (int i = 0; i < niz.length; i++) {
			zbir += niz[i];
		}

		return zbir;
	}

	public double prosjek(int[] niz) {

		int zbir = zbir(niz);
		double prosjek = zbir / niz.length;
		return prosjek;
	}

	public int[] unikatni(int[] niz) {
		ArrayList<Integer> unikatniNizTemp = new ArrayList<>();
		
		for (int i = 0; i < niz.length; i++) {
			if(unikatniNizTemp.contains(niz[i]) == false) {
				unikatniNizTemp.add(niz[i]);
			}
		}
		
		int[] unikatniNiz = new int[unikatniNizTemp.size()];
		
		for (int i = 0; i < unikatniNiz.length; i++) {
			unikatniNiz[i] = unikatniNizTemp.get(i);
		}
		
		return unikatniNiz;
	}

	public int[] sortiran(int[] niz) {

		int[] sort = new int[niz.length];

		Arrays.sort(niz);

		for (int i = 0; i < niz.length; i++) {
			sort[i] = niz[i];
		}
		return sort;
	}
}
