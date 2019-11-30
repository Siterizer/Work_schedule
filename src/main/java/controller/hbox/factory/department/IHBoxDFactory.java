package controller.hbox.factory.department;

import model.sample.department.Department;

public interface IHBoxDFactory {
    IHBoxD makeFirstHBox(Department department);
    IHBoxD makeHBox(Department department);
}
