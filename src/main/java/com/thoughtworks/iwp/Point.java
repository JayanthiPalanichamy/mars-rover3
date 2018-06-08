package com.thoughtworks.iwp;

public class Point {
    private final int xPoint;
    private final int yPoint;

    public Point(int xPoint, int yPoint) {
        this.xPoint = xPoint;
        this.yPoint = yPoint;
    }

    @Override
    public String toString() {
        return xPoint + " " + yPoint;
    }

    public Point increaseY() {
        return new Point(xPoint, yPoint + 1);
    }

    public Point increaseX() {
        return new Point(xPoint + 1, yPoint);
    }

    public Point decreaseX() {
        return new Point(xPoint - 1, yPoint);
    }

    public Point decreaseY() {
        return new Point(xPoint, yPoint - 1);
    }

    public boolean isGreater(Point temp) {
        return xPoint >= temp.xPoint && yPoint >= temp.yPoint;
    }

    public boolean isLesser(Point temp) {
        return xPoint <= temp.xPoint && yPoint <= temp.yPoint;
    }
}
