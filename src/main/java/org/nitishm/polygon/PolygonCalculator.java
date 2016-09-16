package org.nitishm.polygon;

public class PolygonCalculator implements PerimeterCalculator, SumOfInteriorAnglesCalculator {

    public double getPerimeter(int noOfSides, double sideLength) {
        return noOfSides*sideLength;
    }

    public double getPerimeter(Polygon polygon) {
        int noOfSides = polygon.getNoOfSides();
        double sideLength = polygon.getSideLength();

        return noOfSides*sideLength;
    }

    public int getSumOfInteriorAngles(int noOfSides) {
        return 180*(noOfSides - 2);
    }

    public int getSumOfInteriorAngles(Polygon polygon) {
        int noOfSides = polygon.getNoOfSides();

        return 180*(noOfSides - 2);
    }
}
