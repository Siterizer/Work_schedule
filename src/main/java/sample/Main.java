package sample;

import csvdata.CSVReader;
import csvdata.CSVWriter;
import csvdata.DataDirectoryCreator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/MenuScreen.fxml"));
        primaryStage.setTitle("Apka");
        primaryStage.setScene(new Scene(root));
        //chwilowe rozwiazanie
        setScreenDimensions(primaryStage);
        //

        primaryStage.setOnCloseRequest(e -> saveData()); //przy zamykaniu okna

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
        new DataDirectoryCreator("data");
        new CSVReader(".\\data\\pielegniarki", People.funkcja());
    }

    private void saveData(){
        new CSVWriter(".\\data\\pielegniarki", People.funkcja());
    }


    public static void main(String[] args) {
        launch(args);
    }
}
