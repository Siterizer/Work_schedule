package model.sample.calendar;

import java.util.ArrayList;

public class MonthTest implements Cloneable {

    private ArrayList<DayTest> daysOfTheMonth;

    private int monthNumber;

    private int numberOfDays;

    public MonthTest(int numberOfDays, int numberOfMonth){
        this.numberOfDays = numberOfDays;
        this.monthNumber = numberOfMonth;
        this.daysOfTheMonth = new ArrayList<DayTest>();
    }
    public void addDay(DayTest day){
        daysOfTheMonth.add(day);
    }

    public ArrayList<DayTest> getDaysOfTheMonth(){
        return daysOfTheMonth;
    }

    public MonthTest clone(){
        try{
            MonthTest temp = (MonthTest) super.clone();
            temp.daysOfTheMonth = new ArrayList<DayTest>(daysOfTheMonth.size());

            for(DayTest item: daysOfTheMonth){
                temp.daysOfTheMonth.add(item.clone());
            }

            return temp;
        }
        catch(Exception ex){
            return null;
        }
    }
}
