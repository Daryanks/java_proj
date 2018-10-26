public class Point {

    double x;
    double y;

    public Point(double a, double b) {
        this.x = a;
        this.y = b;
    }

    public static double distance(Point p1, Point p2) {

        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
    }
}
