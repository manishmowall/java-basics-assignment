package org.nitishm.polygon;

public interface PerimeterCalculator {

    double getPerimeter(int noOfSides, double sideLength);
    double getPerimeter(Polygon polygon);
}
