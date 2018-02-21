package controleur;

import application.Application_Catapulte;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import modele.Catapulte;
import vue.FXML_Acceuil;
import vue.FXML_Creation;
import vue.FXML_Visualisation;


public class Controleur_Catapulte {
	
	private Catapulte modele;
	private FXML_Acceuil vue = null;
	
	public Controleur_Catapulte() {
		try {
			vue = new FXML_Acceuil();
			modele = new Catapulte(0, 0);
		} catch (Exception e) {
			System.out.println("La construction du controleur a échoué. TODO GÉRER COMME IL FAUT DANS LE GUI");
		}
	}
	
	public Scene getMainScene() {
		return vue.getScene();
	}
}
