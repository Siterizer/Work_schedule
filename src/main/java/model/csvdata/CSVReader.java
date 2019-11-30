package model.csvdata;

import model.sample.department.DepartmentMethods;
import model.sample.person.ContractType;
import model.sample.person.ContractTypeMethods;
import model.sample.person.Person;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.NoSuchElementException;
import java.util.Vector;

public class CSVReader extends CSVMainClass{

    public CSVReader(String namePath, Vector<Person> whereSaveData){
        try{
            checkNamePath(namePath);
            checkWhereSaveData(whereSaveData);
            readCSVFile(namePath);
        } catch (NoSuchFileException|NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }


    private void checkWhereSaveData(Vector<Person> whereSaveData) throws NoSuchElementException{
        if(whereSaveData == null){
            throw new NoSuchElementException("WhereSaveData is null!");
        }
    }

    private void readCSVFile(String namePath){
        BufferedReader bufferedReader;
        String line;
        String csvSplitBy = ",";

        try{
            bufferedReader = new BufferedReader(new FileReader(namePath + ".csv"));
            while((line = bufferedReader.readLine()) != null){
                String[] personData = line.split(csvSplitBy);
                ContractType contractType = ContractTypeMethods.getContract(personData[2]);
                Person person = new Person(personData[0],personData[1], contractType);
                DepartmentMethods.addPersonToActualDepartment(person);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
