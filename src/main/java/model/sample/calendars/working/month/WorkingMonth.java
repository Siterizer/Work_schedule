package model.sample.calendars.working.month;

import model.sample.calendars.working.day.WorkingDay;

import java.util.ArrayList;

public class WorkingMonth implements Cloneable {
    private ArrayList<WorkingDay> daysOfTheMonth;
    private int numberOfDays;
    private int numberOfMonth;
    private int year;

    public WorkingMonth(int numberOfDays, int numberOfMonth, int year){
        this.daysOfTheMonth = new ArrayList<WorkingDay>();
        this.numberOfDays = numberOfDays;
        this.numberOfMonth = numberOfMonth;
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

    public int getNumberOfMonth() {
        return numberOfMonth;
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
