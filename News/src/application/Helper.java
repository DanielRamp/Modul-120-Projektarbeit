package application;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Modality;
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
	
	private Stage stage, dialogStage; // Swing: JFrame
	private Scene scene, dialogScene; // Swing: content pane
	private Parent root, dialogRoot;
	private FXMLLoader loader, dialogLoader;
	
	public static Helper getInstance () {
	    if (Helper.instance == null) {
	    	Helper.instance = new Helper ();
	    }
	    return Helper.instance;
	}
	
	public void firstView(Stage stage, String view) {
		root = null;
		
		loader = new FXMLLoader(getClass().getResource(view));
		try {
			root = loader.load();
		} catch (IOException e) {
			Outputter.err(e.getStackTrace().toString());
		} finally {
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
			stage.setMinWidth(STAGEMINWIDTH);
		}
	}
	
	public void changeView(String view) {
		
		loader = new FXMLLoader(getClass().getResource(view));
		
		try {
			root = (Parent) loader.load();
		} catch (IOException e) {
			Outputter.err(e.getStackTrace().toString());
		} finally {
			scene.setRoot(root);
		}
	}
	
	public void dialogView(String view) {
		
		dialogLoader = new FXMLLoader(getClass().getResource(view));
		
		try {
			dialogRoot = dialogLoader.load();
		} catch (IOException e) {
			Outputter.err(e.getStackTrace().toString());
		} finally {
			dialogScene = new Scene(dialogRoot);
			
			dialogStage = new Stage();
			dialogStage.setScene(dialogScene);
			
			// Modality
			dialogStage.initOwner(stage);
			dialogStage.initModality(Modality.APPLICATION_MODAL);
			dialogStage.showAndWait();
		}
	}
	
	public boolean closeApplication() {
		try {
			getStage().close();
			return true;
		} catch (Exception e) {
			Outputter.out(e.getStackTrace().toString());
			return false;
		}
	}

	/**
	 * @return the stage
	 */
	public Stage getStage() {
		return stage;
	}

	/**
	 * @param stage the stage to set
	 */
	public void setStage(Stage stage) {
		this.stage = stage;
	}

	/**
	 * @return the dialogStage
	 */
	public Stage getDialogStage() {
		return dialogStage;
	}

	/**
	 * @return the loader
	 */
	public FXMLLoader getLoader() {
		return loader;
	}
	
}
