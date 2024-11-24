package gr.aueb.cf.ch13.geometry;

public class PointXYZ {
    private double x;
    private double y;
    private double z;

    // Υπερφορτωμένος constructor
    public PointXYZ(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Getter methods
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    // Μέθοδος για μετατροπή σε String
    public String convertToString() {
        return "PointXYZ(" + x + ", " + y + ", " + z + ")";
    }

    // Μέθοδος για την απόσταση x-y
    public double getXYDistance() {
        return Math.sqrt(x * x + y * y);
    }

    // Μέθοδος για την απόσταση y-z
    public double getYZDistance() {
        return Math.sqrt(y * y + z * z);
    }

    // Μέθοδος για την απόσταση x-z
    public double getXZDistance() {
        return Math.sqrt(x * x + z * z);
    }

    // Μέθοδος για την απόσταση x-y-z (σε 3D)
    public double getXYZDistance() {
        return Math.sqrt(x * x + y * y + z * z);
    }
}
