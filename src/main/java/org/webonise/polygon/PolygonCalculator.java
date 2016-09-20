package org.webonise.polygon;

public class PolygonCalculator implements PerimeterCalculator, SumOfInteriorAnglesCalculator {

    @Override
    public double getPerimeter(int noOfSides, double sideLength) {
        return noOfSides * sideLength;
    }

    @Override
    public double getPerimeter(Polygon polygon) {
        int noOfSides = polygon.getNoOfSides();
        double sideLength = polygon.getSideLength();

        return noOfSides * sideLength;
    }

    @Override
    public int getSumOfInteriorAngles(int noOfSides) {
        return 180 * (noOfSides - 2);
    }

    @Override
    public int getSumOfInteriorAngles(Polygon polygon) {
        int noOfSides = polygon.getNoOfSides();

        return 180 * (noOfSides - 2);
    }
}
