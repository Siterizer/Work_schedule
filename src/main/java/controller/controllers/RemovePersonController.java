package controller.controllers;

import controller.hbox.factory.person.IHBoxP;
import controller.hbox.factory.person.IHBoxPFactory;
import controller.hbox.factory.person.RemovePerson.RemovePersonHBoxPFactory;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import model.sample.person.Person;
import model.sample.person.PersonMethods;

import java.util.Enumeration;

public class RemovePersonController {

    @FXML
    private VBox vBox;

    @FXML
    public static RemovePersonController controller;

    @FXML
    private Button addNew;

    @FXML
    public void initialize(){
        controller = this;
        IHBoxPFactory hBoxFactory = new RemovePersonHBoxPFactory();
        Enumeration vectorEnumeration = PersonMethods.getActualPersons().elements();
        while(vectorEnumeration.hasMoreElements()){
            Person personFromVector =(Person) vectorEnumeration.nextElement();
            IHBoxP generatedHBox = hBoxFactory.makeHBox(personFromVector);
            vBox.getChildren().add(generatedHBox.getHBox());
        }
    }

    public void updateVBox(){
        vBox.getChildren().clear();
        initialize();
    }

}
