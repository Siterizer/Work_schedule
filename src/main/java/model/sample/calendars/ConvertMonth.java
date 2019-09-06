package model.sample.calendars;

import model.sample.calendars.availability.day.AvailabilityDay;
import model.sample.calendars.availability.month.AvailabilityMonth;
import model.sample.calendars.working.day.WorkingDay;
import model.sample.calendars.working.month.WorkingMonth;

public class ConvertMonth {
    public static WorkingMonth availabilityToWorking(AvailabilityMonth availabilityMonth){
        WorkingMonth workingMonth = new WorkingMonth(availabilityMonth.getNumberOfDays(),
                availabilityMonth.getMonthNumber(), availabilityMonth.getYear());

        for(AvailabilityDay item: availabilityMonth.getDays()){
            WorkingDay workingDay = new WorkingDay(item.getDayNumber(), item.getDayType());
            workingMonth.addDay(workingDay);
        }
        return workingMonth;
    }

    public static AvailabilityMonth workingToAvailability(WorkingMonth workingMonth){
        AvailabilityMonth availabilityMonth = new AvailabilityMonth(workingMonth.getNumberOfDays(),
                workingMonth.getMonthNumber(),workingMonth.getYear());

        for(WorkingDay item:workingMonth.getDays()){
            AvailabilityDay availabilityDay = new AvailabilityDay(item.getDayNumber(),item.getDayType());
            availabilityMonth.addDay(availabilityDay);
        }
        return availabilityMonth;
    }
}
