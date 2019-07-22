package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sample.People;

import javax.swing.*;
import java.io.IOException;
import java.nio.charset.IllegalCharsetNameException;

public class AddPersonController {

    @FXML
    private TextArea firstName;

    @FXML
    private TextArea lastName;

    @FXML
    void handleAdd(ActionEvent event) {
        try{
            if(firstName.getText().length() < 3){
                throw new IllegalCharsetNameException("FirstNameLengthException");
            }
            if(!firstName.getText().matches("[a-zA-Z]+")){
                throw new IllegalCharsetNameException("FirstNameCharacterException");
            }
            if(lastName.getText().length() < 3){
                throw new IllegalCharsetNameException("LastNameLengthException");
            }
            if(!lastName.getText().matches("[a-zA-Z]+")){
                throw new IllegalCharsetNameException("LastNameCharacterException");
            }

            new People(firstName.getText(), lastName.getText());
            message("Dodawanie zakonczone sukcesem", true);
        }

        catch(IllegalCharsetNameException e){
            System.out.println(e.getCharsetName());
            message("Dodawanie nie powiodlo sie", false);
        }

    }
    private void message(String message, boolean closeTheWindow){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/MessageBox.fxml"));
            Parent root1 = fxmlLoader.load();
            MessageBoxController controller = fxmlLoader.getController();
            controller.setMessage(message);
            if(closeTheWindow){
                controller.stageToClose((Stage) firstName.getScene().getWindow());
            }
            Stage stage = new Stage();
            stage.setTitle("Wiadomosc");
            stage.setScene(new Scene(root1));
            stage.setResizable(false);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
            System.out.println(People.funkcja());
        } catch (IOException e) {
            System.out.println("Nie mozna otworzyc okna 'Wiadomosc'");
        }
    }

}
