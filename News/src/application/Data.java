package application;

import java.util.ArrayList;

/**
 * @author Daniel Ramp
 *
 */
public class Data {

	private static Data instance;

	private ArrayList<Category> categories = new ArrayList<Category>();
	private ArrayList<Post> postList = new ArrayList<Post>();
	private Boolean categoryChoosen = false;

	public static Data getInstance() {
		if (Data.instance == null) {
			Data.instance = new Data();
		}
		return Data.instance;
	}

	/**
	 * @return the categories
	 */
	public ArrayList<Category> getCategories() {
		return categories;
	}

	/**
	 * @param categories the categories to set
	 */
	public void setCategories(ArrayList<Category> categories) {
		this.categories = categories;
	}

	/**
	 * @return the postList
	 */
	public ArrayList<Post> getPostList() {
		return postList;
	}

	/**
	 * @param postList the postList to set
	 */
	public void setPostList(ArrayList<Post> postList) {
		this.postList = postList;
	}
	
	/**
	 * @param postList the postList to set
	 */
	public void addPostList(Post post) {
		this.postList.add(post);
	}

	/**
	 * @return true if categoryChoosen, else false
	 */
	public Boolean isCategoryChoosen() {
		return categoryChoosen;
	}

	/**
	 * @param categoryChoosen the categoryChoosen to set
	 */
	public void setCategoryChoosen(Boolean categoryChoosen) {
		this.categoryChoosen = categoryChoosen;
	}

}
