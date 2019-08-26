package model.sample.person;

import model.sample.availability.data.month.Month;

import java.util.Collections;
import java.util.Vector;

public class Person implements Comparable<Person>{

    private String imie;
    private String nazwisko;
    private Month month;
    private ContractType contractType;
    private static Vector<Person> ludzie = new Vector<Person>();

    public Person(String imie, String nazwisko, String contractType) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.contractType = ContractMethods.getContract(contractType);
        ludzie.add(this);
        this.sortPeople();
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public static Vector<Person> funkcja() {
        return ludzie;
    } // zwracac klona wektora glownego

    public static void sortPeople(){
        Collections.sort(ludzie);
    }

    public static void showPeople() {
        for (Person person :
                ludzie
        ) {
            System.out.println(person.getImie() + " " + person.getNazwisko());
        }
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

