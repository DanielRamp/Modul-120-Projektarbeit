package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class View1Controller implements Initializable {

	@FXML
	private Button btnNext;
	
	@FXML
	protected void btnNextAction() {
		System.out.println("juhuii");
		btnNext.setText("Teesstt");
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//System.out.println("location"+location);
		//System.out.println("resources"+resources);
	}
	
}
