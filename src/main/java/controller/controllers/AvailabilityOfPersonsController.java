package controller.controllers;

import controller.hbox.factory.person.AvailabilityOfPersons.days.AvailabilityOfPersonsDaysHBoxPFactory;
import controller.hbox.factory.person.AvailabilityOfPersons.names.AvailabilityOfPersonsNamesHBoxPFactory;
import controller.hbox.factory.person.IHBoxP;
import controller.hbox.factory.person.IHBoxPFactory;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.VBox;
import model.sample.department.DepartmentMethods;
import model.sample.person.Person;
import model.sample.person.PersonMethods;

import java.util.Enumeration;
import java.util.Vector;

public class AvailabilityOfPersonsController {

    @FXML
    private SplitPane splitPane;

    @FXML
    private ScrollPane namesScrollPane;

    @FXML
    private ScrollPane daysScrollPane;

    @FXML
    private ScrollPane firstDaysScrollPane;

    @FXML
    private VBox nameVBox;

    @FXML
    private VBox firstNameVBox;

    @FXML
    private VBox daysVBox;

    @FXML
    private VBox firstDaysVBox;

    public void initialize(){
        Vector<Person> persons = PersonMethods.getActualPersons();
        IHBoxPFactory hBoxNamesFactory = new AvailabilityOfPersonsNamesHBoxPFactory();
        IHBoxPFactory hBoxDaysFactory = new AvailabilityOfPersonsDaysHBoxPFactory();
        IHBoxP generatedDaysFirstHBox = hBoxDaysFactory.makeFirstHBox(persons.get(0));
        firstDaysVBox.getChildren().add(generatedDaysFirstHBox.getHBox());
        IHBoxP generatedNamesFirstHBox = hBoxNamesFactory.makeFirstHBox(persons.get(0));
        firstNameVBox.getChildren().add(generatedNamesFirstHBox.getHBox());
        Enumeration vectorEnumeration = persons.elements();
        while(vectorEnumeration.hasMoreElements()){
            Person personFromVector =(Person) vectorEnumeration.nextElement();
            IHBoxP generatedDayHBox = hBoxDaysFactory.makeHBox(personFromVector);
            daysVBox.getChildren().add(generatedDayHBox.getHBox());
            IHBoxP generatedNameHBox = hBoxNamesFactory.makeHBox(personFromVector);
            nameVBox.getChildren().add(generatedNameHBox.getHBox());
        }
        daysScrollPane.vvalueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> ov,
                                Number old_val, Number new_val) {
                namesScrollPane.vvalueProperty().setValue(new_val.doubleValue());
            }
        });
        daysScrollPane.hvalueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> ov,
                                Number old_val, Number new_val) {
                firstDaysScrollPane.hvalueProperty().setValue(new_val.doubleValue());
            }
        });
        int numberOfDays = persons.get(0).getAvailabilityMonth().getNumberOfDays();
        splitPane.setDividerPositions((double) (0.295 - ((31 - numberOfDays)  * 0.0066)));
    }
}
