package com.company;

import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String inputMortgage;
        String inputTermInMonths;
        String inputRate;

        System.out.println("Enter the mortgage amount: ");
        inputMortgage = myScanner.nextLine();
        double mortgageAmount = Double.parseDouble(inputMortgage);

        System.out.println("Enter the term of the mortgage in months: ");
        inputTermInMonths = myScanner.nextLine();
        double termInMonths = Double.parseDouble(inputTermInMonths);

        System.out.println("Enter the interest rate: (percentage)");
        inputRate = myScanner.nextLine();
        double interestRate = Double.parseDouble(inputRate);
        interestRate = interestRate / 1200;

        double L = mortgageAmount;
        double n = termInMonths;
        double c = interestRate;
        double numerator = c * Math.pow(1 + c, n);
        double denominator = Math.pow(1 + c, n) - 1;
        double paymentAmount = L * (numerator / denominator);

        System.out.printf("Your mortgage payment amount is " + paymentAmount);
    }
}
