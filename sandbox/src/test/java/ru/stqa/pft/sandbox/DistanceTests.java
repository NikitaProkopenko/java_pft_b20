
package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistanceTests {

    @Test
    public void testDistance() {
        Point p1 = new Point(3.0, 5.0);
        Point p2 = new Point (4.0, 6.0);
        Assert.assertEquals(p1.distance(p2), 1.41);
    }
}
