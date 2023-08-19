package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerFilmsTest {
    @Test
    public void addNewMovieTest() {
        ManagerFilms manager = new ManagerFilms();

        String[] expected = new String[0];
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void searchForAllMovies() {
        ManagerFilms manager = new ManagerFilms();
        String[] expected = new String[0];
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastLessThan5Movies() {
        ManagerFilms manager = new ManagerFilms();

        manager.AddNewMovie("Movie 1");
        manager.AddNewMovie("Movie 2");
        manager.AddNewMovie("Movie 3");


        String[] expected = {"Movie 1", "Movie 2", "Movie 3"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void FindLastWithMoreThan5Movies() {
        ManagerFilms manager = new ManagerFilms();
        manager.AddNewMovie("Movie 1");
        manager.AddNewMovie("Movie 2");
        manager.AddNewMovie("Movie 3");
        manager.AddNewMovie("Movie 4");
        manager.AddNewMovie("Movie 5");
        manager.AddNewMovie("Movie 6");
        manager.AddNewMovie("Movie 7");

        String[] expected = {"Movie 3", "Movie 4", "Movie 5", "Movie 6", "Movie 7",};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void emptyList() {
        ManagerFilms manager = new ManagerFilms();
        String[] expected = new String[0];
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
