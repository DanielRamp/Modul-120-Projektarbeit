package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class View1Controller implements Initializable {
	
	@FXML
	private Button btnNavNext;
	
	@FXML
	protected void nextView(ActionEvent event) {
		System.out.println("next view! (View2)");
		
		Stage stage;
		Parent root = null;

		stage = (Stage) btnNavNext.getScene().getWindow();

		try {
			root = FXMLLoader.load(getClass().getResource("View2.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
	}
	
	public void initialize(URL location, ResourceBundle resources) {
		//System.out.println("location"+location);
		//System.out.println("resources"+resources);
	}
	
}
