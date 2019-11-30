package controller.hbox.factory.department.SelectDepartment;

import controller.controllers.SelectDepartmentController;
import controller.display.controller.ConfirmBox;
import controller.hbox.factory.components.ButtonCreator;
import controller.hbox.factory.components.HBoxCreator;
import controller.hbox.factory.components.LabelCreator;
import controller.hbox.factory.components.SeparatorCreator;
import controller.hbox.factory.department.IHBoxD;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.HBox;
import model.sample.department.Department;
import model.sample.department.DepartmentMethods;

public class SelectDepartmentHBox implements IHBoxD {

    private Department department;

    SelectDepartmentHBox(Department department){
        this.department = department;
    }

    @Override
    public HBox getHBox() {
        HBox hBox = new HBoxCreator.Builder()
                .setPrefHeight(30.0)
                .setPrefWidth(300.0)
                .build();

        Label nameOfPerson = new LabelCreator.Builder()
                .setPrefWidth(100.0)
                .setText(department.getName())
                .build();

        Separator afterNameSeparator = new SeparatorCreator.Builder()
                .setPrefWidth(20.0)
                .setVisible(false)
                .build();

        Button chooseDepartment = new ButtonCreator.Builder()
                .setText("Wybierz")
                .setOnAction(e -> {
                    DepartmentMethods.setActualDepartment(this.department);
                    SelectDepartmentController.controller.closeWindow();
                })
                .build();

        Separator betweenButtonsSeparator = new SeparatorCreator.Builder()
                .setPrefWidth(20.0)
                .setVisible(false)
                .build();

        Button deleteDepartment = new ButtonCreator.Builder()
                .setText("Usun")
                .setOnAction(e -> {
                    if(ConfirmBox.displayAndReturnAnswer("Czy na pewno chcesz usunac oddzial:\n"
                            + department.getName())) {
                        Department.getDepartments().remove(department);
                        SelectDepartmentController.controller.updateVBox();
                    }
                })
                .build();

        hBox.getChildren().addAll(nameOfPerson, afterNameSeparator, chooseDepartment, betweenButtonsSeparator, deleteDepartment);
        return hBox;
    }
}
