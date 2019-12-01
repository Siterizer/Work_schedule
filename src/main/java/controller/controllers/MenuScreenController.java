package controller.controllers;

import controller.display.controller.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MenuScreenController {

    @FXML
    void handleAddKeeper(ActionEvent event) {
        AddPerson.display();
    }

    @FXML
    void handleDeleteKeeper(ActionEvent event) {
        RemovePerson.display();
    }

    @FXML
    void handleGenerateKeepersSchedule(ActionEvent event) {
        NameToRefactor.display();
    }

    @FXML
    void handleNewScheduleKeepers(ActionEvent event) {
        NewSchedule.display();
    }

    @FXML
    void handleSelectDepartment(ActionEvent event) {
        SelectDepartment.display();
    }

}
