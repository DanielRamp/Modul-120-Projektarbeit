package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;

/**
 * @author daniel<daniel.ramp@gibmit.ch>
 *
 */
public class View3Controller implements Initializable {
	
	@FXML BorderPane bdpOut, bdpHeader, bdpContent, bdpFooter;
	@FXML GridPane grpMeta;
	
	@FXML Button btnPrev;
	@FXML Label lblPost;
	@FXML Label lblTitel;
	@FXML TextField txfTitel;
	@FXML Label lblCategories;
	@FXML MenuButton mnbCategories;
	@FXML MenuItem mnbCategoryChooseItem1;
	@FXML MenuItem mnbCategoryChooseItem2;
	@FXML TextArea txaContent;
	@FXML Button btnSendPost;
	
	Data data= Data.getInstance();
	Helper helper = Helper.getInstance();
	
	
	public View3Controller() {
	}

	public void initialize(URL arg0, ResourceBundle arg1) {
	}

	@FXML public void btnPrevAction() {
		helper.getDialogStage().close();
	}

	@FXML public void btnSendPostAction() {
		// creating ArrayList with Categories of Post 1
		ArrayList<Category> categoriesTemp = new ArrayList<Category>();
		categoriesTemp.add(data.getCategories().get(0));
		categoriesTemp.add(data.getCategories().get(2));
		
		Post post = new Post("asd", txfTitel.getText(), categoriesTemp, txaContent.getText());
		data.getPostList().add(post);
		// TODO: transmit data
		helper.getDialogStage().close();
	}

}
