package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;

import DB.UserVO;
import application.Util.DbSingleton;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
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
	private PasswordField inputPwd;
	@FXML
	private TextField inputName;
	@FXML
	private TextField inputAddress;
	@FXML
	private TextField inputPhone;
	@FXML
	private TextField inputEmail;
	
	private Connection con;
	private PreparedStatement ps;
	
	public Account_controller() {
		con = DbSingleton.getInstance();
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// combo_box.setItems(list);
		submitRegister.setOnAction(event->handleSubmitRegisterAction(event));
	}
	
	private void handleSubmitRegisterAction(ActionEvent event) {
		System.out.println("회원가입 버튼 메소드 실행");
		
		UserVO userVO = new UserVO();
		
		String id = inputId.getText();
		String pwd = inputPwd.getText();
		String name = inputName.getText();
		String phone = inputPhone.getText();
		String email = inputEmail.getText();
		
		userVO.setId(id);
		userVO.setId(pwd);
		userVO.setId(name);
		userVO.setId(phone);
		userVO.setId(email);
		
		System.out.println(id);
		System.out.println(pwd);
		System.out.println(name);
		System.out.println(phone);
		System.out.println(email);
		
		try {
//			con = DbSingleton.getInstance();
			
			String sql = "insert into bus_user values(?,?,?,?,?)";
			
			ps = con.prepareStatement(sql);
			
			ps.setString(1, userVO.getId());
			ps.setString(2, userVO.getPwd());
			ps.setString(3, userVO.getName());
			ps.setString(4, userVO.getPhone());
			ps.setString(5, userVO.getEmail());
			
			ps.executeUpdate();
			
			System.out.println("데이터가 정상적으로 insert 되었습니다. " + sql);
			
			ps.close();
			con.close();
			
		} catch (Exception e) {
			e.getStackTrace();
		}
		
	}

	public void comboChanged(ActionEvent actionEvent) {
		System.out.println("choose the" + combo_box.getValue().toString());
	}
}
