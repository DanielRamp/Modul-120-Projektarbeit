package application;

import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {
	
	private Helper helper = Helper.getInstance();
	
	@Override
	public void start(Stage stage) {
		DummyData.dummyData();
		
		helper.setStage(stage);
		
		helper.firstView(stage, "View1.fxml");
		
		helper.getStage().show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
