package controller.display.controller;

import controller.controllers.ConfirmBoxController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class ConfirmBox {

    public static boolean displayAndReturnAnswer(String message){

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(ConfirmBox.class.getResource("/fxml/ConfirmBox.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            ConfirmBoxController controller = fxmlLoader.getController();
            controller.setMessage(message);
            stage.setResizable(false);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setOnCloseRequest(e -> controller.onCloseWindowFasle());
            stage.showAndWait();
        } catch (IOException e) {
            System.out.println("Nie mozna otworzyc okna 'Confirm Box'");
        }
        return ConfirmBoxController.answer;
    }
}
