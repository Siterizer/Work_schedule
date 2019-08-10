package model.sample;

public class Day {
    private boolean holiday;
    private int nuDayInMonth;

    public Day(int nuDayInMonth, boolean holiday) {
        this.nuDayInMonth = nuDayInMonth;
        this.holiday = holiday;
    }

    public boolean isHoliday() {
        return holiday;
    }

    public int getNuDayInMonth() {
        return nuDayInMonth;
    }
}
