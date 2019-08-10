package model.sample;

import java.util.List;
import java.util.Vector;

public class Month {
    private int noDays;
    private int noMonth;
    private Vector<Day> daysVector;

    public Month(int noDays, int noMonth) {
        this.noDays = noDays;
        this.noMonth = noMonth;
        daysVector = new Vector<Day>();
    }

    public void addToVector(Day newDay) {
        try {
            if (daysVector.size() > this.noDays)
                throw new Exception("wielkosc wektora > ilosc dni w miesiacu");
            daysVector.add(newDay);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
