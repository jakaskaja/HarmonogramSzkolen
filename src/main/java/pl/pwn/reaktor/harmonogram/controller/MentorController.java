package pl.pwn.reaktor.harmonogram.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import pl.pwn.reaktor.harmonogram.Main;

public class MentorController {

    @FXML
    private Button btn_new_course;

    @FXML
    void enterToAddNewCourse(MouseEvent event) throws IOException {

    	Parent parent = FXMLLoader.load(getClass().getResource("/view/NewCourse.fxml"));
		Scene scene = new Scene(parent);
		Main.getPrimaryStage().setScene(scene);
    }

}
