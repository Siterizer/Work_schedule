package controller.controllers;

import controller.display.controller.AddPerson;
import controller.display.controller.NewSchedule;
import controller.display.controller.RemovePerson;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import model.sample.person.Person;

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
    }
}
