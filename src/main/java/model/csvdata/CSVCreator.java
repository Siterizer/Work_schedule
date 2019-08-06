package model.csvdata;

import java.io.FileWriter;
import java.io.IOException;

class CSVCreator {
    CSVCreator(String pathName) throws IOException {
        new FileWriter(pathName + ".csv");
    }
}
