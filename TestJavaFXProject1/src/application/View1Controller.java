package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.image.ImageView;

public class View1Controller implements Initializable {

	@FXML private Button btnNext;
	@FXML private Label lblWelcome;
	@FXML private Label lblCategoryChoose;
	@FXML private ImageView imgNext;
	@FXML private ListView<String> lstCategories;
	
	Helper helper = Helper.getInstance();
	private boolean pressedCtrl;
	
	
	@FXML protected void btnNextAction() {
		// TODO: transmit data
		/*
		// data?
		Data d = Data.getInstance();
		
		ArrayList<Category> categories = d.getCategories();
		
		categories.add(new Category("icon1", "text1", false));
		categories.add(new Category("icon2", "text2", true));
		categories.add(new Category("icon3", "text3", false));
		
		for (Category category : categories) {
			lstCategories.getItems().add(category.isSelected().toString());
		}
		*/
		
		helper.changeView(btnNext, "View2.fxml");
	}
	
	public void hideWelcome() {
		BorderPane bp = (BorderPane) lblWelcome.getParent();
		bp.setTop(null);
		lblCategoryChoose.setText("Kategorien ändern");
	}
	
	@FXML protected void keyPressed(KeyEvent ke) {
		KeyCode kc = ke.getCode();
		if (kc == KeyCode.ESCAPE) {
			closeApplication(ke);
			System.out.println("Escape Key pressed, closing Application!");
		} else if (kc == KeyCode.CONTROL) {
			pressedCtrl = true;
			System.out.println("pressedCtrl = true");
		} else if (kc == KeyCode.W) {
			if (pressedCtrl) {
				System.out.println("Ctrl + W Keys pressed, closing Application!");
				closeApplication(ke);
			}
		} else if (kc == KeyCode.Q) {
			if (pressedCtrl) {
				System.out.println("Ctrl + Q Keys pressed, closing Application!");
				closeApplication(ke);
			}
		} else {
			System.out.println("Key " + kc + " pressed");
		}
	}
	
	@FXML protected void keyReleased(KeyEvent ke) {
		KeyCode kc = ke.getCode();
		if (kc == KeyCode.CONTROL) {
			pressedCtrl = false;
			System.out.println("pressedCtrl = false");
		} else {
			System.out.println("Key " + kc + " released");
		}
	}
	
	private boolean closeApplication(Object o) {
		try {
			//((Node)((KeyEvent) o).getSource()).getScene().getWindow().hide(); // Source: https://stackoverflow.com/a/21938672
			helper.getStage().close();
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	}
	
}
