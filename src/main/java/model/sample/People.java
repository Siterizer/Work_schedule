package model.sample;

import model.sample.calendar.month.Month;

import java.util.Collections;
import java.util.Vector;

public class People implements Comparable<People>{

    private String imie;
    private String nazwisko;
    private Month month;
    private static Vector<People> ludzie = new Vector<People>();

    public People(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        ludzie.add(this);
        this.sortPeople();
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }



    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public static Vector<People> funkcja() {
        return ludzie;
    } // zwracac klona wektora glownego

    public static void sortPeople(){
        Collections.sort(ludzie);
    }

    public static void showPeople() {
        for (People people :
                ludzie
        ) {
            System.out.println(people.getImie() + " " + people.getNazwisko());
        }
    }

    @Override
    public String toString() {
        return this.getNazwisko() + " " + this.getImie();
    }

    @Override
    public int compareTo(People o) {
        String namePerson1 = this.getNazwisko() + this.getImie();
        String namePerson2 = o.getNazwisko() + o.getImie();

        return namePerson1.compareTo(namePerson2);
    }
}

