package controller.controllers;

import controller.display.controller.MessageBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import model.sample.person.Person;
import java.nio.charset.IllegalCharsetNameException;

public class AddPersonController {

    @FXML
    private TextField firstName;

    @FXML
    private TextField lastName;

    @FXML
    void handleAdd(ActionEvent event) {
        addPerson();
    }

    @FXML
    void handleEnterButton(KeyEvent event) {
        if(event.getCode() == KeyCode.ENTER){
            addPerson();
        }
    }

    private void addPerson(){
        try {
            String firstNameString = firstName.getText().substring(0, 1).toUpperCase() + firstName.getText().substring(1).toLowerCase();
            String lastNameString = lastName.getText().substring(0, 1).toUpperCase() + lastName.getText().substring(1);
            checkFirstAndLastName();
            new Person(firstNameString, lastNameString);
            MessageBox.display("Dodawanie zakonczone sukcesem", (Stage) firstName.getScene().getWindow());
        } catch (IllegalCharsetNameException e) {
            MessageBox.display("Dodawanie nie powiodlo sie", null);
        }
    }
    
    private void checkFirstAndLastName() {
        if (firstName.getText().length() < 3) {
            throw new IllegalCharsetNameException("FirstNameLengthException");
        }
        if (!firstName.getText().matches("[a-zA-Z]+")) {
            throw new IllegalCharsetNameException("FirstNameCharacterException");
        }
        if (lastName.getText().length() < 3) {
            throw new IllegalCharsetNameException("LastNameLengthException");
        }
        if (!lastName.getText().matches("[a-zA-Z]+")) {
            throw new IllegalCharsetNameException("LastNameCharacterException");
        }
    }

}
