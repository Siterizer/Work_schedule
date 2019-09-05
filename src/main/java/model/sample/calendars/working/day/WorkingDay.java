package model.sample.calendars.working.day;

import model.sample.calendars.TypeOfDay;
import model.sample.calendars.working.day.period.WorkingPeriodDay;

public class WorkingDay {
    private WorkingPeriodDay workingDayTime;
    private WorkingPeriodDay workingNightTime;
    private TypeOfDay dayType;
    private int numberOfDay;

    public WorkingDay(int numberOfDay, TypeOfDay dayType){
        this.workingDayTime = new WorkingPeriodDay();
        this.workingNightTime = new WorkingPeriodDay();
        this.dayType = dayType;
        this.numberOfDay = numberOfDay;
    }

    public TypeOfDay getDayType(){
        return this.dayType;
    }

    public int getNumberOfDay(){
        return this.numberOfDay;
    }

    public WorkingPeriodDay getWorkingDayTime(){
        return this.workingDayTime;
    }

    public WorkingPeriodDay getWorkingNightTime(){
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
