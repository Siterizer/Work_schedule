package csvdata;

import sample.People;

import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Vector;

public class CSVWriter extends CSVMainClass {
    public CSVWriter(String pathName, Vector<People> whatSave) {
        try {
            checkNamePath(pathName);
            checkWhatSave(whatSave);
            saveToCSVFile(pathName, whatSave);
        } catch (NoSuchElementException | IOException e) {
            e.printStackTrace();
        }
    }

    private void checkWhatSave(Vector<People> people) throws NoSuchElementException {
        if (people == null)
            throw new NoSuchElementException("WhereSaveData is empty!");
    }

    private void saveToCSVFile(String pathName, Vector<People> whatSave) throws IOException {
        FileWriter csvFile = new FileWriter(pathName + ".csv");
        for (People person : whatSave
        ) {
            csvFile.append(person.getImie()).append(",").append(person.getNazwisko()).append(String.valueOf('\n'));
        }
        csvFile.flush();
        csvFile.close();

    }

}
