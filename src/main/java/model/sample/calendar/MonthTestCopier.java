package model.sample.calendar;

public class MonthTestCopier {
    private MonthTest monthTest;

    public MonthTestCopier(MonthTest monthTest){
        this.monthTest = monthTest;
    }

    public MonthTest copyMonthTest(){
        return monthTest.clone();
    }
}
