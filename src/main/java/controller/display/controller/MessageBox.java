package controller.display.controller;

import controller.controllers.MessageBoxController;
import javafx.stage.Stage;

public class MessageBox {

    public static void display(String message, Stage stageToClose){
        DisplayTemplate template = new DisplayTemplate("/fxml/MessageBox.fxml", "Wiadomosc");
        MessageBoxController controller = template.getLoader().getController();
        controller.setMessage(message);
        if (stageToClose !=  null) {
            controller.stageToClose(stageToClose);
        }
        template.getStage().show();
    }
}
