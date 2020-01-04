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
	
	Data data = Data.getInstance();
	
	final ObservableList<String> listItems = FXCollections.observableArrayList("Add Items here");
	
	
	public View2Controller() {
		if (data.getPostList().isEmpty()) {
			dummyData();
		}
	}

	public void initialize(URL arg0, ResourceBundle arg1) {
		lstPosts.setItems(listItems);
		refreshlstPosts();
	}

	public void dummyData() {
		// creating 3 categories
		data.getCategories().add(new Category(null, "Kategorie 1", true));
		data.getCategories().add(new Category(null, "Kategorie 2", true));
		data.getCategories().add(new Category(null, "Kategorie 3", false));
		
		// creating ArrayList with Categories of Post 1
		ArrayList<Category> post1Categories = new ArrayList<Category>();
		post1Categories.add(data.getCategories().get(0));
		post1Categories.add(data.getCategories().get(2));
		
		// creating Post1
		data.addPostList(new Post("icon1", "Titel1", post1Categories, "content1"));
		
		// creating Post2
		ArrayList<Category> post2Categories = new ArrayList<Category>();
		post2Categories.add(data.getCategories().get(1));
		Data.getInstance().addPostList(new Post("icon2", "Titel2", post2Categories, "content2"));
		
		// creating Post3
		ArrayList<Category> post3Categories = new ArrayList<Category>();
		post3Categories.add(data.getCategories().get(2));
		Data.getInstance().addPostList(new Post("icon3", "Titel3", post3Categories, "content3"));
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
