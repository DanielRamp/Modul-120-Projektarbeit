package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class View1App extends Application {
	@Override
	public void start(Stage stage) {
		try {
			//BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("View1.fxml"));
			//Scene scene = new Scene(root,800,600);
			Scene scene = new Scene(root);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
			stage.setMinHeight(900);
			stage.setMinWidth(600);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
