package com.trilogyed;

import java.util.Scanner;

public class RectangularPavingCompany {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String widthInput;
        String lengthInput;
        float width;
        float length;

        System.out.println("Enter the width of the driveway (in feet): ");
        widthInput = myScanner.nextLine();
        System.out.println("Enter the length of the driveway (in feet): ");
        lengthInput = myScanner.nextLine();

        width = Float.parseFloat(widthInput);
        length = Float.parseFloat(lengthInput);

        float area = length * width;
        float perimeter = 2 * (length + width);
        float costOfCement = area * 12.50f;
        float costOfFraming = perimeter * 8.25f;
        float totalCostOfDriveway = costOfCement + costOfFraming;

        System.out.println("The area of the driveway is " + area + ".");
        System.out.println("The perimeter of the driveway is " + perimeter + ".");
        System.out.printf("The cost of the cement for the driveway is %.2f. %n", costOfCement);
        System.out.printf("The cost of the framing/footers for the driveway is %.2f. %n", costOfFraming);
        System.out.printf("The total cost of the driveway is %.2f. %n", totalCostOfDriveway);

        //Version 2
        String cementInput;
        String framingInput;
        float cementTotal;
        float framingTotal;

        System.out.println("Enter the cost of the cement: ");
        cementInput = myScanner.nextLine();
        System.out.println("Enter the cost of the framing/footers: ");
        framingInput = myScanner.nextLine();

        cementTotal = Float.parseFloat(cementInput);
        framingTotal = Float.parseFloat(framingInput);

        System.out.printf("The cost of the cement is %.2f and the cost of the framing/footers is %.2f. %n", cementTotal, framingTotal);


    }
}

