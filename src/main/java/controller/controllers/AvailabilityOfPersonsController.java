package controller.controllers;

import controller.hbox.factory.AvailabilityOfPersons.AvailabilityOfPersonsHBoxFactory;
import controller.hbox.factory.IHBox;
import controller.hbox.factory.IHBoxFactory;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import model.sample.People;

import java.util.Enumeration;

public class AvailabilityOfPersonsController {

    @FXML
    private VBox vBox;

    @FXML
    public static AvailabilityOfPersonsController controller;

    @FXML
    public void initialize(){
        controller = this;
        AvailabilityOfPersonsHBoxFactory hBoxFactory = new AvailabilityOfPersonsHBoxFactory();//do naprawy
        IHBox generatedHBox = hBoxFactory.makeFirstHBox();
        vBox.getChildren().add(generatedHBox.getHBox());

        Enumeration vectorEnumeration = People.funkcja().elements();
        while(vectorEnumeration.hasMoreElements()){
            People peopleFromVector =(People) vectorEnumeration.nextElement();
            IHBox generatedHBox1 = hBoxFactory.makeHBox(peopleFromVector);
            vBox.getChildren().add(generatedHBox1.getHBox());
        }
    }
}
