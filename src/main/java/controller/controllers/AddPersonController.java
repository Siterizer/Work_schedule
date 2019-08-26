package controller.controllers;

import controller.display.controller.MessageBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import model.sample.person.ContractTypeMethods;
import model.sample.person.ContractType;
import model.sample.person.Person;
import java.nio.charset.IllegalCharsetNameException;

public class AddPersonController {

    @FXML
    private TextField firstName;

    @FXML
    private TextField lastName;

    @FXML
    private ChoiceBox<String> contractType;

    public void initialize(){
        for(ContractType type : ContractType.values()){
            contractType.getItems().add(ContractTypeMethods.getStringContract(type));
        }
        contractType.setValue(ContractTypeMethods.getStringContract(ContractType.CONTRACT_OF_EMPLOYMENT));
    }

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
            new Person(firstNameString, lastNameString, contractType.getValue());
            MessageBox.display("Dodawanie zakonczone sukcesem", (Stage) firstName.getScene().getWindow());
        } catch (IllegalArgumentException e) {
            MessageBox.display("Dodawanie nie powiodlo sie", null);
        }
    }
    
    private void checkFirstAndLastName() {
        if (firstName.getText().length() < 3) {
            throw new IllegalArgumentException("FirstNameLengthException");
        }
        if (!firstName.getText().matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("FirstNameCharacterException");
        }
        if (lastName.getText().length() < 3) {
            throw new IllegalArgumentException("LastNameLengthException");
        }
        if (!lastName.getText().matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("LastNameCharacterException");
        }
    }

    private void checkContractType(){
        boolean temp = false;
        for(ContractType type : ContractType.values()){
            if(ContractTypeMethods.getContract(contractType.getValue()) == type){
                temp = true;
            }
        }
        if(!temp){
            throw new IllegalArgumentException("ContratTypeException");
        }
    }

}
