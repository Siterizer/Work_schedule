package controller.hbox.factory.person.NameToRefactor.days;

import controller.hbox.factory.person.AvailabilityOfPersons.EvenColours;
import controller.hbox.factory.person.IHBoxP;
import controller.hbox.factory.components.HBoxCreator;
import controller.hbox.factory.components.LabelCreator;
import controller.hbox.factory.components.SeparatorCreator;
import controller.hbox.factory.components.VBoxCreator;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import model.sample.calendars.TypeOfDay;
import model.sample.person.Person;

public class NameToRefactorDaysFirstHBoxP implements IHBoxP {

    private int numberOfDays;

    private Person person;

    NameToRefactorDaysFirstHBoxP(Person person){
        this.person = person;
        this.numberOfDays = person.getAvailabilityMonth().getNumberOfDays();
    }

    @Override
    public HBox getHBox() {
        HBox hBox = new HBoxCreator.Builder()
                .setPrefHeight(25)
                .setPrefWidth(50)
                .setPrefWidth(Region.USE_COMPUTED_SIZE)
                .build();
        for (int i = 1; i <= numberOfDays; i++) {
            Separator separatorBetweenDays = new SeparatorCreator.Builder()
                    .setPrefWidth(10.0)
                    .setVisible(true)
                    .build();

            VBox vBox = new VBoxCreator.Builder()
                    .setPrefHeight(25)
                    .setPrefWidth(32)
                    .build();
            Label numberOfDay = new LabelCreator.Builder()
                    .setText(String.valueOf(i))
                    .setPrefWidth(22)
                    .build();
            numberOfDay.setTextAlignment(TextAlignment.CENTER);
            vBox.getChildren().addAll(numberOfDay);

            if(person.getWorkingMonth().getDays().get(i-1).getDayType() == TypeOfDay.HOLIDAY){
                vBox.setStyle("-fx-background-color: #809fff;");
            }
            hBox.getChildren().addAll(separatorBetweenDays, vBox);
        }
        hBox.setStyle(EvenColours.getColour(true));
        return hBox;
    }
}
