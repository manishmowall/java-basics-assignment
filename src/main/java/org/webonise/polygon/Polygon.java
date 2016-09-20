package org.webonise.polygon;

public class Polygon {
    private final int noOfSides;
    private final double sideLength;

    public Polygon(int noOfSides, double sideLength) {
        this.noOfSides = noOfSides;
        this.sideLength = sideLength;
    }

    public int getNoOfSides() {
        return noOfSides;
    }

    public double getSideLength() {
        return sideLength;
    }
}
