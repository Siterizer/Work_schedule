package controller.display.controller;

public class NameToRefactor {
    public static void display(){
        DisplayTemplate template = new DisplayTemplate("/fxml/NameToRefactor.fxml", "Wygenerowany grafik");
        template.getStage().setResizable(true);
        template.getStage().setMaximized(true);
        template.getStage().show();
    }
}
