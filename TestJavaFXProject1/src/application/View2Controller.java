package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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
	@FXML Button btnNewPost;
	@FXML ListView<Post> lstPosts;
	
	
	public View2Controller() {
	}

	public void initialize(URL arg0, ResourceBundle arg1) {
	}




	@FXML public void btnPrevAction() {
		Helper helper = Helper.getInstance();
		FXMLLoader load = helper.changeViewLoader(btnPrev, "View1.fxml");
		
		// hide lblWelcome on View1 - to recycle View1
		View1Controller view1Controller = load.getController();
		view1Controller.hideWelcome();
	}




	@FXML public void btnRefreshAction() {
		// TODO: get data and fill list
		lstPosts.getItems().clear();
	}




	@FXML public void btnClearPostsAction() {
		lstPosts.getItems().clear();
	}




	@FXML public void btnNewPostAction() {
		Helper helper = Helper.getInstance();
		helper.dialogView(btnPrev, "View3.fxml");
	}

}
