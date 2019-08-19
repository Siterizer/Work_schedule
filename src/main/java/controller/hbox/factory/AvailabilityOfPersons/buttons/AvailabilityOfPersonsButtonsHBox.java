package controller.hbox.factory.AvailabilityOfPersons.buttons;

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

public class AvailabilityOfPersonsButtonsHBox implements IHBox {

    private People people;

    private static int numberOfDays = 31;

    AvailabilityOfPersonsButtonsHBox(People people) {
        this.people = people;
    }

    @Override
    public HBox getHBox() {

        HBox hBox = new HBoxCreator.Builder()
                .setPrefHeight(64)
                .setPrefWidth(50)
                .setPrefWidth(Region.USE_COMPUTED_SIZE)
                .build();
        for (int i = 1; i <= numberOfDays; i++) {

            Separator separatorBetweenDays = new SeparatorCreator.Builder()
                    .setPrefWidth(20.0)
                    .setVisible(true)
                    .build();

            VBox vBox = new VBoxCreator.Builder()
                    .setPrefHeight(64)
                    .setPrefWidth(50)
                    .build();

            Button numberOfDay = new ButtonCreator.Builder()
                    .setText(String.valueOf(i) + "D")
                    .setPrefWidth(45)
                    .build();
            Separator separatorBetweenTimeOfDay = new SeparatorCreator.Builder()
                    .setPrefHeight(5.0)
                    .setPrefWidth(3.0)
                    .setVisible(true)
                    .build();
            Button numberOfNight = new ButtonCreator.Builder()
                    .setText(String.valueOf(i) + "N")
                    .setPrefWidth(45)
                    .build();
            vBox.getChildren().addAll(numberOfDay, separatorBetweenTimeOfDay, numberOfNight);
            hBox.getChildren().addAll(separatorBetweenDays, vBox);
        }
        return hBox;
    }
    public static void setNumberOfDays(int numberOfDays){
        AvailabilityOfPersonsButtonsHBox.numberOfDays = numberOfDays;
    }

}
