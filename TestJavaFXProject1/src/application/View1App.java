package application;

import javafx.application.Application;
import javafx.stage.Stage;


public class View1App extends Application {
	
	@Override
	public void start(Stage stage) {
		Helper helper = Helper.getInstance();
		
		stage = helper.changeView(stage, "View1.fxml");
		
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
