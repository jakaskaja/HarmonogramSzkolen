package pl.pwn.reaktor.harmonogram.controller;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;


public class CourseController {

    @FXML
    private ComboBox<String> cmb_course_name;

    @FXML
    private TextField tf_akronim;

    @FXML
    private DatePicker dp_date_pick;

    @FXML
    private TextField tf_days_number;

    @FXML
    private ComboBox<String> cmb_course_type;

    @FXML
    private Button btn_add_course;

    @FXML
    private Button btn_back;

    @FXML
    void addCourse(MouseEvent event) {
    	
    	

    }

    @FXML
    void backFromCourses(MouseEvent event) throws IOException {

    	Parent parent = FXMLLoader.load(getClass().getResource("/view/MentorView.fxml"));
    	Scene scene = new Scene(parent);
    	pl.pwn.reaktor.harmonogram.Main.getPrimaryStage().setScene(scene);
    }
    
    
    
    ObservableList<String> course_name = FXCollections.observableArrayList("Back-end", "Front-end", "Web developer");
    ObservableList<String> course_type = FXCollections.observableArrayList("D","W");
  
    void initialize() {
    	
    	cmb_course_type.setItems(course_name);
    	cmb_course_type.setItems(course_type);
    }

}
