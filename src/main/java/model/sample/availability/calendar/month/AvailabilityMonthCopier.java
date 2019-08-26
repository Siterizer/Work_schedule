package model.sample.availability.calendar.month;

public class AvailabilityMonthCopier {
    private AvailabilityMonth availabilityMonth;

    public AvailabilityMonthCopier(AvailabilityMonth availabilityMonth){
        this.availabilityMonth = availabilityMonth;
    }

    public AvailabilityMonth copyAvailabilityMonth(){
        return availabilityMonth.clone();
    }
}
