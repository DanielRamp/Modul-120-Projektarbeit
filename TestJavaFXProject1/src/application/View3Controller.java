package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Outputter.Type;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;

/**
 * @author daniel<daniel.ramp@gibmit.ch>
 *
 */
public class View3Controller implements Initializable {
	
	@FXML BorderPane bdpOut, bdpHeader, bdpContent, bdpFooter;
	@FXML GridPane grpMeta;
	
	@FXML Button btnPrev;
	@FXML Label lblFeed;
	@FXML Label lblTitel;
	@FXML Label lblCategory;
	@FXML TextField txfTitel;
	@FXML Button btnSendPost;

	public View3Controller() {
		
	}

	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}

	@FXML public void btnPrevAction() {
		//bdpOut.getChildren().clear();
		try {
			bdpOut.getChildren().setAll((BorderPane)FXMLLoader.load(getClass().getResource("View2.fxml")));
		} catch (IOException e) {
			new Outputter(e.getStackTrace().toString());
		}
		new Outputter("blabla");
	}

	@FXML public void btnSendPostAction() {
		//txfTitel.getText();
	}



	/*
	@FXML public void btnPrevAction() {
		
		Stage stage = (Stage) btnPrev.getScene().getWindow();
		FXMLLoader load;
		
		try {
			//root = FXMLLoader.load(getClass().getResource("View1.fxml"));

			load = new FXMLLoader(getClass().getResource("View1.fxml"));
			
			Parent root = (Parent) load.load();
			
			View1Controller view1Controller = load.getController();
			
			view1Controller.hideWelcome();
			
			stage.setScene(new Scene(root));
			stage.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@FXML public void btnRefreshAction() {
		lstPosts.getItems().clear();
	}
	*/

}
