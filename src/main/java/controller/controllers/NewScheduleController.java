package controller.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.io.IOException;

public class NewScheduleController {

    @FXML
    private TextField year;

    @FXML
    private ChoiceBox<String> monthChoiceBox;

    @FXML
    void handleCreate() throws IOException, InterruptedException {
    //year.getText(); monthChoiceBox.getValue()
        createYear(year.getText());
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

    private void createYear(String year) throws IOException, InterruptedException {
        Runtime.getRuntime().exec("java -jar ./XMLYearCreator-1.0-SNAPSHOT.jar " + year);
        
    }
}
