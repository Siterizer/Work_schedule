package controller.hbox.factory.AvailabilityOfPersons.names;

import controller.hbox.factory.IHBox;
import controller.hbox.factory.components.HBoxCreator;
import controller.hbox.factory.components.LabelCreator;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.text.TextAlignment;
import model.sample.People;

public class AvailabilityOfPersonsNamesHBox implements IHBox {

    private People people;

    AvailabilityOfPersonsNamesHBox(People people){
        this.people = people;
    }

    @Override
    public HBox getHBox() {
        HBox hBox = new HBoxCreator.Builder()
                .setPrefHeight(64)
                .setPrefWidth(50)
                .setPrefWidth(Region.USE_COMPUTED_SIZE)
                .build();

        Label nameOfPerson = new LabelCreator.Builder()
                .setPrefWidth(180.0)
                .setPrefHeight(64)
                .setText(people.toString())
                .build();
        nameOfPerson.setTextAlignment(TextAlignment.CENTER);
        hBox.getChildren().addAll(nameOfPerson);
        return hBox;
    }
}
