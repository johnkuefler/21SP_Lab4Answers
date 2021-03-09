
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
public class InsuranceEstimator {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your age");

        int age = keyboard.nextInt();

        double lifeInsuranceCost = calculateLifeInsurance(age);
        
        System.out.println("Your estimate is " + lifeInsuranceCost);
    }
    
    public static double calculateLifeInsurance(int age) {
        double insuranceCost = (5 * age) + 300;
        return insuranceCost;
    }
}
