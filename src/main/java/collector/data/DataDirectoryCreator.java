package collector.data;

import java.io.File;
import java.io.IOException;

public class DataDirectoryCreator {
    public DataDirectoryCreator() throws IOException {
        String pathName = "data";
        createDataFolder(pathName);
        createdCSVFiles(pathName);

    }

    private void createDataFolder(String pathName) {
        File newDirectory = new File(pathName); //zastanowic sie gdzie powinien znajdowaac sie ten folder /taget?
        if (!newDirectory.exists()) {
            if (newDirectory.mkdir())
                System.out.println("Successfully  created directory"); // jakas inna zmiana
            else
                System.out.println("Sth goes wrong 1"); // jakas inna zmiana
        } else {
            System.out.println("Directory already exist"); // jakas inna zmiana
        }
    }

    private void createdCSVFiles(String pathData) throws IOException {
        createCSVFile(pathData + "\\pielegniarki");
        createCSVFile(pathData + "\\opiekunki");
    }
    private void createCSVFile(String pathData) throws IOException {
        if(!chceckExistFile(pathData))
            new CSVCreator(pathData);
    }

    private boolean chceckExistFile(String fileName){
       return new File(fileName + "csv").exists();
    }
}