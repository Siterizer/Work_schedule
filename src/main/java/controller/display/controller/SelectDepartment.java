package controller.display.controller;

import javafx.event.EventHandler;
import javafx.stage.WindowEvent;

public class SelectDepartment {

    public static void display(){
        DisplayTemplate template = new DisplayTemplate("/fxml/SelectDepartment.fxml", "Wybierz oddział");
        template.getStage().setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                event.consume();
            }
        });
        template.getStage().show();
    }

}
