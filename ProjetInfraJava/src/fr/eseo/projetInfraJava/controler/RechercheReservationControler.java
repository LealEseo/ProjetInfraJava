package fr.eseo.projetInfraJava.controler;


import fr.eseo.projetInfraJava.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;


public class RechercheReservationControler {

	@FXML
	ChoiceBox<String> choixHotel;
	
	public Main main;

	@FXML
	public void initialize() {
		initRechercheReservation();
	}

	public void initRechercheReservation() {

		ObservableList<String> physicalDomain = FXCollections.observableArrayList("Hotel1", "Hotel2",
				"Hotel3", "Hotel4");
		choixHotel.getItems().addAll(physicalDomain);
		choixHotel.setValue("Hotel1");
	}

	
	public void setMain(Main main) {
		this.main = main;
	}
	
	
	public String getHotel(){
    	return choixHotel.getValue();
    }
}
