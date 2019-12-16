package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			//BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("01_Welcome.fxml"));
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("02_Feed.fxml"));
			Scene scene = new Scene(root,800,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void rightClick() {
		System.out.println("rightClick");
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
