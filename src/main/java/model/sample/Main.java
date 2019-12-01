package model.sample;

import controller.display.controller.SelectDepartment;
import model.csvdata.CSVWriter;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import model.sample.person.PersonMethods;
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
        SelectDepartment.display();
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
        //Wczytuj DOPIERO kiedy będzie wiadome który department został wybrany (a zostaje wybierany w tym miejscu \/
        //department.DepartmentMethods.setActualDepartment
        //new DataDirectoryCreator("data");
        //new CSVReader("./data/pielegniarki", PersonMethods.getActualPersons());
    }

    private void onCloseApp(){
        saveData();
    }

    private void saveData(){
        new CSVWriter("./data/pielegniarki", PersonMethods.getActualVectorPersons());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
