package gr.aueb.cf.ch15;

public class Point3D extends Point2D {
    private final double z; // Προσθήκη τρίτης διάστασης z

    public Point3D(double x, double y, double z) {
        super(x, y); // Καλεί τον constructor της Point2D για x και y
        this.z = z; // Αρχικοποιεί τη συντεταγμένη z
    }

    @Override
    public double getDistanceFromOrigin() {
        // Χρησιμοποιούμε το Πυθαγόρειο θεώρημα για 3 διαστάσεις (x, y, z)
        return Math.sqrt(x * x + y * y + z * z);
    }
}

