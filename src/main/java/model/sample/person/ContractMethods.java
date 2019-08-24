package model.sample.person;

public class ContractMethods {

    public static ContractType getContract(String contract){
        if(contract.equals("Umowa o prace")){
            return ContractType.CONTRACT_OF_EMPLOYMENT;
        }
        return ContractType.CONTRACT_OF_MANDATE;
    }
    public static String getStringContract(ContractType contract){
        if(contract == ContractType.CONTRACT_OF_EMPLOYMENT){
            return "Umowa o prace";
        }
        return "Umowa zlecenie";
    }
}
