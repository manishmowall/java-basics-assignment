package org.nitishm.polygon;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Application {

    private final PolygonCalculator polygonCalculator;
    private final Scanner input;

    Application() {
        polygonCalculator = new PolygonCalculator();
        input = new java.util.Scanner(System.in);
    }

    public void start() {
        try{
            startApplication();
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid Input");
            e.getStackTrace();
        }
    }
    private void startApplication() throws InputMismatchException {

        System.out.println("========Polygon Calculator========");

        System.out.print("enter no of sides(int) of Polygon: ");
        int noOfSides = input.nextInt();

        System.out.print("enter length of side(double) of Polygon: ");
        double sideLength = input.nextDouble();

        System.out.println("Menu \n\t1) Perimeter \n\t2) Sum of Interior Angles");
        System.out.print("Enter option(1 or 2): ");

        int option= input.nextInt();

        switch (option) {
            case 1 : perimeterMenu(noOfSides, sideLength);
                break;

            case 2 : sumOfInteriorAnglesMenu(noOfSides, sideLength);
                break;

            default:
                throw new InputMismatchException();
        }
    }

    private void perimeterMenu(int noOfSides, double sideLength) throws InputMismatchException {

        System.out.println("==========Perimeter==========");
        System.out.println("Calculating Permeter by \n\t1)passing value  2) by polygon object");
        System.out.print("Enter option(1 or 2): ");

        int option = input.nextInt();

        double perimeter=-1;

        switch(option) {
            case 1 : perimeter = polygonCalculator.getPerimeter(noOfSides,sideLength);
                     break;

            case 2 : Polygon polygon = new Polygon(noOfSides, sideLength);
                     perimeter = polygonCalculator.getPerimeter(polygon);
                     break;

            default:
                     throw new InputMismatchException();
        }

        if(perimeter != -1)
            System.out.println("perimeter is "+perimeter);
    }

    private void sumOfInteriorAnglesMenu(int noOfSides, double sideLength) throws InputMismatchException {

        System.out.println("==========Sum Of Interior Angles==========");
        System.out.println("Calculating Sum by \n\t1)passing value  2) by polygon object");
        System.out.print("Enter option(1 or 2): ");

        int option = input.nextInt();

        double sum=-1;

        switch(option) {
            case 1 : sum = polygonCalculator.getSumOfInteriorAngles(noOfSides);
                     break;

            case 2 : Polygon polygon = new Polygon(noOfSides, sideLength);
                     sum = polygonCalculator.getSumOfInteriorAngles(polygon);
                     break;

            default:
                throw new InputMismatchException();
        }

        if(sum != -1)
            System.out.println("Sum of Interior Angles is "+sum);
    }
}
