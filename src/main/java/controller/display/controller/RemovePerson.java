package controller.display.controller;

public class RemovePerson {

    public static void display(){
        DisplayTemplate template = new DisplayTemplate("/fxml/RemovePerson.fxml", "Usun opiekuna");
        template.getStage().show();
    }
}
