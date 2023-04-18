package application.Account;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class Account_controller implements Initializable{

	@FXML
	public ComboBox<String> combo_box;
	ObservableList<String> list = FXCollections.observableArrayList("010","011","016","017");
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		combo_box.setItems(list);
	}
	
	public void comboChanged(ActionEvent actionEvent) {
		System.out.println("choose the" + combo_box.getValue().toString());
	}
}
