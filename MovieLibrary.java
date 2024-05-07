// IM1003 2022-2023 Q2
/**
 * MovieLibrary
 */
public class MovieLibrary {
    private Movie[] movies;
    private int maxMovies;
    private int numMovies;

    public MovieLibrary() {
        maxMovies = 1000;
        numMovies = 0;
        // Allocate movies array; null by default
        movies = new Movie[maxMovies];
    }

    public Movie searchMovieByTitle(String title) {
        for (int idx = 0; idx < movies.length; idx++) {
            if (title.equals(movies[idx].getTitle())) {
                // return matched Movie
                return movies[idx];
            }
        }
        return null; // if not found
    }

    public MovieLibrary addMovie(Movie movie) {
        for (int idx = 0; idx < movies.length; idx++) {
            if (movie.getTitle().equals(movies[idx].getTitle())) {
                System.out.println("duplicate title");
                return this;
            }
        }

        // If no duplicate title found, add the movie
        if (numMovies < maxMovies) {
            movies[numMovies] = movie;
            numMovies += 1;
        } else {
            System.out.println("Library is full");
        }
        return this;
    }

    public MovieLibrary removeMovieByTitle(String title) {
        for (int idx = 0; idx < numMovies; idx++) {
            if (title.equals(movies[idx].getTitle())) {
                for (int j = idx; j < numMovies  - 1; j++) {
                    // Shift remaining movies to fill the gap
                    movies[j] = movies[j+1];
                }
                numMovies--;
                return this;
            }
        }
        // If movie not found, do nothing
        return this;
    }
}