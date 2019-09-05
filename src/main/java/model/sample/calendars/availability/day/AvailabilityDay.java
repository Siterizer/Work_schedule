package model.sample.calendars.availability.day;

import model.sample.calendars.TypeOfDay;
import model.sample.calendars.availability.day.period.AvailabilityPeriodDay;

public class AvailabilityDay implements Cloneable {
    private AvailabilityPeriodDay availabilityDayTime;
    private AvailabilityPeriodDay availabilityNightTime;
    private TypeOfDay dayType;
    private int numberOfDay;

    public AvailabilityDay(int numberOfDay, TypeOfDay dayType){
        this.numberOfDay = numberOfDay;
        this.dayType = dayType;
        this.availabilityDayTime = new AvailabilityPeriodDay();
        this.availabilityNightTime = new AvailabilityPeriodDay();
    }

    public TypeOfDay getDayType(){
        return this.dayType;
    }

    public int getNumberOfDay(){
        return numberOfDay;
    }

    public AvailabilityPeriodDay getAvailabilityDayTime() {
        return availabilityDayTime;
    }

    public AvailabilityPeriodDay getAvailabilityNightTime() {
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
