package model.csvdata;

import java.io.File;
import java.nio.file.NoSuchFileException;

abstract class CSVMainClass {

    void checkNamePath(String namePath) throws NoSuchFileException {
        if(!chceckExistFile(namePath))
            throw new NoSuchFileException(namePath + " taki plik nie istnieje");
    }

    boolean chceckExistFile(String fileName) {
        return new File(fileName + ".csv").exists();
    }
}
