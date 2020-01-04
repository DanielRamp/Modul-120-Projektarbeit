package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
	@FXML ListView<String> lstPosts;
	
	final ObservableList<String> listItems = FXCollections.observableArrayList("Add Items here");
	
	
	public View2Controller() {
	}

	public void initialize(URL arg0, ResourceBundle arg1) {
		lstPosts.setItems(listItems);
		ArrayList<Category> post1Categories = new ArrayList<Category>();
		post1Categories.add(new Category("", "Category1", true));
		post1Categories.add(new Category("", "Category1", false));
		Data.getInstance().addPostList(new Post("icon", "Titel", post1Categories, "content"));
		Data.getInstance().addPostList(new Post("icon2", "Titel2", post1Categories, "content2"));
	}

	public void refreshlstPosts() {
		listItems.clear();
		for (Post post : Data.getInstance().getPostList()) {
			if (!post.getIsRead()) {
				for (Category postCategories : post.getCategories()) {
					if (postCategories.isSelected()) {
						listItems.add(post.getContent());
					}
				}
			}
		}
	}
	
	
	@FXML public void btnPrevAction() {
		Helper helper = Helper.getInstance();
		FXMLLoader load = helper.changeViewLoader(btnPrev, "View1.fxml");
		
		// hide lblWelcome on View1 - to recycle View1
		View1Controller view1Controller = load.getController();
		view1Controller.hideWelcome();
	}
	
	

	@FXML public void btnRefreshAction() {
		refreshlstPosts();
		// TODO: get data and fill list
	}
	
	

	@FXML public void btnClearPostsAction() {
		lstPosts.getItems().clear();
	}




	@FXML public void btnNewPostAction() {
		Helper helper = Helper.getInstance();
		helper.dialogView(btnPrev, "View3.fxml");
	}

}
