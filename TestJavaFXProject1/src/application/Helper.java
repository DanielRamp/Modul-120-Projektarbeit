package application;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * @author daniel<daniel.ramp@gibmit.ch>
 *
 */
public class Helper {
	
	private static Helper instance;
	
	public static Helper getInstance () {
	    if (Helper.instance == null) {
	    	Helper.instance = new Helper ();
	    }
	    return Helper.instance;
	  }
	
	
	public Stage changeView(Stage stage, String view) {
		Parent root = null;
		
		try {
			root = FXMLLoader.load(getClass().getResource(view));
		} catch (IOException e) {
			Outputter.err(e.getStackTrace().toString());
		}
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		
		
		// Title and Icon
		stage.setTitle("News");
		try {
			Image icon = new Image(getClass().getResourceAsStream("img/newspaper.png"));
			stage.getIcons().add(icon);
		} catch (Exception e) {
			Outputter.err(e.getStackTrace().toString());
		}
		
		// minimal Dimensions
		stage.setMinHeight(400);
		stage.setMinHeight(600);
		return stage;
	}
	
	public Stage changeView(Button btn, String view) {
		Stage stage;
		Parent root = null;
		
		stage = (Stage) btn.getScene().getWindow();
		
		try {
			root = FXMLLoader.load(getClass().getResource(view));
		} catch (IOException e) {
			Outputter.err(e.getStackTrace().toString());
		}
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		
		
		// Title and Icon
		stage.setTitle("News");
		try {
			Image icon = new Image(getClass().getResourceAsStream("img/newspaper.png"));
			stage.getIcons().add(icon);
		} catch (Exception e) {
			Outputter.err(e.getStackTrace().toString());
		}
		
		// minimal Dimensions
		stage.setMinHeight(400);
		stage.setMinHeight(600);
		return stage;
	}

}
