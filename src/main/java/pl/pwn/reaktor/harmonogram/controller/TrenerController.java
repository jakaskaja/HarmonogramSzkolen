package pl.pwn.reaktor.harmonogram.controller;

import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
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
    void logout(MouseEvent event) {

    }

    @FXML
    void showMineOnly(ActionEvent event) {

    }
    
private TrenerService trenerService;
    


	
    //initialize to metoda, która od razu się wykonuje przy załadowaniu widoku
    public void initialize() {
    	
    		fillTableData();
    		
    		setCellValue();
    		
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

}
