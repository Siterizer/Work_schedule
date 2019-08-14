package controller.hbox.factory.RemovePerson;

import controller.controllers.RemovePersonController;
import controller.display.controller.ConfirmBox;
import controller.hbox.factory.IHBox;
import controller.hbox.factory.components.ButtonCreator;
import controller.hbox.factory.components.HBoxCreator;
import controller.hbox.factory.components.LabelCreator;
import controller.hbox.factory.components.SeparatorCreator;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.HBox;
import model.sample.People;

public class RemovePersonHBox implements IHBox {

    private People people;

    RemovePersonHBox(People people){
        this.people = people;
    }

    public HBox getHBox() {

        HBox hBox = new HBoxCreator.Builder()
                .setPrefHeight(30.0)
                .setPrefWidth(260.0)
                .build();

        Label nameOfPerson = new LabelCreator.Builder()
                .setPrefWidth(180.0)
                .setText(people.toString())
                .build();

        Separator separator = new SeparatorCreator.Builder()
                .setPrefWidth(20.0)
                .setVisible(false)
                .build();

        Button deletePerson = new ButtonCreator.Builder()
                .setText("Usun")
                .setOnAction(e -> {
                    if(ConfirmBox.displayAndReturnAnswer("Czy na pewno chcesz usunac osobe:\n"
                            + people.getImie() + " " + people.getNazwisko())) {
                        People.funkcja().remove(people);
                        RemovePersonController controller = RemovePersonController.controller;
                        controller.updateVBox();
                    }
                })
                .build();

        hBox.getChildren().addAll(nameOfPerson, separator, deletePerson);
        return hBox;
    }
}
