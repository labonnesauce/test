package modele;

public class Bras {
	
	private int longueur;
	private int angle_i;
	private int angle_f;
	
	
	
	public Bras(int longueur, int angle_i, int angle_f) {
		super();
		this.longueur = longueur;
		this.angle_i = angle_i;
		this.angle_f = angle_f;
	}
	
	
	public int getLongueur() {
		return longueur;
	}
	public void setLongueur(int longueur) {
		this.longueur = longueur;
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
	
	

}
