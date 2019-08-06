package controller.display.controller;

import controller.controllers.ConfirmBoxController;

public class ConfirmBox{

    public static boolean displayAndReturnAnswer(String message){
        DisplayTemplate template = new DisplayTemplate("/fxml/ConfirmBox.fxml", "");
        ConfirmBoxController controller = template.getLoader().getController();
        controller.setMessage(message);
        template.getStage().showAndWait();
        return ConfirmBoxController.answer;
    }
}





