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

public class FXML_Creation {
	@FXML
	private BorderPane root;
	@FXML
	private Label LabelCreer;

	@FXML
	private Label LabelNom;

	@FXML
	private TextField TextFeildNom;

	@FXML
	private Button BtnGo;
	
	private Scene scene;
	private Controleur_Catapulte ctrl = null;

	public FXML_Creation() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/vue/Creation.fxml"));
		loader.setController(ctrl);
		BorderPane root = loader.load();
		scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("/styles/Catapulte.css").toString());
	}

	public Scene getScene() {
		return this.scene;
	}
}
