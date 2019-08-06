package controller.display.controller;

import controller.controllers.MessageBoxController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.sample.People;

import java.io.IOException;

public class MessageBox {

    public static void display(String message, Stage stageToClose){

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(MessageBox.class.getResource("/fxml/MessageBox.fxml"));
            Parent root1 = fxmlLoader.load();
            MessageBoxController controller = fxmlLoader.getController();
            controller.setMessage(message);

            if (stageToClose !=  null) {
                controller.stageToClose(stageToClose);
            }
            Stage stage = new Stage();
            stage.setTitle("Wiadomosc");
            stage.setScene(new Scene(root1));
            stage.setResizable(false);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
            People.showPeople();
        } catch (IOException e) {
            System.out.println("Nie mozna otworzyc okna 'Wiadomosc'");
        }
    }
}
