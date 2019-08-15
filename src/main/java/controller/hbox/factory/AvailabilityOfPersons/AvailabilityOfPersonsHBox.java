package controller.hbox.factory.AvailabilityOfPersons;

import controller.hbox.factory.IHBox;
import controller.hbox.factory.components.*;
import javafx.geometry.NodeOrientation;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import model.sample.People;

public class AvailabilityOfPersonsHBox implements IHBox {

    private People people;

    private int numberOfDays = 31;

    AvailabilityOfPersonsHBox(People people) {
        this.people = people;
    }

    @Override
    public HBox getHBox() {

        HBox hBox = new HBoxCreator.Builder()
                .setPrefHeight(60)
                .setPrefWidth(50)
                .setPrefWidth(Region.USE_COMPUTED_SIZE)
                .build();

        Label nameOfPerson = new LabelCreator.Builder()
                .setPrefWidth(180.0)
                .setPrefHeight(60)
                .setText(people.toString())
                .build();
        nameOfPerson.setTextAlignment(TextAlignment.CENTER);
        hBox.getChildren().addAll(nameOfPerson);
        for (int i = 1; i <= numberOfDays; i++) {

            Separator separatorBetweenDays = new SeparatorCreator.Builder()
                    .setPrefWidth(8.0)
                    .setVisible(false)
                    .build();

            VBox vBox = new VBoxCreator.Builder()
                    .setPrefHeight(60)
                    .setPrefWidth(50)
                    .build();

            Button numberOfDay = new ButtonCreator.Builder()
                    .setText(String.valueOf(i) + "D")
                    .setPrefWidth(45)
                    .build();
            Button numberOfNight = new ButtonCreator.Builder()
                    .setText(String.valueOf(i) + "N")
                    .setPrefWidth(45)
                    .build();
            vBox.getChildren().addAll(numberOfDay, numberOfNight);
            hBox.getChildren().addAll(separatorBetweenDays, vBox);
        }
        return hBox;
    }
}
