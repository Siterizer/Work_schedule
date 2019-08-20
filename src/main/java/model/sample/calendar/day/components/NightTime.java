package model.sample.calendar.day.components;

public class NightTime implements Cloneable {
    private TypeOfAvailability availabilityType;

    public NightTime(){
        this.availabilityType = TypeOfAvailability.NEUTRALLY;
    }
    public TypeOfAvailability getAvailabilityType() {
        return availabilityType;
    }

    public void changeAvailability(){
        if(this.availabilityType == TypeOfAvailability.NEUTRALLY){
            this.availabilityType = TypeOfAvailability.UNLIKE;
        }
        else if(this.availabilityType == TypeOfAvailability.UNLIKE){
            this.availabilityType = TypeOfAvailability.LIKE;
        }
        else{
            this.availabilityType = TypeOfAvailability.NEUTRALLY;
        }
    }

    public String getColor(){
        switch (availabilityType){
            case NEUTRALLY:
                return "-fx-background-color: #ffffff;";
            case UNLIKE:
                return "-fx-background-color: #ff0000;";
            case LIKE:
                return "-fx-background-color: #33cc33;";
        }
        return "-fx-background-color: #ffffff;";
    }

    public void setAvailabilityType(TypeOfAvailability availabilityType) {
        this.availabilityType = availabilityType;
    }

    public NightTime clone(){
        try{
            NightTime temp = (NightTime) super.clone();
            return temp;
        }
        catch (Exception ex){
            return null;
        }
    }
}
