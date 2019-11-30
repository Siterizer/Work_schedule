package model.sample.person;

import model.sample.calendars.availability.month.AvailabilityMonth;
import model.sample.calendars.working.month.WorkingMonth;

public class Person implements Comparable<Person>{

    private String imie;
    private String nazwisko;
    private AvailabilityMonth availabilityMonth;
    private WorkingMonth workingMonth;
    private ContractType contractType;

    public Person(String imie, String nazwisko, ContractType contractType) {
        this.imie = imie;
        this.nazwisko = nazwisko;
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

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public String toString() {
        return this.getNazwisko() + " " + this.getImie();
    }

    @Override
    public int compareTo(Person o) {
        String namePerson1 = this.getNazwisko() + this.getImie();
        String namePerson2 = o.getNazwisko() + o.getImie();

        return namePerson1.compareTo(namePerson2);
    }
}

