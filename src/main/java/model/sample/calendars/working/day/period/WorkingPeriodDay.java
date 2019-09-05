package model.sample.calendars.working.day.period;

public class WorkingPeriodDay implements Cloneable {
    private WorkingStatus workingStatus;

    public WorkingPeriodDay(){
        this.workingStatus = WorkingStatus.UNWORKING;
    }

    public WorkingStatus getWorkingStatus(){
        return this.workingStatus;
    }

    public void changeWorkingStatus(){
        if(workingStatus == WorkingStatus.UNWORKING){
            this.workingStatus = WorkingStatus.WORKING;
        }
        else{
            this.workingStatus = WorkingStatus.UNWORKING;
        }
    }

    public String getColor(){
        switch (workingStatus){
            case WORKING:
                return "-fx-background-color: #ffffff;";
            case UNWORKING:
                return "-fx-background-color: #33cc33;";
        }
        return "-fx-background-color: #ffffff;";
    }

    public WorkingPeriodDay clone(){
        try {
            return (WorkingPeriodDay) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
