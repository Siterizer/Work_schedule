package model.sample.calendar.month;

public class MonthCopier {
    private Month month;

    public MonthCopier(Month month){
        this.month = month;
    }

    public Month copyMonthTest(){
        return month.clone();
    }
}
