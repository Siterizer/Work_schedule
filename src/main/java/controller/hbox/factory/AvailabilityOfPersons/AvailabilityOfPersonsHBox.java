package controller.hbox.factory.AvailabilityOfPersons;

import controller.hbox.factory.IHBox;
import controller.hbox.factory.components.ButtonCreator;
import controller.hbox.factory.components.HBoxCreator;
import controller.hbox.factory.components.LabelCreator;
import controller.hbox.factory.components.SeparatorCreator;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import model.sample.People;

public class AvailabilityOfPersonsHBox implements IHBox {

    private People people;

    private int numberOfDays = 31;

    AvailabilityOfPersonsHBox(People people){
        this.people = people;
    }

    AvailabilityOfPersonsHBox(){
        this.people = null;
    }

    @Override
    public HBox getHBox() {

        HBox hBox = new HBoxCreator.Builder()
                .setPrefHeight(40)
                .setPrefWidth(Region.USE_COMPUTED_SIZE)
                .build();
        if(this.people == null){
            // First row //
            Separator separatorInsteadName = new SeparatorCreator.Builder()
                    .setPrefWidth(190.0)
                    .setVisible(false)
                    .build();
            hBox.getChildren().add(separatorInsteadName);
            for(int i = 1; i<=numberOfDays; i++){
                Separator separatorBetweenDays = new SeparatorCreator.Builder()
                        .setPrefWidth(8.0)
                        .setVisible(false)
                        .build();
                Label numberOfDay = new LabelCreator.Builder()
                        .setText(String.valueOf(i) + "D")
                        .setPrefWidth(45)
                        .build();
                Separator separatorInsideDays = new SeparatorCreator.Builder()
                        .setPrefWidth(3.0)
                        .setVisible(false)
                        .build();
                Label numberOfNight = new LabelCreator.Builder()
                        .setText(String.valueOf(i) + "N")
                        .setPrefWidth(45)
                        .build();
                hBox.getChildren().addAll(separatorBetweenDays, numberOfDay, separatorInsideDays, numberOfNight);
            }
        }
        else{
            Label nameOfPerson = new LabelCreator.Builder()
                    .setPrefWidth(180.0)
                    .setText(people.toString())
                    .build();
            hBox.getChildren().addAll(nameOfPerson);
            for(int i = 1; i<=numberOfDays; i++) {
                Separator separatorBetweenDays = new SeparatorCreator.Builder()
                        .setPrefWidth(8.0)
                        .setVisible(false)
                        .build();
                Button numberOfDay = new ButtonCreator.Builder()
                        .setText(String.valueOf(i) + "D")
                        .setPrefWidth(45)
                        .build();
                Separator separatorInsideDays = new SeparatorCreator.Builder()
                        .setPrefWidth(3.0)
                        .setVisible(false)
                        .build();
                Button numberOfNight = new ButtonCreator.Builder()
                        .setText(String.valueOf(i) + "N")
                        .setPrefWidth(45)
                        .build();

                hBox.getChildren().addAll(separatorBetweenDays, numberOfDay, separatorInsideDays, numberOfNight);
            }
        }
        return hBox;
    }
}
