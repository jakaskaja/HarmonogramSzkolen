package pl.pwn.reaktor.harmonogram.controller;

import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.input.MouseEvent;
import pl.pwn.reaktor.harmonogram.Main;

public class assignController {

    @FXML
    private DatePicker dp_pick_date;

    @FXML
    private ComboBox<String> cmb_group;

    @FXML
    private ComboBox<String> cmb_category;

    @FXML
    private ComboBox<String> cmb_trainer;

    @FXML
    private Button btn_clear;

    @FXML
    private Button btn_add;

    @FXML
    void actionAdd(MouseEvent event) {

    }

    @FXML
    void actionBack(MouseEvent event) throws IOException {
    	Parent parent = FXMLLoader.load(getClass().getResource("/view/MentorView.fxml"));
		Scene scene = new Scene(parent);
		Main.getPrimaryStage().setScene(scene);
    }

    @FXML
    void actionClear(MouseEvent event) {
    	cmb_group.setValue("Select");
    	cmb_category.setValue("Select");
    	cmb_trainer.setValue("Select");
    	dp_pick_date.setValue(null);
    }
    
    @FXML
    void cat_list(ActionEvent event) {
    	
    }
    ObservableList<String> group = FXCollections.observableArrayList("BeD-W1-2018", "BeD-W2-2018","Select");
    ObservableList<String> category = FXCollections.observableArrayList("Java", "Python", "SQL", "Select");
    ObservableList<String> trainer = FXCollections.observableArrayList("KL", "MK", "RB", "Select");
    public void initialize() {
    	cmb_category.setItems(category);
    	cmb_group.setItems(group);
    	cmb_trainer.setItems(trainer);
    	
    }
    
    
}
