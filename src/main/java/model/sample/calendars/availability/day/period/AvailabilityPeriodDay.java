package model.sample.calendars.availability.day.period;

public class AvailabilityPeriodDay implements Cloneable {
    private AvailabilityStatus availabilityStatus;

    public AvailabilityPeriodDay(){
        this.availabilityStatus = AvailabilityStatus.NEUTRALLY;
    }
    public AvailabilityStatus getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void changeAvailability(){
        if(this.availabilityStatus == AvailabilityStatus.NEUTRALLY){
            this.availabilityStatus = AvailabilityStatus.UNLIKE;
        }
        else if(this.availabilityStatus == AvailabilityStatus.UNLIKE){
            this.availabilityStatus = AvailabilityStatus.LIKE;
        }
        else{
            this.availabilityStatus = AvailabilityStatus.NEUTRALLY;
        }
    }

    public String getColor(){
        switch (availabilityStatus){
            case NEUTRALLY:
                return "-fx-background-color: #ffffff;";
            case UNLIKE:
                return "-fx-background-color: #ff0000;";
            case LIKE:
                return "-fx-background-color: #33cc33;";
        }
        return "-fx-background-color: #ffffff;";
    }
    public AvailabilityPeriodDay clone(){
        try {
            return (AvailabilityPeriodDay) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }

    }
}
