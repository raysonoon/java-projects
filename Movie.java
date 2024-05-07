// IM1003 2022-2023 Q2

public class Movie {
    private String title;
    private Actor[] actors;

    public Movie(String title, Actor[] actors) {
        this.title = title;
        this.actors = actors;
    }

    public String getTitle() {
        return title;
    }

    public Actor[] getActors() {
        return actors;
    }

    // Test statements
    public static void main(String[] args) {
        Actor a1 = new Actor("Peter", 'M');
        Actor a2 = new Actor("Jane", 'F');
        System.out.println(a1);
        System.out.println(a2);
        Actor[] actors = { a1, a2 };
        Movie m = new Movie("Oasis", actors);
        System.out.println(m.getTitle());
    }
}