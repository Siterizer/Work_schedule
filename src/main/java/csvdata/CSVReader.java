package csvdata;

import sample.People;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.NoSuchElementException;
import java.util.Vector;

public class CSVReader extends CSVMainClass{

    public CSVReader(String namePath, Vector<People> whereSaveData){
        try{
            checkNamePath(namePath);
            checkWhereSaveData(whereSaveData);
            readCSVFile(namePath, whereSaveData);
        } catch (NoSuchFileException|NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }


    private void checkWhereSaveData(Vector<People> whereSaveData) throws NoSuchElementException{
        if(whereSaveData == null){
            throw new NoSuchElementException("WhereSaveData is empty!");
        }
    }

    private void readCSVFile(String namePath, Vector<People> saveData){
        BufferedReader bufferedReader;
        String line;
        String csvSplitBy = ",";

        try{
            bufferedReader = new BufferedReader(new FileReader(namePath + ".csv"));
            while((line = bufferedReader.readLine()) != null){
                String[] firstLastName = line.split(csvSplitBy);
                new People(firstLastName[0],firstLastName[1]);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
