package controller.display.controller;

public class AvailabilityOfPersons {

    public static void display(){
        DisplayTemplate template = new DisplayTemplate("/fxml/AvailabilityOfPersons.fxml", "Zmien dyspozycyjnosc");
        template.getStage().show();
    }
}
