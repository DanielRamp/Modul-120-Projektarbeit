package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.fxml.FXML;
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
		Helper helper = Helper.getInstance();
		helper.getStage().close();
	}

	@FXML public void btnSendPostAction() {
	}

}
