/* Author class that models an author of a book */

/**
 * Author
 */
public class Author {

    // Private instance variables
    private String name, email;

    // Constructs an Author instance with the given inputs
    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Public setters & getters
    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Author[name=" + name + ",email=" + email + "]";
    }
}