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
import javafx.scene.control.CheckBox;
import javafx.event.ActionEvent;

public class View1Controller implements Initializable {

	@FXML private Button btnNext;
	@FXML private Label lblWelcome;
	@FXML private Label lblCategoryChoose;
	@FXML private ImageView imgNext;
	@FXML private ListView<String> lstCategories;
	@FXML private CheckBox chbCategory1;
	@FXML private CheckBox chbCategory2;
	@FXML private CheckBox chbCategory3;
	@FXML private CheckBox chbCategory4;
	@FXML private CheckBox chbCategory5;
	
	private Data data = Data.getInstance();
	private Helper helper = Helper.getInstance();
	private boolean pressedCtrl;

	@FXML public void chbCategoryAction(ActionEvent ae) {
		DummyData.dummyData();
		/*
		if (ae.getSource()==chbCategory1) {
			data.getCategories().get(0).setSelected(false);
		} else if (ae.getSource()==chbCategory2) {
			data.getCategories().get(1).setSelected(false);
		} else if (ae.getSource()==chbCategory3) {
			data.getCategories().get(2).setSelected(false);
		} else if (ae.getSource()==chbCategory4) {
			data.getCategories().get(3).setSelected(false);
		} else if (ae.getSource()==chbCategory5) {
			data.getCategories().get(4).setSelected(false);
		}
		*/
	}
	
	@FXML protected void btnNextAction() {
		DummyData.dummyData();
		if (chbCategory1.isSelected()) {
			data.getCategories().get(0).setSelected(true);
		} else {
			data.getCategories().get(0).setSelected(false);
		}
		if (chbCategory2.isSelected()) {
			data.getCategories().get(1).setSelected(true);
		} else {
			data.getCategories().get(1).setSelected(false);
		}
		if (chbCategory3.isSelected()) {
			data.getCategories().get(2).setSelected(true);
		} else {
			data.getCategories().get(2).setSelected(false);
		}
		if (chbCategory4.isSelected()) {
			data.getCategories().get(3).setSelected(true);
		} else {
			data.getCategories().get(3).setSelected(false);
		}
		if (chbCategory5.isSelected()) {
			data.getCategories().get(4).setSelected(true);
		} else {
			data.getCategories().get(4).setSelected(false);
		}
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
