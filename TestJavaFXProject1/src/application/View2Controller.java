package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

/**
 * @author daniel<daniel.ramp@gibmit.ch>
 *
 */
public class View2Controller implements Initializable {
	
	@FXML Label lblFeed;
	@FXML Button btnPrev;
	@FXML Button btnRefresh;
	@FXML Button btnClearPosts;
	@FXML Button btnAddPost;
	@FXML ListView lstPosts;
	
	
	

	public void initialize(URL arg0, ResourceBundle arg1) {
		// nothing
	}




	@FXML public void btnPrevAction() {}




	@FXML public void btnRefreshAction() {}




	@FXML public void btnClearPosts() {}




	@FXML public void btnAddPostAction() {}

}
