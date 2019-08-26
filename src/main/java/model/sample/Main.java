package model.sample;

import model.csvdata.CSVReader;
import model.csvdata.CSVWriter;
import model.csvdata.DataDirectoryCreator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import model.sample.person.Person;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/MenuScreen.fxml"));
        primaryStage.setTitle("Apka");
        primaryStage.setScene(new Scene(root));
        //chwilowe rozwiazanie
        //setScreenDimensions(primaryStage);
        primaryStage.setOnCloseRequest(e -> onCloseApp()); //przy zamykaniu okna
        initialize();
        primaryStage.setMaximized(true);
        primaryStage.show();
    }

    private void setScreenDimensions(Stage stage) {
        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();
        stage.setX(bounds.getMinX());
        stage.setY(bounds.getMinY());
        stage.setWidth(bounds.getWidth());
        stage.setHeight(bounds.getHeight());
    }

    private void initialize() throws IOException {
        new DataDirectoryCreator("calendar");
        new CSVReader("./calendar/pielegniarki", Person.funkcja());
    }

    private void onCloseApp(){
        saveData();
    }

    private void saveData(){
        new CSVWriter("./calendar/pielegniarki", Person.funkcja());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
