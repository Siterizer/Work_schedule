package controller.controllers;

import controller.hbox.factory.IHBox;
import controller.hbox.factory.IHBoxFactory;
import controller.hbox.factory.RemovePersonHBoxFactory;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import model.sample.People;
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
        Enumeration vectorEnumeration = People.funkcja().elements();

        while(vectorEnumeration.hasMoreElements()){
            People peopleFromVector =(People) vectorEnumeration.nextElement();
            IHBox generatedHBox = hBoxFactory.makeHBox(peopleFromVector);
            vBox.getChildren().add(generatedHBox.getHBox());
        }
    }

    public void updateVBox(){
        vBox.getChildren().clear();
        initialize();
    }

}
