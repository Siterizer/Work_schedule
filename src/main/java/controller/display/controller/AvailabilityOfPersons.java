package controller.display.controller;

import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class AvailabilityOfPersons {

    public static void display(){
        DisplayTemplate template = new DisplayTemplate("/fxml/AvailabilityOfPersons.fxml", "Zmien dyspozycyjnosc");

        template.getStage().setResizable(true);
        template.getStage().setMaximized(true);

        template.getStage().show();
    }
}
