package ru.stqa.pft.sandbox;

public class FirstProgram {
    public static void main(String[] args) {

        Point p1 = new Point(2.0, 3.0);
        Point p2 = new Point(5.0, 8.0);

        System.out.println("The distance between point p1 and p2: " + p1.distance(p2));
    }

}
