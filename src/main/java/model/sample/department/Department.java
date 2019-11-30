package model.sample.department;

import model.sample.person.Person;

import java.util.Collections;
import java.util.Vector;

public class Department implements Comparable<Department> {

    private String name;
    private int nursesNumber;
    private int keepersNumber;
    private static Vector<Department> departments = new Vector<Department>();
    private Vector<Person> persons = new Vector<Person>();

    public Department(String name, int nursesNumber, int keepersNumber){
        this.name = name;
        this.nursesNumber = nursesNumber;
        this.keepersNumber = keepersNumber;
        departments.add(this);
        DepartmentMethods.sortDepartments(departments);
    }

    public String getName() {
        return name;
    }

    public int getNursesNumber() {
        return nursesNumber;
    }

    public int getKeepersNumber() {
        return keepersNumber;
    }

    public static Vector<Department> getDepartments() {
        return departments;
    }

    public Vector<Person> getPersonsVector() {
        return persons;
    }

    @Override
    public int compareTo(Department o) {
        return this.name.compareTo(o.name);
    }
}
