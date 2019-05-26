package hello.Domain;

public class User {
    private int id;
    private String name;
    private String email;
    private String username;

    public User(int id, String username, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.username = username;
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }

    public String getName() { return name; }

    public String getEmail() { return email; }

    public String getUsername() { return username; }
}
