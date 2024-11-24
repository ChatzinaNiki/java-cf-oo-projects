package gr.aueb.cf.ch12.model2;

public class Main {
    public static void main(String[] args) {
        // Δημιουργία instance της κλάσης User με overloaded constructor
        User user = new User(2L, "Niki", "Chatzina");

        // Δημιουργία instance της κλάσης UserCredentials με overloaded constructor
        UserCredentials credentials = new UserCredentials(2L, "nikichatzina", "Password123!");

        // Εμφάνιση των πεδίων της κλάσης User
        System.out.println("User: {" + user.getId() + ", " + user.getFirstname() + ", " + user.getLastname() + "}");

        // Εμφάνιση των πεδίων της κλάσης UserCredentials
        System.out.println("UserCredentials: {" + credentials.getId() + ", " + credentials.getUsername() + ", " + credentials.getPassword() + "}");
    }
}
