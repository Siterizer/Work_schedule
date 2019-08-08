package controller.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class NewScheduleController {

    @FXML
    private TextField year;

    @FXML
    private ChoiceBox<String> monthChoiceBox;

    @FXML
    void handleCreate(){

    }

    @FXML
    public void initialize() {
        monthChoiceBox.getItems().addAll(
                "Styczeń", "Luty", "Marzec",
                "Kwiecień", "Maj", "Czerwiec",
                "Lipiec", "Sierpień", "Wrzesień",
                "Październik", "Listopad", "Grudzień");
        monthChoiceBox.setValue("Styczeń");
    }
}
