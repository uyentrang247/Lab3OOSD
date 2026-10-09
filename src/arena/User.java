package arena;
/** Represents a user in ARENA. */
public class User {
    private final String name;
    private final String email;
    /** Creates a user. @param name user name @param email user email */
    public User(String name, String email) { this.name = name; this.email = email; }
    /** @return user name */
    public String getName() { return name; }
    /** @return user email */
    public String getEmail() { return email; }
}
