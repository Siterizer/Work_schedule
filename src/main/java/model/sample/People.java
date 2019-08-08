package model.sample;

import java.util.Vector;

public class People {

    private String imie;
    private String nazwisko;
    private static Vector<People> ludzie = new Vector<People>();

    public People(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        ludzie.add(this);
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

    public static void showPeople() {
        for (People people :
                ludzie
        ) {
            System.out.println(people.getImie() + " " + people.getNazwisko());
        }
    }

    @Override
    public String toString() {
        return this.getImie() + " " + this.getNazwisko();
    }
}

