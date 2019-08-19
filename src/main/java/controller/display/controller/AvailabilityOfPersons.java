package controller.display.controller;

import controller.controllers.AvailabilityOfPersonsController;

public class AvailabilityOfPersons {

    public static void display() {
        DisplayTemplate template = new DisplayTemplate("/fxml/AvailabilityOfPersons.fxml", "Zmien dyspozycyjnosc");
        AvailabilityOfPersonsController controller = template.getLoader().getController();
        template.getStage().setResizable(true);
        template.getStage().setMaximized(true);

        template.getStage().show();
    }
}
