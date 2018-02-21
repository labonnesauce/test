package application;

import controleur.Controleur_Catapulte;
import javafx.application.Application;
import javafx.stage.Stage;

public class Application_Catapulte extends Application{
	
	private Controleur_Catapulte controleur = null;

	@Override
	public void start(Stage leStage) throws Exception {
		controleur = new Controleur_Catapulte();
		leStage.setTitle("Catapulte");
		leStage.setScene(controleur.getMainScene());
		leStage.show();
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
