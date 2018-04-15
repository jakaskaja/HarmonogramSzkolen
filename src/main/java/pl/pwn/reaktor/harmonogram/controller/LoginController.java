package pl.pwn.reaktor.harmonogram.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import pl.pwn.reaktor.harmonogram.Main;
import pl.pwn.reaktor.harmonogram.service.LoginService;

public class LoginController {

    @FXML
    private TextField tf_login;

    @FXML
    private TextField tf_password;

    @FXML
    private Button btn_login;

    @FXML
    private Button btn_register;
    
    @FXML
    private Button btn_guest;

    @FXML
    void login(MouseEvent event) throws IOException {
    	
    		String login = tf_login.getText();
    		String password = tf_password.getText();
    		boolean isLogin = loginService.login(login, password);
    		int role = loginService.checkRole(login, password);
    		if (isLogin) {
 
    			if (role==1) {
	    		Parent parent = FXMLLoader.load(getClass().getResource("/view/MentorView.fxml"));
			Scene scene = new Scene(parent);
			Main.getPrimaryStage().setScene(scene);
    			} else {
    				Parent parent = FXMLLoader.load(getClass().getResource("/view/TrenerView.fxml"));
    				Scene scene = new Scene(parent);
    				Main.getPrimaryStage().setScene(scene);
    			}
    		} else {
    			Alert error = new Alert(AlertType.ERROR);
    			error.setHeaderText("Error");
    			error.setContentText("Błędny login lub hasło");
    			error.setTitle("Błąd logowania");
    			error.show();
    		}
    }

    @FXML
    void register(MouseEvent event) {

    }
    
    @FXML
    void enterAsGuest(MouseEvent event) throws IOException {
     	Parent parent = FXMLLoader.load(getClass().getResource("/view/TrenerView.fxml"));
		Scene scene = new Scene(parent);
		Main.getPrimaryStage().setScene(scene);
    }
    
    private LoginService loginService;
    
    public void initialize() {
    		loginService = new LoginService();
    }

}
