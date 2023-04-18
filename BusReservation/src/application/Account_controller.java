package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class Account_controller implements Initializable{

	@FXML
	public ComboBox<String> combo_box;
	ObservableList<String> list = FXCollections.observableArrayList("010","011","016","017");
	
	@FXML
	private Button submitRegister;
	
	@FXML
	private TextField inputId;
	@FXML
	private TextField inputPwd;
	@FXML
	private TextField inputName;
	@FXML
	private TextField inputAddress;
	@FXML
	private TextField inputPhone;
	@FXML
	private TextField inputEmail;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		combo_box.setItems(list);
		submitRegister.setOnAction(event->handleSubmitRegisterAction(event));
	}
	
	private void handleSubmitRegisterAction(ActionEvent event) {
		String id = inputId.getText();
		String pwd = inputPwd.getText();
		String name = inputName.getText();
		String address = inputAddress.getText();
		String phone = inputPhone.getText();
		String email = inputEmail.getText();
		
		System.out.println(id);
		System.out.println(pwd);
		System.out.println(name);
		System.out.println(address);
		System.out.println(phone);
		System.out.println(email);
		
	}

	public void comboChanged(ActionEvent actionEvent) {
		System.out.println("choose the" + combo_box.getValue().toString());
	}
}
