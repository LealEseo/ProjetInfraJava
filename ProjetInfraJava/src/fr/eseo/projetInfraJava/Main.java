package fr.eseo.projetInfraJava;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


import fr.eseo.projetInfraJava.controler.RechercheReservationControler;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import javafx.stage.Stage;
import javafx.scene.layout.Pane;

public class Main extends Application{
	
	public RechercheReservationControler rechercheReservationControler;
	public Stage primaryStage;
	public Pane pane;
	

	public void start(String[] arg0) throws Exception {
		Logger.getLogger(Main.class.getName()).log(
                Level.CONFIG, "Launching the EMRApp."
            );
		launch(arg0);
	}
	
	
	public void stop() {
		Logger.getLogger(Main.class.getName()).log(
                Level.CONFIG, "Inside the stop() method."
            );
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Logger.getLogger(Main.class.getName()).log(
                Level.CONFIG, "Inside the start() method."
            );
		
		this.primaryStage = primaryStage;
		initRechercheHotel();
		
		
		
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/ca/sixs/view/GUI.fxml"));
			pane = (Pane) loader.load();
			Scene scene = new Scene(pane);


			primaryStage.setScene(scene);
			primaryStage.setTitle("Gérer les réservations");
			primaryStage.show();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	public void initRechercheHotel() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("/fr/eseo/projetInfraJava/vue/ChoixHotel.fxml"));
		pane = (Pane) loader.load();

		rechercheReservationControler = loader.getController();
		rechercheReservationControler.setMain(this);
	}
	
	
	
	
	public RechercheReservationControler getRecherchereservationController() {
		return rechercheReservationControler;
	}
	
	
}
