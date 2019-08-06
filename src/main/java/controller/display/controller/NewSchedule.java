package controller.display.controller;

public class NewSchedule {

    public static void display(){
        DisplayTemplate template = new DisplayTemplate("/fxml/NewSchedule.fxml", "Nowy Grafik");
        template.getStage().show();
    }
}
