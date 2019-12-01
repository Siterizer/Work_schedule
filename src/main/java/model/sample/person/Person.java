package model.sample.person;

import model.sample.calendars.availability.month.AvailabilityMonth;
import model.sample.calendars.working.month.WorkingMonth;

public class Person implements Comparable<Person>{

    private String name;
    private String surname;
    private AvailabilityMonth availabilityMonth;
    private WorkingMonth workingMonth;
    private ContractType contractType;

    public Person(String name, String surname, ContractType contractType) {
        this.name = name;
        this.surname = surname;
        this.availabilityMonth = null;
        this.workingMonth = null;
        this.contractType = contractType;
    }

    public AvailabilityMonth getAvailabilityMonth() {
        return availabilityMonth;
    }

    public void setAvailabilityMonth(AvailabilityMonth availabilityMonth) {
        this.availabilityMonth = availabilityMonth;
    }

    public WorkingMonth getWorkingMonth() {
        return workingMonth;
    }

    public void setWorkingMonth(WorkingMonth workingMonth) {
        this.workingMonth = workingMonth;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return this.getSurname() + " " + this.getName();
    }

    @Override
    public int compareTo(Person o) {
        String namePerson1 = this.getSurname() + this.getName();
        String namePerson2 = o.getSurname() + o.getName();

        return namePerson1.compareTo(namePerson2);
    }
}

