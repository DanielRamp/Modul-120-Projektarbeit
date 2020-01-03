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




	@FXML public void btnClearPostsAction() {
		lstPosts.getItems().clear();
	}




	@FXML public void btnNewPostAction() {
		Stage stage;
		Parent root = null;
		
		stage = (Stage) btnNewPost.getScene().getWindow();
		
		try {
			root = FXMLLoader.load(getClass().getResource("View3.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		/*
		stage.setMinHeight(100);
		stage.setMinHeight(500);
		
		stage.setMinHeight(400);
		stage.setMinHeight(600);
		*/
	}

}
