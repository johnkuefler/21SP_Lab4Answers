/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author johnk
 */
public class BankChargesTest {

    public BankChargesTest() {
    }

    @Test
    public void testCalculateBankFees() {
        System.out.println("calculateBankFees");
        int numChecks = 1;
        double expResult = 10.10;
        double result = BankCharges.calculateBankFees(numChecks);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testCalculateBankFees2() {
        System.out.println("calculateBankFees");
        int numChecks = 30;
        double expResult = 12.40;
        double result = BankCharges.calculateBankFees(numChecks);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testCalculateBankFees3() {
        System.out.println("calculateBankFees");
        int numChecks = 50;
        double expResult = 13;
        double result = BankCharges.calculateBankFees(numChecks);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testCalculateBankFees4() {
        System.out.println("calculateBankFees");
        int numChecks = 100;
        double expResult = 14;
        double result = BankCharges.calculateBankFees(numChecks);
        assertEquals(expResult, result, 0.0);
    }

}
