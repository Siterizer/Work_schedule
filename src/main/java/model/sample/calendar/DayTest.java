package model.sample.calendar;

public class DayTest implements Cloneable {
    private DayTimeTest dayTime;
    private NightTimeTest nightTime;
    private TypeOfDay dayType;
    private int numberOfDay;

    public DayTest(int numberOfDay, TypeOfDay dayType){
        this.numberOfDay = numberOfDay;
        this.dayType = dayType;
        this.dayTime = new DayTimeTest();
        this.nightTime = new NightTimeTest();
    }

    public TypeOfDay getDayType(){
        return this.dayType;
    }

    public void setDayType(TypeOfDay value){
        this.dayType = value;
    }

    public int getNumberOfDay(){
        return numberOfDay;
    }

    public DayTimeTest getDayTime() {
        return dayTime;
    }

    public NightTimeTest getNightTime() {
        return nightTime;
    }

    public DayTest clone(){
        try{
            DayTest temp = (DayTest) super.clone();
            temp.dayTime = dayTime.clone();
            temp.nightTime = nightTime.clone();
            return temp;
        }
        catch (Exception ex){
            return null;
        }
    }
}
