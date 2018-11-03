package ru.stqa.pft.sandbox;

public class FirstP{
    public static void main(String[]arg){

        Point p1 = new Point(5, 2);
        Point p2 = new Point(10, 2);
        System.out.println("rasstoyanie: " + length(p1, p2));
        System.out.println("rasstoyanie: " + p1.distance(p2));
	}
    public static double length(Point p1, Point p2) {

        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
    }
}