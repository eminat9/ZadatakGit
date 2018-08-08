
public class Konverzija {

	public int broj;

	public double kgUFunte(double broj) {

		double kg = broj;
		double lb = kg * 2.2046;

		return lb;
	}

	public double funteUKg(double broj) {
		double lb = broj;
		double kg = lb / 2.2046;

		return kg;
	}

	public double cmUInce(double broj) {
		double cm = broj;
		double inch = cm * 0.39;

		return inch;
	}

	public double celzijusUFarenhajt(double broj) {
		double celzius = broj;
		double farenhait = (9.0 / 5) * celzius + 32;
		
		return farenhait;
	}

	public double farenhatuCelzijus(double broj) {
		double farenhait=broj;
		double celzius = (farenhait - 32) / 1.8;
		
		return celzius;
	}

}
