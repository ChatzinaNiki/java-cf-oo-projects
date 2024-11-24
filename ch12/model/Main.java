package gr.aueb.cf.ch12.model;

public class Main {
    public static void main(String[] args) {
        // Δημιουργία αντικειμένου User
        User user = new User(1L, "Niki", "Chatzina");
        System.out.println("User Details:");
        System.out.println("ID: " + user.getId());
        System.out.println("Firstname: " + user.getFirstname());
        System.out.println("Lastname: " + user.getLastname());

        // Δημιουργία αντικειμένου UserCredentials
        UserCredentials credentials = new UserCredentials(1L, "nikichatzina", "password123@");
        System.out.println("\nUserCredentials Details:");
        System.out.println("ID: " + credentials.getId());
        System.out.println("Username: " + credentials.getUsername());
        System.out.println("Password: " + credentials.getPassword());
    }
}
