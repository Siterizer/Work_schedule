package model.sample.person;

public class PersonMethods {

    public static void checkFirstAndLastName(String firstName, String lastName) {
        if (firstName.length() < 3) {
            throw new IllegalArgumentException("FirstNameLengthException");
        }
        if (!firstName.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("FirstNameCharacterException");
        }
        if (lastName.length() < 3) {
            throw new IllegalArgumentException("LastNameLengthException");
        }
        if (!lastName.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("LastNameCharacterException");
        }
    }
}
