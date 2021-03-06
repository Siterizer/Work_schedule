package model.sample.person;

import model.sample.department.DepartmentMethods;
import java.util.Collections;
import java.util.Vector;

public class PersonMethods {

    public static void checkNameAndSurname(String name, String surname) {
        if (name.length() < 3) {
            throw new IllegalArgumentException("FirstNameLengthException");
        }
        if (!name.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("FirstNameCharacterException");
        }
        if (surname.length() < 3) {
            throw new IllegalArgumentException("LastNameLengthException");
        }
        if (!surname.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("LastNameCharacterException");
        }
    }

    public static void sortPersons(Vector<Person> persons){
        Collections.sort(persons);
    }

    public static Vector<Person> getActualVectorPersons(){
        return DepartmentMethods.getActualDepartment().getPersonsVector();
    }
}
