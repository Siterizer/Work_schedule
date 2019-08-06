package controller.controllers;

import controller.display.controller.AddPerson;
import controller.display.controller.NewSchedule;
import controller.display.controller.RemovePerson;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MenuScreenController {

    @FXML
    void handleOpiekunowieDodaj(ActionEvent event) {

        AddPerson.dipsplay();
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

    }
}
