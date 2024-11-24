package gr.aueb.cf.ch15;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(5.5);
        System.out.println("Η απόσταση του σημείου από την αρχή των αξόνων είναι: " + p.getDistanceFromOrigin());
    }
}

class Point {
    protected double x;

    public Point(double x) {
        this.x = x;
    }

    public double getDistanceFromOrigin() {
        return Math.abs(x);
    }
}
