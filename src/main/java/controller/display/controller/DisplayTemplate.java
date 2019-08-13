package controller.display.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

class DisplayTemplate {

    private FXMLLoader fxmlLoader;
    private Stage stage;

    DisplayTemplate(String path, String title){
        try {
            fxmlLoader = new FXMLLoader(AddPerson.class.getResource(path));//like "/fxml/AddPerson.fxml"
            Parent root1 = fxmlLoader.load();
            stage = new Stage();
            stage.setTitle(title);
            stage.setScene(new Scene(root1));
            stage.setResizable(false);
            stage.initModality(Modality.APPLICATION_MODAL);
        } catch (IOException e) {
            System.out.println("Nie mozna otworzyc okna '" + path + "'");
        }
    }
    FXMLLoader getLoader(){
        return fxmlLoader;
    }

    Stage getStage(){
        return stage;
    }
}
