package controller.hbox.factory.NameToRefactor.names;

import controller.hbox.factory.AvailabilityOfPersons.EvenColours;
import controller.hbox.factory.IHBox;
import controller.hbox.factory.components.HBoxCreator;
import controller.hbox.factory.components.LabelCreator;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.text.TextAlignment;
import model.sample.person.Person;

public class NameToRefactorNamesFirstHBox implements IHBox {

    private Person person;

    NameToRefactorNamesFirstHBox(Person person){
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
