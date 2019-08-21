package model.sample.calendar.day;

import model.sample.calendar.day.components.DayTime;
import model.sample.calendar.day.components.NightTime;

public class Day implements Cloneable {
    private DayTime dayTime;
    private NightTime nightTime;
    private TypeOfDay dayType;
    private int numberOfDay;

    public Day(int numberOfDay, TypeOfDay dayType){
        this.numberOfDay = numberOfDay;
        this.dayType = dayType;
        this.dayTime = new DayTime();
        this.nightTime = new NightTime();
    }

    public TypeOfDay getDayType(){
        return this.dayType;
    }

    public void setDayType(TypeOfDay value){
        this.dayType = value;
    }

    public int getNumberOfDay(){
        return numberOfDay;
    }

    public DayTime getDayTime() {
        return dayTime;
    }

    public NightTime getNightTime() {
        return nightTime;
    }

    public Day clone(){
        try{
            Day temp = (Day) super.clone();
            temp.dayTime = dayTime.clone();
            temp.nightTime = nightTime.clone();
            return temp;
        }
        catch (Exception ex){
            return null;
        }
    }
}
