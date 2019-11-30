package controller.hbox.factory.department.SelectDepartment;

import controller.hbox.factory.department.IHBoxD;
import controller.hbox.factory.department.IHBoxDFactory;
import model.sample.department.Department;

public class SelectDepartmentHBoxFactory implements IHBoxDFactory {
    @Override
    public IHBoxD makeFirstHBox(Department department) {
        return null;
    }

    @Override
    public IHBoxD makeHBox(Department department) {
        return new SelectDepartmentHBox(department);
    }
}
