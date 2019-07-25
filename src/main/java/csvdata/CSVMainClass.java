package csvdata;

import java.io.File;

abstract class CSVMainClass {

    boolean chceckExistFile(String fileName) {
        return new File(fileName + ".csv").exists();
    }
}
