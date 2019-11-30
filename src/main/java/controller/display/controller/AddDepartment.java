package controller.display.controller;

public class AddDepartment {
    public static void display(){
        DisplayTemplate template = new DisplayTemplate("/fxml/AddDepartment.fxml", "Dodaj oddział");
        template.getStage().show();
    }
}
