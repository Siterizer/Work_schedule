package collectordata;

import sample.People;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.NoSuchElementException;
import java.util.Vector;

public class CSVReader extends CSVMainClass{

    private String namePath;
    private  Vector<People> saveData;
    public CSVReader(String namePath, Vector<People> whereSaveData){
        try{
            checkNamePath(namePath);
            checkWhereSaveData(whereSaveData);
            this.namePath = namePath;
            this.saveData = whereSaveData;
        } catch (NoSuchFileException|NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }

    private void checkNamePath(String namePath) throws NoSuchFileException {
        if(!chceckExistFile(namePath))
            throw new NoSuchFileException(namePath + " taki plik nie istnieje");
    }

    private void checkWhereSaveData(Vector<People> whereSaveData) throws NoSuchElementException{
        if(whereSaveData == null){
            throw new NoSuchElementException("WhereSaveData is empty!");
        }
    }

    private void readCSVFile(){
        BufferedReader bufferedReader = null;
        String line = "";
        String csvSplitBy = ",";

        try{
            bufferedReader = new BufferedReader(new FileReader(this.namePath));
            while((line = bufferedReader.readLine()) != null){
                String[] firstLastName = line.split(csvSplitBy);
                saveData.add(new People(firstLastName[0],firstLastName[1]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
