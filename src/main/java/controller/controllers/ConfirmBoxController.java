package controller.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class ConfirmBoxController {

    public static boolean answer;

    @FXML
    private Label message;

    @FXML
    void handleNoButton(ActionEvent buttonClicked) {
        setAnswerAndCloseWindow(false);
    }

    @FXML
    void handleNoEnter(KeyEvent buttonEntered) {
        if(buttonEntered.getCode() == KeyCode.ENTER){
            setAnswerAndCloseWindow(false);
        }
    }

    @FXML
    void handleYesButton(ActionEvent buttonClicked) {
        setAnswerAndCloseWindow(true);
    }

    @FXML
    void handleYesEnter(KeyEvent buttonEntered) {
        if(buttonEntered.getCode() == KeyCode.ENTER){
        setAnswerAndCloseWindow(true);
        }
    }

    private void setAnswerAndCloseWindow(boolean answer){
        ConfirmBoxController.answer = answer;
        Stage stage = (Stage) message.getScene().getWindow();
        stage.close();
    }

    public void setMessage(String message){
        this.message.setText(message);
    }

    public void onCloseWindowFalse(){
        setAnswerAndCloseWindow(false);
    }
}
