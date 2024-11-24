package gr.aueb.cf.ch13.geometry;

public class Main {
    public static void main(String[] args) {
        // Δημιουργία ενός σημείου PointXYZ με τον υπερφορτωμένο constructor
        PointXYZ point = new PointXYZ(3.0, 4.0, 5.0);

        // Εκτύπωση του σημείου ως String
        System.out.println(point.convertToString());

        // Εκτύπωση των αποστάσεων
        System.out.println("XY Distance: " + point.getXYDistance());
        System.out.println("YZ Distance: " + point.getYZDistance());
        System.out.println("XZ Distance: " + point.getXZDistance());
        System.out.println("XYZ Distance: " + point.getXYZDistance());
    }
}
