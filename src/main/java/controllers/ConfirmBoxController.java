package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ConfirmBoxController {

    public static boolean answer;

    @FXML
    private Label message;

    @FXML
    void handleNoButton(ActionEvent event) {
        answer = false;
        Stage stage = (Stage) message.getScene().getWindow();
        stage.close();
    }

    @FXML
    void handleYesButton(ActionEvent event) {
        answer = true;
        Stage stage = (Stage) message.getScene().getWindow();
        stage.close();

    }

    public void setMessage(String message){
        this.message.setText(message);
    }
}
