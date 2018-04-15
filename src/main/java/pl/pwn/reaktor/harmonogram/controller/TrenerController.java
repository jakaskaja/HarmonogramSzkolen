package pl.pwn.reaktor.harmonogram.controller;

import java.io.IOException;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import pl.pwn.reaktor.harmonogram.Main;
import pl.pwn.reaktor.harmonogram.model.TrenerTableRow;
import pl.pwn.reaktor.harmonogram.service.TrenerService;

public class TrenerController {

    @FXML
    private Label lbl_welcome;
    
    @FXML
    private TableView<TrenerTableRow> trener_table;

    @FXML
    private TableColumn<TrenerTableRow, String> tbl_date;

    @FXML
    private TableColumn<TrenerTableRow, String> tbl_group;

    @FXML
    private TableColumn<TrenerTableRow, String> tbl_topic;

    @FXML
    private TableColumn<TrenerTableRow, String> tbl_trainer;

    @FXML
    private CheckBox cb_mineOnly;

    @FXML
    private Button btn_logout;

    @FXML
    private Button btn_refresh;

    @FXML
    void logout(MouseEvent event) throws IOException {
    	
    		Parent parent = FXMLLoader.load(getClass().getResource("/view/LoginView.fxml"));
		Scene scene = new Scene(parent);
		Main.getPrimaryStage().setScene(scene);

    }

    @FXML
    void showMineOnly(ActionEvent event) {

    }
    
private TrenerService trenerService;
    


	
    //initialize to metoda, która od razu się wykonuje przy załadowaniu widoku
    public void initialize() {
    	
    		
    }

	private void fillTableData() {
		trenerService = new TrenerService();
		List<TrenerTableRow> trenerTableRows = trenerService.getAll();
	
		ObservableList<TrenerTableRow> data = FXCollections.observableArrayList(trenerTableRows);

		trener_table.setItems(null);
		trener_table.setItems(data);
	}

	private void setCellValue() {
		tbl_date.setCellValueFactory(new PropertyValueFactory<>("date"));
		tbl_group.setCellValueFactory(new PropertyValueFactory<>("group"));
		tbl_topic.setCellValueFactory(new PropertyValueFactory<>("topic"));
		tbl_trainer.setCellValueFactory(new PropertyValueFactory<>("trainer"));
		
	}
	
    @FXML
    void refresh(MouseEvent event) {
		fillTableData();
        
		setCellValue();
    }


}
