package model.sample;

public class Day {
    private int holiday;
    private int nuDayInMonth;

    public Day(int nuDayInMonth, int holiday) {
        this.nuDayInMonth = nuDayInMonth;
        this.holiday = holiday;
    }

    public int isHoliday() {
        return holiday;
    }

    public int getNuDayInMonth() {
        return nuDayInMonth;
    }

    public void showDay(){
        System.out.printf("nuDayInMonth=%d, holiday=%d",this.nuDayInMonth, this.holiday);
    }
}
