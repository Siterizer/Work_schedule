package csvdata;

import sample.People;

import java.nio.file.NoSuchFileException;
import java.util.Vector;

public class CSVWriter extends CSVMainClass {
    public CSVWriter(String pathName, Vector<People> whatSave){
        try {
            checkNamePath(pathName);
        } catch (NoSuchFileException e) {
            e.printStackTrace();
        }
    }

}
