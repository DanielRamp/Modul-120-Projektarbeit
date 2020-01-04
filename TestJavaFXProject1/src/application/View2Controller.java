package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.KeyEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

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
	
	private ObservableList<Post> postObservableList;
	
	
	public View2Controller() {
		postObservableList = FXCollections.observableArrayList();
		
		postObservableList.addAll(
				new Post(null, "Post Titel1", "Kategorie1", "Inhalt1"),
				new Post(null, "Post Titel2", "Kategorie2", "Inhalt2"),
				new Post(null, "Post Titel3", "Kategorie3", "Inhalt3")
		);
	}

	public void initialize(URL arg0, ResourceBundle arg1) {
		lstPosts.setItems(postObservableList);
		lstPosts.setCellFactory(postListView -> new PostListViewCell());
	}




	@FXML public void btnPrevAction() {
		Helper helper = Helper.getInstance();
		FXMLLoader load = helper.changeViewLoader(btnPrev, "View1.fxml");
		
		// hide lblWelcome on View1 - to recycle View1
		View1Controller view1Controller = load.getController();
		view1Controller.hideWelcome();
	}




	@FXML public void btnRefreshAction() {
		lstPosts.getItems().clear();
	}




	@FXML public void btnClearPostsAction() {
		lstPosts.getItems().clear();
	}




	@FXML public void btnNewPostAction() {
		
		Helper helper = Helper.getInstance();
		helper.dialogView(btnPrev, "View3.fxml");
		//helper.changeView(btnPrev, "View3.fxml");
	}

}
