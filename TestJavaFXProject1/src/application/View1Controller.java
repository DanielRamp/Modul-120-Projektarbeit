package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class View1Controller implements Initializable {

	@FXML
	private Button btnNext;
	
	private boolean pressedCtrl;
	
	@FXML
	protected void btnNextAction() {
		System.out.println("juhuii");
		btnNext.setText("Teesstt");
	}
	
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
