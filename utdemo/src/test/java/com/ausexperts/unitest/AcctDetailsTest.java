package com.ausexperts.unitest;

public class AcctDetailsTest {
    AcctDetails newAccount = new AcctDetails("Rashmin0", 5000001, 0.0, "Savings");

    void validateAccountName(){
        if (newAccount.getAcctName().matches("^[a-zA-Z]*$")){
            System.out.println("Name is valid");
        }
        else {
            System.out.println("Invalid name");
        }
    }

    public static void main(String[] args) {
        AcctDetailsTest adt = new AcctDetailsTest();
        adt.validateAccountName();
    }
}
