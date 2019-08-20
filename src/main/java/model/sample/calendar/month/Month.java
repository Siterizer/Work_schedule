package model.sample.calendar.month;

import model.sample.calendar.day.Day;

import java.util.ArrayList;

public class Month implements Cloneable {

    private ArrayList<Day> daysOfTheMonth;

    private int monthNumber;

    private int numberOfDays;

    public Month(int numberOfDays, int numberOfMonth){
        this.numberOfDays = numberOfDays;
        this.monthNumber = numberOfMonth;
        this.daysOfTheMonth = new ArrayList<Day>();
    }
    public void addDay(Day day){
        daysOfTheMonth.add(day);
    }

    public ArrayList<Day> getDaysOfTheMonth(){
        return daysOfTheMonth;
    }

    public Month clone(){
        try{
            Month temp = (Month) super.clone();
            temp.daysOfTheMonth = new ArrayList<Day>(daysOfTheMonth.size());

            for(Day item: daysOfTheMonth){
                temp.daysOfTheMonth.add(item.clone());
            }

            return temp;
        }
        catch(Exception ex){
            return null;
        }
    }
}
