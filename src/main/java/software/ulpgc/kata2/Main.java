package software.ulpgc.kata2;

import software.ulpgc.kata2.io.RemoteMovieLoader;
import software.ulpgc.kata2.model.Movie;

import java.util.List;

public class Main {
    static void main() {
        List<Movie> movies = new RemoteMovieLoader().loadAll();
        System.out.println(movies.size());
    }
}
