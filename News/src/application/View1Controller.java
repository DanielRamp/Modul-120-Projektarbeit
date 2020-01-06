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
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Outputter.out(""+data.getCategories().size());
		if (!data.isCategoryChoosen()) {
			chbCategory1.setSelected(true);
			chbCategory2.setSelected(true);
			chbCategory3.setSelected(true);
			chbCategory4.setSelected(true);
			chbCategory5.setSelected(true);
		} else {
			CheckBox[] checkBoxes = {chbCategory1, chbCategory2, chbCategory3, chbCategory4, chbCategory5};
			for (int i = 0; i < data.getCategories().size(); i++) {
				if (data.getCategories().get(i).isSelected()) {
					checkBoxes[i].setSelected(true);
				} else {
					checkBoxes[i].setSelected(false);
				}
			}
		}
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
		data.setCategoryChoosen(true);
		helper.changeView("View2.fxml");
	}
	
	public void hideWelcome() {
		BorderPane bp = (BorderPane) lblWelcome.getParent();
		bp.setTop(null);
		lblCategoryChoose.setText("Kategorien ändern");
	}
	
	@FXML protected void keyPressed(KeyEvent ke) {
		KeyCode kc = ke.getCode();
		if (kc == KeyCode.ESCAPE) {
			helper.closeApplication();
			Outputter.out("Escape Key pressed, closing Application!");
		} else if (kc == KeyCode.CONTROL) {
			pressedCtrl = true;
			Outputter.out("pressedCtrl = true");
		} else if (kc == KeyCode.W) {
			if (pressedCtrl) {
				Outputter.out("Ctrl + W Keys pressed, closing Application!");
				helper.closeApplication();
			}
		} else if (kc == KeyCode.Q) {
			if (pressedCtrl) {
				Outputter.out("Ctrl + Q Keys pressed, closing Application!");
				helper.closeApplication();
			}
		} else {
			Outputter.out("Key " + kc + " pressed");
		}
	}
	
	@FXML protected void keyReleased(KeyEvent ke) {
		KeyCode kc = ke.getCode();
		if (kc == KeyCode.CONTROL) {
			pressedCtrl = false;
			Outputter.out("pressedCtrl = false");
		} else {
			Outputter.out("Key " + kc + " released");
		}
	}
	
}
