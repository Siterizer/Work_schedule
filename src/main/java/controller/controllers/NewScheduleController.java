package controller.controllers;

import controller.display.controller.AvailabilityOfPersons;
import controller.display.controller.MessageBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import model.sample.calendars.ConvertMonth;
import model.sample.person.Person;
import model.sample.calendars.availability.month.AvailabilityMonth;
import model.sample.calendars.availability.month.AvailabilityMonthCopier;
import model.sample.person.PersonMethods;
import model.xmldata.XMLReader;

import java.util.Enumeration;


public class NewScheduleController {

    @FXML
    private TextField year;

    @FXML
    private ChoiceBox<String> monthChoiceBox;

    @FXML
    public void initialize() {
        monthChoiceBox.getItems().addAll(
                "Styczeń", "Luty", "Marzec",
                "Kwiecień", "Maj", "Czerwiec",
                "Lipiec", "Sierpień", "Wrzesień",
                "Październik", "Listopad", "Grudzień");
        monthChoiceBox.setValue("Styczeń");
    }

    @FXML
    void handleCreate(ActionEvent buttonClicked) {
        createSchedule();
    }

    @FXML
    void handleEnterTextField(KeyEvent buttonEntered) {
        if (buttonEntered.getCode() == KeyCode.ENTER) {
            createSchedule();
        }
    }

    private void createSchedule() {
        //year.getText(); monthChoiceBox.getValue()
        //sprawdz czy istnieje
        //sprawdza poprawnosc roku/miesiaca
        //if plik istnieje
        //T: wczytuje go
        //N:tworzy go, wczytuje go
        //pobiera odpowiedni miesiac
        //XMLReader wczytuje odpowiednie dane do zmiennej typu month
        try {
            checkYear(year.getText());
            if (!XMLReader.checkIfFileExist("./XMLyears/" + year.getText())) {
                createFile();
            }
            if (checkIfCreateNewMonth(PersonMethods.getActualPersons().get(0).getAvailabilityMonth())) {
                AvailabilityMonth availabilityMonth = new XMLReader(monthChoiceBox.getValue(), year.getText()).getMonth();
                AvailabilityMonthCopier availabilityMonthCopier = new AvailabilityMonthCopier(availabilityMonth);
                Enumeration vectorEnumeration = PersonMethods.getActualPersons().elements();
                while (vectorEnumeration.hasMoreElements()) {
                    AvailabilityMonth copiedAvailabilityMonth = availabilityMonthCopier.copyAvailabilityMonth();
                    Person person = (Person) vectorEnumeration.nextElement();
                    person.setAvailabilityMonth(copiedAvailabilityMonth);
                    person.setWorkingMonth(ConvertMonth.availabilityToWorking(copiedAvailabilityMonth));

                }
            }
            MessageBox.display("Grafik stworzony prawidłowo", (Stage) this.year.getScene().getWindow());
            AvailabilityOfPersons.display();
        } catch (Exception e) {
            e.printStackTrace();
            MessageBox.display(e.getMessage(), null);
        }
    }

    public static void checkYear(String year) throws Exception {
        if (Integer.parseInt(year) < 1900) {
            throw new Exception("Zły rok (rok > 1900)");
        }
    }

    private void createFile() throws Exception {
        Process XMLYearCreator = Runtime.getRuntime().exec("java -jar ./XMLYearCreator-1.0-SNAPSHOT.jar " + year.getText());
        XMLYearCreator.waitFor();
        checkFeedback(XMLYearCreator.exitValue());
    }

    private void checkFeedback(int feedback) throws Exception {
        if (feedback == 1)
            throw new Exception("Problem z utworzeniem pliku XML");
    }

    private boolean checkIfCreateNewMonth(AvailabilityMonth month){
        if(month == null){
            return true;
        }
        if (month.getYear() != Integer.parseInt(year.getText())){
            return true;
        }
        if(month.getMonthNumber() != getMonthNumber()){
            return true;
        }
        Enumeration vectorEnumeration = PersonMethods.getActualPersons().elements();
        while(vectorEnumeration.hasMoreElements()){
            Person personFromVector = (Person) vectorEnumeration.nextElement();
            if(personFromVector.getAvailabilityMonth() == null){
                return true;
            }
        }
        return false;
    }

    private int getMonthNumber() {
        switch (monthChoiceBox.getValue()) {
            case "Styczeń":
                return 1;
            case "Luty":
                return 2;
            case "Marzec":
                return 3;
            case "Kwiecień":
                return 4;
            case "Maj":
                return 5;
            case "Czerwiec":
                return 6;
            case "Lipiec":
                return 7;
            case "Sierpień":
                return 8;
            case "Wrzesień":
                return 9;
            case "Październik":
                return 10;
            case "Listopad":
                return 11;
            case "Grudzień":
                return 12;
        }
        return 0;
    }
}
