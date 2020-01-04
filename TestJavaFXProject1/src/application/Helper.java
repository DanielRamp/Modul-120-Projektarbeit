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
	
	// CONSTANTS
	private static final int STAGEMINHEIGHT = 400;
	private static final int STAGEMINWIDTH = 600;
	
	// TODO: NOT not private for NOT testing
	Stage stage; // Swing: JFrame
	Scene scene; // Swing: content pane
	Parent root;
	
	public static Helper getInstance () {
	    if (Helper.instance == null) {
	    	Helper.instance = new Helper ();
	    }
	    return Helper.instance;
	}
	
	
	public void firstView(Stage stage, String view) {
		
		root = null;
		try {
			root = FXMLLoader.load(getClass().getResource(view));
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
		} catch (Exception e) {
			Outputter.err(e.getStackTrace().toString());
		}
		
		// minimal Dimensions
		stage.setMinHeight(STAGEMINHEIGHT);
		stage.setMinHeight(STAGEMINWIDTH);
		Outputter.out("Style amount of this scene: "+stage.getScene().getStylesheets().size());
	}
	
	public void changeView(Button btn, String view) {
		root = null;
		
		//stage = (Stage) btn.getScene().getWindow();
		
		root = null;
		try {
			root = FXMLLoader.load(getClass().getResource(view));
		} catch (IOException e) {
			Outputter.err(e.getStackTrace().toString());
		}
		
		scene.setRoot(root);
		//scene = new Scene(root);
		//stage.setScene(scene);
		Outputter.out("Style amount of this scene: "+stage.getScene().getStylesheets().size());
		
		/*
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
		*/
	}
	
	public FXMLLoader changeViewLoader(Button btn, String view) {
		//Stage stage;
		//Parent root = null;
		//Scene scene;
		FXMLLoader load;
		
		stage = (Stage) btn.getScene().getWindow();
		
		load = new FXMLLoader(getClass().getResource(view));
		
		try {
			root = (Parent) load.load();
		} catch (IOException e) {
			Outputter.err(e.getStackTrace().toString());
		}
		
		scene.setRoot(root);
		//scene = new Scene(root);
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		//stage.setScene(scene);
		
		/*
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
		*/
		
		Outputter.out("Style amount of this scene: "+stage.getScene().getStylesheets().size());
		return load;
	}

}
