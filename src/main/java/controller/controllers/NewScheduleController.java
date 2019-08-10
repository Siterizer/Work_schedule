package controller.controllers;

import controller.display.controller.MessageBox;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.File;


public class NewScheduleController {

    @FXML
    private TextField year;

    @FXML
    private ChoiceBox<String> monthChoiceBox;

    @FXML
    void handleCreate() {
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

    private void createYear(String year) {
        try {
            checkYear(year);
            Process XMLYearCreator = Runtime.getRuntime().exec("java -jar ." + File.separator + "XMLYearCreator-1.0-SNAPSHOT.jar " + year);
            XMLYearCreator.waitFor();
            int feedback = XMLYearCreator.exitValue();
            if (feedback == 1)
                throw new Exception("Problem z utworzeniem pliku XML");
            MessageBox.display("Grafik stworzony prawidłowo", (Stage) this.year.getScene().getWindow());
        } catch (Exception e) {
            e.printStackTrace();
            MessageBox.display(e.getMessage(), null);
        }
    }

    private void checkYear(String year) throws Exception {
        if (Integer.parseInt(year) < 1900) {
            throw new Exception("Zły rok (rok > 1900)");
        }
    }
}
