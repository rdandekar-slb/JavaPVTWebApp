package com.ausexperts.unitest;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AcctDetailsTest {
    AcctDetails newAct = new AcctDetails("Rashmin", 500001, 500, "Savings");

    @Test
    public void validateName(){
        assertTrue(newAct.getAcctName().matches("^[a-zA-Z0-9]*$"));
    }

    @Test
    public void validateBalance(){
        assertTrue(newAct.getAcctBalance()>=0);
    }
}
