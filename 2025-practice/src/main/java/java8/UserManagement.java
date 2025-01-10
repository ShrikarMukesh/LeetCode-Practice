package main.java.java8;

import java.util.List;
import java.util.Arrays;

public class UserManagement {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User(1, "Alice", "alice@example.com"),
                new User(2, "Bob", null),
                new User(3, "Charlie", "charlie@example.com")
        );

        try {
            System.out.println(findUserEmailById(users, 1)); // Output: alice@example.com
            System.out.println(findUserEmailById(users, 2)); // Output: default@example.com
            System.out.println(findUserEmailById(users, 4)); // Throws UserNotFoundException
        } catch (UserNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
    public static String findUserEmailById(List<User> users, int id) throws UserNotFoundException {
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .map(user -> user.getEmail().orElse("default@example.com"))
                .orElseThrow(() -> new UserNotFoundException("User with ID " + id + " not found"));

    }
}