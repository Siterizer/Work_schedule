package controller.controllers;

import controller.hbox.factory.AvailabilityOfPersons.buttons.AvailabilityOfPersonsButtonsHBoxFactory;
import controller.hbox.factory.AvailabilityOfPersons.names.AvailabilityOfPersonsNamesHBoxFactory;
import controller.hbox.factory.IHBox;
import controller.hbox.factory.IHBoxFactory;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import model.sample.People;

import java.util.Enumeration;

public class AvailabilityOfPersonsController {

    @FXML
    private VBox nameVBox;

    @FXML
    private VBox daysVBox;

    @FXML
    public static AvailabilityOfPersonsController controller;

    @FXML
    private ScrollPane namesScrollPane;

    @FXML
    private ScrollPane daysScrollPane;


    @FXML
    public void initialize(){
        controller = this;
        IHBoxFactory hBoxNamesFactory = new AvailabilityOfPersonsNamesHBoxFactory();
        IHBoxFactory hBoxDaysFactory = new AvailabilityOfPersonsButtonsHBoxFactory();
        Enumeration vectorEnumeration = People.funkcja().elements();
        while(vectorEnumeration.hasMoreElements()){
            People peopleFromVector =(People) vectorEnumeration.nextElement();
            IHBox generatedDayHBox = hBoxDaysFactory.makeHBox(peopleFromVector);
            daysVBox.getChildren().add(generatedDayHBox.getHBox());
            IHBox generatedNameHBox = hBoxNamesFactory.makeHBox(peopleFromVector);
            nameVBox.getChildren().add(generatedNameHBox.getHBox());

        }
        daysScrollPane.vvalueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> ov,
                                Number old_val, Number new_val) {
                namesScrollPane.vvalueProperty().setValue(new_val.doubleValue());
            }
        });
    }
    public void updateVBox(){
        nameVBox.getChildren().clear();
        daysVBox.getChildren().clear();
        initialize();
    }

}
