package model.sample.calendars.working.day;

import model.sample.calendars.TypeOfDay;
import model.sample.calendars.working.day.period.WorkingPeriodDay;

public class WorkingDay {
    private WorkingPeriodDay workingDayTime;
    private WorkingPeriodDay workingNightTime;
    private TypeOfDay dayType;
    private int dayNumber;

    public WorkingDay(int dayNumber, TypeOfDay dayType){
        this.workingDayTime = new WorkingPeriodDay();
        this.workingNightTime = new WorkingPeriodDay();
        this.dayType = dayType;
        this.dayNumber = dayNumber;
    }

    public TypeOfDay getDayType(){
        return this.dayType;
    }

    public int getDayNumber(){
        return this.dayNumber;
    }

    public WorkingPeriodDay getDayTime(){
        return this.workingDayTime;
    }

    public WorkingPeriodDay getNightTime(){
        return this.workingNightTime;
    }

    public WorkingDay clone(){
        try{
            WorkingDay temp = (WorkingDay) super.clone();
            temp.workingDayTime.clone();
            temp.workingDayTime.clone();
            return temp;
        }
        catch(Exception ex){
            return null;
        }
    }
}
