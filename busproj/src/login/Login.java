package login;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Login implements Initializable {
	@FXML private Button btnAdd;
	@FXML private TextField LoginId;
	@FXML private TextField LoginPwd;
	@FXML private Button btnLogin;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnAdd.setOnAction(event->handleBtnAddAction(event));
		btnLogin.setOnAction(event->handleBtnLoginAction(event));
	}

	private void handleBtnLoginAction(ActionEvent event) {
//		String id=LoginId.getText();
//		String pwd=LoginPwd.getText();
//		System.out.println(id);
//		System.out.println(pwd);
		Alert alert = new Alert(AlertType.WARNING);
		alert.setTitle("Warning Dialog");
		alert.setHeaderText("Look, a Warning Dialog");
		alert.setContentText("Careful with the next step!");

		alert.showAndWait();
	}

	private void handleBtnAddAction(ActionEvent event) {
		try {
			Stage dialog = new Stage(StageStyle.UTILITY);
			dialog.initModality(Modality.WINDOW_MODAL);
			dialog.initOwner(btnAdd.getScene().getWindow());
			dialog.setTitle("추가");
			
			Parent parent = FXMLLoader.load(getClass().getResource("Account.fxml"));
			
			Scene scene = new Scene(parent);
			dialog.setScene(scene);
			dialog.setResizable(false);
			dialog.show();	
		} catch (IOException e) {}	
	}
}

