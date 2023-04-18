package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Account.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toString());
		primaryStage.setTitle("계정생성");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);		
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
