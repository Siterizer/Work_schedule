package model.sample.availability.calendar.day;

import model.sample.availability.calendar.day.components.AvailabilityPeriodDay;

public class AvailabilityDay implements Cloneable {
    private AvailabilityPeriodDay availabilityDayTime;
    private AvailabilityPeriodDay availabilityNightTime;
    private TypeOfAvailabilityDay dayType;
    private int numberOfDay;

    public AvailabilityDay(int numberOfDay, TypeOfAvailabilityDay dayType){
        this.numberOfDay = numberOfDay;
        this.dayType = dayType;
        this.availabilityDayTime = new AvailabilityPeriodDay();
        this.availabilityNightTime = new AvailabilityPeriodDay();
    }

    public TypeOfAvailabilityDay getDayType(){
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
