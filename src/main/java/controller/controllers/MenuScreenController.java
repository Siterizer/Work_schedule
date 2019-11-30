package controller.controllers;

import controller.display.controller.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MenuScreenController {

    @FXML
    void handleOpiekunowieDodaj(ActionEvent event) {
        AddPerson.display();
    }

    @FXML
    void handleOpiekunowieUsun(ActionEvent event) {
        RemovePerson.display();
    }

    @FXML
    void handleOpiekunowieNowyGrafik(ActionEvent event) {
        NewSchedule.display();
    }

    @FXML
    void handleOpiekunowieGeneruj(ActionEvent event) {
        NameToRefactor.display();
    }

    @FXML
    void handleOddzialWybierz(ActionEvent event) {
        SelectDepartment.display();
    }
}
