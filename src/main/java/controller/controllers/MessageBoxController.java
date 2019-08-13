package controller.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class MessageBoxController {

    @FXML
    private Label message;

    @FXML
    private Stage stageToClose;

    @FXML
    private Button okButton;

    @FXML
    void handleOkButton(ActionEvent buttonClicked) {
        close();
    }

    @FXML
    void handleEnterButton(KeyEvent buttonEntered) {
        close();
    }

    public void setMessage(String message) {
        this.message.setText(message);
    }

    public void stageToClose(Stage closeThis){
        this.stageToClose = closeThis;
    }

    private void close(){
        Stage stage = (Stage) okButton.getScene().getWindow();
        stage.close();
        if(stageToClose != null) {
            this.stageToClose.close();
        }
    }
}
