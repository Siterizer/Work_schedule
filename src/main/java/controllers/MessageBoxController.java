package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MessageBoxController {

    @FXML
    private Label message;

    public void setMessage(String message){
        this.message.setText(message);
    }

    @FXML
    private Button okButton;

    @FXML
    void handleOkButton(ActionEvent event) {
        Stage stage = (Stage) okButton.getScene().getWindow();
        stage.close();
    }
}
