package controller.hbox.factory.AvailabilityOfPersons;

public class EvenColours {

    private static boolean counter;

    public static String getColour(boolean generateNextColour){

        if(generateNextColour){
            counter = !counter;
        }
        if(counter){
            return "-fx-background-color: #ffffff;";
        }
        return "-fx-background-color: #ffccff;";
    }
}
