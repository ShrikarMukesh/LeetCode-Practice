package main.java.java8;
import java.util.Optional;

class User { private int id;

    private String name;

    private String email;

    public User(int id, String name, String email) {
        this.id = id; this.name = name; this.email = email;
    }
    public int getId() { return id; }
    public String getName() {
        return name;
    }
    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
}