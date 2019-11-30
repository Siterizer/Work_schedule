package model.sample.department;

import model.sample.person.Person;
import model.sample.person.PersonMethods;

import java.util.Collections;
import java.util.Vector;

public class DepartmentMethods {
    private static Department actualDepartment;
    public static void checkName(String name){
        if (name.length() < 1) {
            throw new IllegalArgumentException("FirstNameLengthException");
        }
        if (!name.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("FirstNameCharacterException");
        }
    }

    public static void checkValues(int nurses, int keepers){
        if(nurses < 1){
            throw new IllegalArgumentException("NursesNumberLengthException");
        }
        if(keepers < 1){
            throw new IllegalArgumentException("KeepersNumberLengthException");
        }
    }

    public static void sortDepartments(Vector<Department> departments){
        Collections.sort(departments);
    }

    public static void addPersonToActualDepartment(Person person){
        actualDepartment.getPersonsVector().add(person);
        PersonMethods.sortPersons(actualDepartment.getPersonsVector());
    }

    public static Department getActualDepartment(){
        return actualDepartment;
    }

    public static void setActualDepartment(Department newDepartment){
        actualDepartment = newDepartment;
        //Tutaj wczytujemy oddział
    }
}
