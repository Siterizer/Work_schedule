package model.xmldata;

import controller.controllers.NewScheduleController;
import model.sample.Day;
import model.sample.Month;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLReader {
    private String month;
    private String year;

    public XMLReader(String month, String year) {
        try {
            whatMonth(month);
            NewScheduleController.checkYear(year);
            this.year = year;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Month getMonth() {
        try {
            if (!checkIfFileExist("./XMLyears/" + year))
                throw new Exception("Taki plik nie istnieje!");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return createMonthIterior();
    }

    private Month createMonthIterior() {
        Month currentMonth = new Month(0,0);
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
            Document yearXML = builder.parse("./XMLyears/" + this.year + ".xml");
            NodeList monthList = yearXML.getElementsByTagName(this.month);
            Node month = monthList.item(0);
            if (!(month.getNodeType() == Node.ELEMENT_NODE))
                throw new Exception("To nie jest ELEMENT_NODE miesiac");
            Element monthToRead = (Element) month;
            currentMonth = new Month(Integer.parseInt(monthToRead.getAttribute("NoDays")),
                    Integer.parseInt(monthToRead.getAttribute("NoMonth")));
            NodeList daysOfMonth = monthToRead.getChildNodes();
            for (int i = 0; i < daysOfMonth.getLength(); i++) {
                Node day = daysOfMonth.item(i);
                if(!(day.getNodeType() == Node.ELEMENT_NODE))
                    throw new Exception("To nie jest ELEMENT_NODE dzien");
                Element dayToLoad = (Element) day;
                currentMonth.addToVector(new Day(Integer.parseInt(dayToLoad.getAttribute("NoDay")),
                        Integer.parseInt(dayToLoad.getAttribute("Holiday"))));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return currentMonth;
    }

    public static boolean checkIfFileExist(String fileName) {
        return new File(fileName + ".xml").exists();
    }

    private void whatMonth(String month) {
        try {
            switch (month) {
                case "Styczeń":
                    this.month = "January";
                    break;
                case "Luty":
                    this.month = "February";
                    break;
                case "Marzec":
                    this.month = "March";
                    break;
                case "Kwiecień":
                    this.month = "April";
                    break;
                case "Maj":
                    this.month = "May";
                    break;
                case "Czerwiec":
                    this.month = "June";
                    break;
                case "Lipiec":
                    this.month = "July";
                    break;
                case "Sierpień":
                    this.month = "August";
                    break;
                case "Wrzesień":
                    this.month = "September";
                    break;
                case "Październik":
                    this.month = "October";
                    break;
                case "Listopad":
                    this.month = "November";
                    break;
                case "Grudzień":
                    this.month = "December";
                    break;
                default:
                    throw new Exception("Nie ma takiego miesiąca");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
