package model.csvdata;

import model.sample.person.ContractTypeMethods;
import model.sample.person.Person;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Vector;

public class CSVWriter extends CSVMainClass {
    public CSVWriter(String pathName, Vector<Person> whatSave) {
        try {
            checkNamePath(pathName);
            checkWhatSave(whatSave);
            saveToCSVFile(pathName, whatSave);
        } catch (NoSuchElementException | IOException e) {
            e.printStackTrace();
        }
    }

    private void checkWhatSave(Vector<Person> people) throws NoSuchElementException {
        if (people == null)
            throw new NoSuchElementException("WhereSaveData is empty!");
    }

    private void saveToCSVFile(String pathName, Vector<Person> whatSave) throws IOException {
        FileWriter csvFile = new FileWriter(pathName + ".csv");
        for (Person person : whatSave
        ) {
            csvFile.append(person.getImie())
                    .append(",")
                    .append(person.getNazwisko())
                    .append(",")
                    .append(ContractTypeMethods.getStringContract(person.getContractType()))
                    .append(String.valueOf('\n'));
        }
        csvFile.flush();
        csvFile.close();

    }

}
