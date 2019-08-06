package controller.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class MessageBoxController {

    @FXML
    private Label message;
    private Stage stageToClose;


    public void setMessage(String message) {
        this.message.setText(message);
    }


    public void stageToClose(Stage closeThis){
        this.stageToClose = closeThis;

    }

    @FXML
    private Button okButton;

    @FXML
    void handleOkButton(ActionEvent event) {
        close();
    }

    @FXML
    void handleEnterButton(KeyEvent event) {
        close();
    }

    private void close(){
        Stage stage = (Stage) okButton.getScene().getWindow();
        stage.close();
        if(stageToClose != null) {
            this.stageToClose.close();
        }
    }
}
