package controller.display.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class AddPerson {

    public static void dipsplay(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(AddPerson.class.getResource("/fxml/AddPerson.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Dodaj opiekuna");
            stage.setScene(new Scene(root1));
            stage.setResizable(false);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
        } catch (IOException e) {
            System.out.println("Nie mozna otworzyc okna 'Dodaj opiekuna'");
        }
    }
}
