package application;

import javafx.application.Application;
import javafx.stage.Stage;


public class View1App extends Application {
	
	@Override
	public void start(Stage stage) {
		Helper helper = Helper.getInstance();
		
		helper.setStage(stage);
		
		helper.firstView(stage, "View1.fxml");
		
		helper.getStage().show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
