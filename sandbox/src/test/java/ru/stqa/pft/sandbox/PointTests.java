package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;


public class PointTests {
    @Test
    public void testDistance() {
        Point p1 = new Point(5, 2);
        Point p2 = new Point(10, 2);
        Assert.assertEquals(p1.distance(p2), 5);
    }
    @Test
    public void testDistance1() {
        Point p1 = new Point(5, 2);
        Point p2 = new Point(10, 2);
        Assert.assertNotEquals(p1.distance(p2), 4);
    }
    @Test
    public void testDistance2() {
        Point p1 = new Point(5, 2);
        Point p2 = new Point(10, 2);
        Assert.assertNotNull(p1.distance(p2));
    }
}


