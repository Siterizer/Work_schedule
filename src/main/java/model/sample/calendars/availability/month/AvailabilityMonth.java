package model.sample.calendars.availability.month;

import model.sample.calendars.availability.day.AvailabilityDay;

import java.util.ArrayList;

public class AvailabilityMonth implements Cloneable {

    private ArrayList<AvailabilityDay> daysOfTheMonth;

    private int monthNumber;
    private int numberOfDays;
    private int year;

    public AvailabilityMonth(int numberOfDays, int numberOfMonth, int year){
        this.daysOfTheMonth = new ArrayList<AvailabilityDay>();
        this.numberOfDays = numberOfDays;
        this.monthNumber = numberOfMonth;
        this.year = year;
    }
    public void addDay(AvailabilityDay availabilityDay){
        daysOfTheMonth.add(availabilityDay);
    }

    public ArrayList<AvailabilityDay> getDays(){
        return daysOfTheMonth;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public int getYear(){
        return year;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public AvailabilityMonth clone(){
        try{
            AvailabilityMonth temp = (AvailabilityMonth) super.clone();
            temp.daysOfTheMonth = new ArrayList<AvailabilityDay>(numberOfDays);

            for(AvailabilityDay item: daysOfTheMonth){
                temp.daysOfTheMonth.add(item.clone());
            }

            return temp;
        }
        catch(Exception ex){
            return null;
        }
    }
}
