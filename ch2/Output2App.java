package gr.aueb.cf.ch2;

public class Output2App {
    public static void main(String[] args) {

        //Δηλωση και αρχικοποιηση μεταβλητων
        int price = 100;
        int quantity = 5;
        int totalPrice = 0;

        //Εντολες
        totalPrice = price * quantity;

        //Εκτυπωση αποτελεσματων
        System.out.printf("Price: %3d, Quantity: %d, Total Price: %d\n", price, quantity, totalPrice);
    }
}
