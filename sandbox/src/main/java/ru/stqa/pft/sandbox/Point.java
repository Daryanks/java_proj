package ru.stqa.pft.sandbox;

public class Point {

    double x;
    double y;

    public Point(double a, double b) {
        this.x = a;
        this.y = b;
    }

    public double distance(Point p1) {

        return Math.sqrt((p1.x - this.x) * (p1.x - this.x) + (p1.y - this.y) * (p1.y - this.y));
    }
}
