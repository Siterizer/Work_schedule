package controller.controllers;

import controller.display.controller.MessageBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import model.sample.department.Department;
import model.sample.department.DepartmentMethods;

public class AddDepartmentController {

    @FXML
    private TextField name;

    @FXML
    private TextField nursesNumber;

    @FXML
    private TextField keepersNumber;

    @FXML
    private Button addButton;

    @FXML
    void addButtonAction(ActionEvent event) {
        addDepartment();
    }

    @FXML
    void handleEnterButton(KeyEvent event) {
        if(event.getCode() == KeyCode.ENTER){
            addDepartment();
        }
    }

    private void addDepartment() {
        try {
        String varName = name.getText().substring(0, 1).toUpperCase() + name.getText().substring(1).toLowerCase();
        int nurses = Integer.parseInt(nursesNumber.getText());
        int keepers = Integer.parseInt(keepersNumber.getText());
        DepartmentMethods.checkName(varName);
        DepartmentMethods.checkValues(nurses, keepers);
        new Department(varName, nurses, keepers);
        MessageBox.display("Dodawanie zakonczone sukcesem", (Stage) name.getScene().getWindow());
    } catch(IllegalArgumentException e){
            MessageBox.display("Dodawanie nie powiodlo sie", null);
        }
        SelectDepartmentController.controller.updateVBox();
    }

}
