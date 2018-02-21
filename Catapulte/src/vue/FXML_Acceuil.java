package vue;

import java.io.IOException;

import controleur.Controleur_Catapulte;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class FXML_Acceuil {
	@FXML
	private BorderPane root;

	@FXML
	private Label labelParties;

	@FXML
	private Button BtnNouvelPartie;

	@FXML
	private Button BtnCharge;

	private Scene scene;
	private Controleur_Catapulte ctrl = null;
	private FXML_Creation creation;

	public FXML_Acceuil() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/vue/Acceuil.fxml"));
		loader.setController(ctrl);
		BorderPane root = loader.load();
		scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("/styles/Catapulte.css").toString());
	}

	public void initialize() {
	}

	public Scene getScene() {
		return scene;
	}

	public void setScene(Scene scene) {
		this.scene = scene;
	}
	

}
