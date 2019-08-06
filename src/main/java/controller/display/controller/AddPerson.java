package controller.display.controller;

public class AddPerson {

    public static void display(){
        DisplayTemplate template = new DisplayTemplate("/fxml/AddPerson.fxml", "Dodaj opiekuna");
        template.getStage().show();
    }
}
