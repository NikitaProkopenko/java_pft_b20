package ru.stqa.pft.sandbox;

public class FirstProgram {
    public static void main(String[] args) {
        Point p1 = new Point(2.0, 3.0);
        Point p2 = new Point(5.0, 8.0);

        System.out.println(distance(p1, p2));
    }



    public static double distance(Point p1, Point p2) {
        double result = Math.sqrt(((p2.x - p1.x) * (p2.x - p1.x)) + ((p2.y - p1.y) * (p2.y - p1.y)));
        return result;
    }
}
