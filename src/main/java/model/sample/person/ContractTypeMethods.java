package model.sample.person;

public class ContractTypeMethods {

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
    public static void checkIfStringIsContractType(String contractType){
        boolean temp = false;
        for(ContractType type : ContractType.values()){
            if(ContractTypeMethods.getContract(contractType) == type){
                temp = true;
            }
        }
        if(!temp){
            throw new IllegalArgumentException("ContratTypeException");
        }
    }
}
