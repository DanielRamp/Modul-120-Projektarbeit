package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;

public class SampleController implements Initializable {
	
	public void rightClick() {
		System.out.println("rightClick");
		Main m = new Main();
		m.main(null);
	}
	
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println("initialize executed");
	}

	
}
