package vue;

import java.io.IOException;

import controleur.Controleur_Catapulte;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class FXML_Visualisation {
	@FXML
	private Label labelVitesse;

	@FXML
	private Label labelDistance;

	@FXML
	private Label labelRecord;
	@FXML
	private BorderPane root;

	@FXML
	private Pane Ecran;
	private Scene scene;
	private Controleur_Catapulte ctrl = null;

	public FXML_Visualisation() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/vue/Visualisation.fxml"));
		loader.setController(ctrl);
		BorderPane root = loader.load();
		scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("/styles/Catapulte.css").toString());
	}

	public void initialize() {
		
	}
	public Scene getScene() {
		return this.scene;
	}

}
