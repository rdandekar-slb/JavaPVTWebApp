package com.ausexperts.unitest;

public class AcctDetails {
    private String acctName;
    private Integer acctNumber;
    private Double acctBalance;
    private String acctType;

    public AcctDetails(String acctName, int acctNumber, double acctBalance, String acctType){
        this.acctName=acctName;
        this.acctNumber=acctNumber;
        this.acctBalance=acctBalance;
        this.acctType=acctType;
    }

    public String getAcctName(){
        return this.acctName;
    }

    public Double getAcctBalance(){
        return this.acctBalance;
    }


}
