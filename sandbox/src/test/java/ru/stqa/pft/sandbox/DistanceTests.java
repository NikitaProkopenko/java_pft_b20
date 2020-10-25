
package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import static ru.stqa.pft.sandbox.Point.distance;

public class DistanceTests {

    @Test
    public void testDistance() {
        Point p1 = new Point(3.0, 5.0);
        Point p2 = new Point (4.0, 6.0);
        Assert.assertEquals(distance(p1, p2), 1.41);
    }
}
