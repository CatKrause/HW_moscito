package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ManagerFilmsTest {

    @Test
    public void DefaultLimit() {
        ManagerFilms manager = new ManagerFilms();
        manager.addNewMovie("Movie 1");
        manager.addNewMovie("Movie 2");
        manager.addNewMovie("Movie 3");

        String[] expected = {"Movie 1", "Movie 2", "Movie 3"};
        assertArrayEquals(expected, manager.findAll());
    }

    @Test
    public void CustomLimit() {
        ManagerFilms manager = new ManagerFilms(3);
        manager.addNewMovie("Movie 1");
        manager.addNewMovie("Movie 2");
        manager.addNewMovie("Movie 3");
        manager.addNewMovie("Movie 4");

        String[] expected = {"Movie 4", "Movie 3", "Movie 2"};
        assertArrayEquals(expected, manager.findLast());
    }

    @Test
    public void FindAllEmpty() {
        ManagerFilms manager = new ManagerFilms();
        String[] expected = {};
        assertArrayEquals(expected, manager.findAll());
    }

    @Test
    public void FindLastEmpty() {
        ManagerFilms manager = new ManagerFilms();
        String[] expected = {};
        assertArrayEquals(expected, manager.findLast());
    }

    @Test
    public void FindLastLessThanLimit() {
        ManagerFilms manager = new ManagerFilms(10);
        manager.addNewMovie("Movie 1");
        manager.addNewMovie("Movie 2");

        String[] expected = {"Movie 2", "Movie 1"};
        assertArrayEquals(expected, manager.findLast());
    }
}
