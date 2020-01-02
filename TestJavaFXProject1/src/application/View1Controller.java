package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class View1Controller implements Initializable {

	@FXML private Button btnNext;
	@FXML private Label lblWelcome;
	
	@FXML
	private ListView<String> lstCategories;
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@FXML
	protected void btnNextAction() {
		/*
		Data d = Data.getInstance();
		
		ArrayList<Category> categories = d.getCategories();
		
		categories.add(new Category("icon1", "text1", false));
		categories.add(new Category("icon2", "text2", true));
		categories.add(new Category("icon3", "text3", false));
		
		for (Category category : categories) {
			lstCategories.getItems().add(category.isSelected().toString());
		}
		*/
		
		System.out.println("View2 sollte hetzt");
		
		Stage stage;
		Parent root = null;
		
		stage = (Stage) btnNext.getScene().getWindow();
		
		try {
			root = FXMLLoader.load(getClass().getResource("View1old.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
	}
	
	
	
	
	
	
	
	private boolean pressedCtrl;
	
	
	@FXML
	protected void keyPressed(KeyEvent ke) {
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
	
	@FXML
	protected void keyReleased(KeyEvent ke) {
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
			((Node)((KeyEvent) o).getSource()).getScene().getWindow().hide(); // Source: https://stackoverflow.com/a/21938672
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//System.out.println("location"+location);
		//System.out.println("resources"+resources);
	}
	
}
