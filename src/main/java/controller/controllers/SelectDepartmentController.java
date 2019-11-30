package controller.controllers;

import controller.display.controller.AddDepartment;
import controller.hbox.factory.department.IHBoxD;
import controller.hbox.factory.department.IHBoxDFactory;
import controller.hbox.factory.department.SelectDepartment.SelectDepartmentHBoxFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.sample.department.Department;

import java.util.Enumeration;

public class SelectDepartmentController {

    @FXML
    private VBox vBox;

    @FXML
    public static SelectDepartmentController controller;

    @FXML
    public void initialize(){
        controller = this;
        IHBoxDFactory hBoxFactory = new SelectDepartmentHBoxFactory();
        Enumeration vectorEnumeration = Department.getDepartments().elements();
        while(vectorEnumeration.hasMoreElements()){
            Department departmentFromVector =(Department) vectorEnumeration.nextElement();
            IHBoxD generatedHBox = hBoxFactory.makeHBox(departmentFromVector);
            vBox.getChildren().add(generatedHBox.getHBox());
        }
    }

    @FXML
    public void closeWindow(){
        Stage stage = (Stage) vBox.getScene().getWindow();
        stage.close();
    }

    @FXML
    void addNewAction(ActionEvent event) {
        AddDepartment.display();
    }

    public void updateVBox(){
        vBox.getChildren().clear();
        initialize();
    }
}
