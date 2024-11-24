package gr.aueb.cf.ch12.model2;

public class UserCredentials {
    private Long id;
    private String username;
    private String password;

    // Default constructor
    public UserCredentials() {
    }

    // Overloaded constructor
    public UserCredentials(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}