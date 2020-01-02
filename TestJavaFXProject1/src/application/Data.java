package application;

import java.util.ArrayList;

/**
 * @author Daniel Ramp
 *
 */
public class Data {

	private static Data instance;

	private ArrayList<Category> categories = new ArrayList<Category>();
	// private ArrayList<String> postList = new ArrayList<String>();

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

}
