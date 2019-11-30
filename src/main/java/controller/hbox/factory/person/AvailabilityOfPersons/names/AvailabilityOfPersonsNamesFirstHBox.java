package controller.hbox.factory.person.AvailabilityOfPersons.names;

import controller.hbox.factory.person.IHBoxP;
import controller.hbox.factory.components.HBoxCreator;
import controller.hbox.factory.components.LabelCreator;
import controller.hbox.factory.person.AvailabilityOfPersons.EvenColours;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.text.TextAlignment;
import model.sample.person.Person;

public class AvailabilityOfPersonsNamesFirstHBox implements IHBoxP {

    private int numberOfDays;

    private Person person;

    AvailabilityOfPersonsNamesFirstHBox(Person person){
        this.numberOfDays = person.getAvailabilityMonth().getNumberOfDays();
        this.person = person;
    }
    @Override
    public HBox getHBox() {
        HBox hBox = new HBoxCreator.Builder()
                .setPrefHeight(25)
                .setPrefWidth(50)
                .setPrefWidth(Region.USE_COMPUTED_SIZE)
                .build();

        Label nameOfPerson = new LabelCreator.Builder()
                .setPrefWidth(180.0)
                .setPrefHeight(25)
                .setText("Nazwisko Imie")
                .build();
        nameOfPerson.setTextAlignment(TextAlignment.CENTER);
        hBox.getChildren().addAll(nameOfPerson);
        hBox.setStyle(EvenColours.getColour(false));
        return hBox;
    }
}
