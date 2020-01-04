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
	
	Stage stage; // TODO: NOT not private for NOT testing
	Parent root; // TODO: NOT not private for NOT testing
	
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
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
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
		root = null;
		
		stage = (Stage) btn.getScene().getWindow();
		
		try {
			root = FXMLLoader.load(getClass().getResource(view));
		} catch (IOException e) {
			Outputter.err(e.getStackTrace().toString());
		}
		
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
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
	
	public FXMLLoader changeViewLoader(Button btn, String view) {
		Stage stage;
		Parent root = null;
		Scene scene;
		FXMLLoader load;
		
		stage = (Stage) btn.getScene().getWindow();
		
		load = new FXMLLoader(getClass().getResource(view));
		
		try {
			root = (Parent) load.load();
		} catch (IOException e) {
			Outputter.err(e.getStackTrace().toString());
		}
		
		scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		stage.setScene(scene);
		
		
		// Title and Icon
		stage.setTitle("News");
		try {
			Image icon = new Image(getClass().getResourceAsStream("img/newspaper.png"));
			stage.getIcons().add(icon);
		} catch (Exception e1) {
			Outputter.err(e1.getStackTrace().toString());
		}
		
		// minimal Dimensions
		stage.setMinHeight(400);
		stage.setMinHeight(600);
		
		return load;
	}

}
