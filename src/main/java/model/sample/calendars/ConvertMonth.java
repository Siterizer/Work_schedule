package model.sample.calendars;

import model.sample.calendars.availability.day.AvailabilityDay;
import model.sample.calendars.availability.month.AvailabilityMonth;
import model.sample.calendars.working.day.WorkingDay;
import model.sample.calendars.working.month.WorkingMonth;

public class ConvertMonth {
    public static WorkingMonth availabilityToWorking(AvailabilityMonth availabilityMonth){
        WorkingMonth workingMonth = new WorkingMonth(availabilityMonth.getNumberOfDays(),
                availabilityMonth.getMonthNumber(), availabilityMonth.getYear());

        for(AvailabilityDay item: availabilityMonth.getDaysOfTheMonth()){
            WorkingDay workingDay = new WorkingDay(item.getNumberOfDay(), item.getDayType());
            workingMonth.addDay(workingDay);
        }
        return workingMonth;
    }
}
