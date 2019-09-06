package model.sample.calendars.working.month;

import model.sample.calendars.working.day.WorkingDay;

import java.util.ArrayList;

public class WorkingMonth implements Cloneable {
    private ArrayList<WorkingDay> daysOfTheMonth;
    private int numberOfDays;
    private int monthNumber;
    private int year;

    public WorkingMonth(int numberOfDays, int monthNumber, int year){
        this.daysOfTheMonth = new ArrayList<WorkingDay>();
        this.numberOfDays = numberOfDays;
        this.monthNumber = monthNumber;
        this.year = year;
    }

    public void addDay(WorkingDay day){
        this.daysOfTheMonth.add(day);
    }

    public ArrayList<WorkingDay> getDaysOfTheMonth(){
        return this.daysOfTheMonth;
    }


    public int getNumberOfDays() {
        return numberOfDays;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public int getYear() {
        return year;
    }

    public WorkingMonth clone(){
        try{
            WorkingMonth temp = (WorkingMonth) super.clone();
            temp.daysOfTheMonth = new ArrayList<WorkingDay>(numberOfDays);

            for(WorkingDay item: daysOfTheMonth){
                temp.daysOfTheMonth.add(item.clone());
            }
            return temp;
        }
        catch(Exception ex){
            return null;
        }
    }
}
