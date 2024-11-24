package gr.aueb.cf.ch15;

public class Point2D extends Point {
    protected double y;

    public Point2D(double x, double y) {
        super(x);
        this.y = y;
    }

    @Override
    public double getDistanceFromOrigin() {
        return Math.sqrt(x * x + y * y); // Εφαρμογή του Πυθαγορείου θεωρήματος
    }
}
