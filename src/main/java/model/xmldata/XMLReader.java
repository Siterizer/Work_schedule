package model.xmldata;

import model.sample.Month;

public class XMLReader {
    private String month;
    private String year;
    public XMLReader(String month, String year){
        whatMonth(month);
    }

    private void whatMonth(String month){
        try{
        switch (month){
            case "Styczeń":
                this.month = "1";
                break;
            case "Luty":
                this.month = "2";
                break;
            case "Marzec":
                this.month = "3";
                break;
            case "Kwiecień":
                this.month = "4";
                break;
            case "Maj":
                this.month = "5";
                break;
            case "Czerwiec":
                this.month = "6";
                break;
            case "Lipiec":
                this.month = "7";
                break;
            case "Sierpień":
                this.month = "8";
                break;
            case "Wrzesień":
                this.month = "9";
                break;
            case "Październik":
                this.month = "10";
                break;
            case "Listopad":
                this.month = "11";
                break;
            case "Grudzień":
                this.month = "12";
                break;
            default:
                throw new Exception("Nie ma takiego miesiąca");
        }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
