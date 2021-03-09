
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author johnk
 */
public class BankCharges {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number of checks for the month: ");
        int numChecks = keyboard.nextInt();

        double finalCharge = calculateBankFees(numChecks);
        
        System.out.println("Service fees: $" + finalCharge);

    }

    public static double calculateBankFees(int numChecks) {
        double baseFee = 10;
        double finalCharge = 0;
        double checkFee = 0;

        if (numChecks < 20) {
            checkFee = 0.10;
        } else if (numChecks >= 20 && numChecks < 40) {
            checkFee = 0.08;
        } else if (numChecks >= 40 && numChecks < 60) {
            checkFee = 0.06;
        } else {
            checkFee = 0.04;
        }

        finalCharge = baseFee + (checkFee * numChecks);
        return finalCharge;
    }
}
