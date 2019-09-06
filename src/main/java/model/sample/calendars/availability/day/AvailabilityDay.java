package model.sample.calendars.availability.day;

import model.sample.calendars.TypeOfDay;
import model.sample.calendars.availability.day.period.AvailabilityPeriodDay;

public class AvailabilityDay implements Cloneable {
    private AvailabilityPeriodDay availabilityDayTime;
    private AvailabilityPeriodDay availabilityNightTime;
    private TypeOfDay dayType;
    private int dayNumber;

    public AvailabilityDay(int dayNumber, TypeOfDay dayType){
        this.dayNumber = dayNumber;
        this.dayType = dayType;
        this.availabilityDayTime = new AvailabilityPeriodDay();
        this.availabilityNightTime = new AvailabilityPeriodDay();
    }

    public TypeOfDay getDayType(){
        return this.dayType;
    }

    public int getDayNumber(){
        return dayNumber;
    }

    public AvailabilityPeriodDay getDayTime() {
        return availabilityDayTime;
    }

    public AvailabilityPeriodDay getNightTime() {
        return availabilityNightTime;
    }

    public AvailabilityDay clone(){
        try{
            AvailabilityDay temp = (AvailabilityDay) super.clone();
            temp.availabilityDayTime = temp.availabilityDayTime.clone();
            temp.availabilityNightTime = temp.availabilityNightTime.clone();
            return temp;
        }
        catch (Exception ex){
            return null;
        }
    }
}
