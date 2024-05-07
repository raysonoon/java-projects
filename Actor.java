// IM1003 2022-2023 Q2

/**
 * Actor
 */
public class Actor {
    private String name;
    private char gender;

    public Actor(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }
    
    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return "Actor " + name + " " + gender;
    }
}