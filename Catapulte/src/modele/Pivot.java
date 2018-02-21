package modele;

public class Pivot {

	private enum vitesse {
		LENT, MOYEN, RAPIDE
	}

	private int angle_i;
	private int angle_f;
	private int valVitesse;

	public Pivot(int angle_i, int angle_f, int vitesse) {
		this.angle_i = angle_i;
		this.angle_f = angle_f;
	}

	public int getAngle_i() {
		return angle_i;
	}

	public void setAngle_i(int angle_i) {
		this.angle_i = angle_i;
	}

	public int getAngle_f() {
		return angle_f;
	}

	public void setAngle_f(int angle_f) {
		this.angle_f = angle_f;
	}

	public void setVitesse(int vit) {
		this.valVitesse = vit;
	}

	public int getVitesse() {
		return valVitesse;
	}
}
