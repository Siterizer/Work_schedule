package model.sample.availability.calendar.day;

import model.sample.availability.calendar.day.components.AvailabilityDayTime;
import model.sample.availability.calendar.day.components.AvailabilityNightTime;

public class AvailabilityDay implements Cloneable {
    private AvailabilityDayTime availabilityDayTime;
    private AvailabilityNightTime availabilityNightTime;
    private TypeOfAvailabilityDay dayType;
    private int numberOfDay;

    public AvailabilityDay(int numberOfDay, TypeOfAvailabilityDay dayType){
        this.numberOfDay = numberOfDay;
        this.dayType = dayType;
        this.availabilityDayTime = new AvailabilityDayTime();
        this.availabilityNightTime = new AvailabilityNightTime();
    }

    public TypeOfAvailabilityDay getDayType(){
        return this.dayType;
    }

    public int getNumberOfDay(){
        return numberOfDay;
    }

    public AvailabilityDayTime getAvailabilityDayTime() {
        return availabilityDayTime;
    }

    public AvailabilityNightTime getNightTime() {
        return availabilityNightTime;
    }

    public AvailabilityDay clone(){
        try{
            return (AvailabilityDay) super.clone();
        }
        catch (Exception ex){
            return null;
        }
    }
}
