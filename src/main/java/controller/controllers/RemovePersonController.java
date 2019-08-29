package controller.controllers;

import controller.hbox.factory.IHBox;
import controller.hbox.factory.IHBoxFactory;
import controller.hbox.factory.RemovePerson.RemovePersonHBoxFactory;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import model.sample.person.Person;
import java.util.Enumeration;

public class RemovePersonController {

    @FXML
    private VBox vBox;

    @FXML
    public static RemovePersonController controller;

    @FXML
    public void initialize(){
        controller = this;
        IHBoxFactory hBoxFactory = new RemovePersonHBoxFactory();
        Enumeration vectorEnumeration = Person.funkcja().elements();
        while(vectorEnumeration.hasMoreElements()){
            Person personFromVector =(Person) vectorEnumeration.nextElement();
            IHBox generatedHBox = hBoxFactory.makeHBox(personFromVector);
            vBox.getChildren().add(generatedHBox.getHBox());
        }
    }

    public void updateVBox(){
        vBox.getChildren().clear();
        initialize();
    }

}
