package model.sample.person;

import model.sample.department.DepartmentMethods;

import java.util.Collections;
import java.util.Vector;

public class PersonMethods {

    public static void checkFirstAndLastName(String firstName, String lastName) {
        if (firstName.length() < 3) {
            throw new IllegalArgumentException("FirstNameLengthException");
        }
        if (!firstName.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("FirstNameCharacterException");
        }
        if (lastName.length() < 3) {
            throw new IllegalArgumentException("LastNameLengthException");
        }
        if (!lastName.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("LastNameCharacterException");
        }
    }

    public static void sortPersons(Vector<Person> persons){
        Collections.sort(persons);
    }

    public static Vector<Person> getActualPersons(){
        return DepartmentMethods.getActualDepartment().getPersonsVector();
    }
}
