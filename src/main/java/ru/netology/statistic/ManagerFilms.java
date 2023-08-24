package ru.netology.statistic;

public class ManagerFilms {
    private String[] movies;
    private int limit;

    public ManagerFilms() {
        this.limit = 5;
        this.movies = new String[0];
    }

    public ManagerFilms(int limit) {
        this.limit = limit;
        this.movies = new String[0];
    }

    public void addNewMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        this.movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength = Math.min(limit, movies.length);
        String[] tmp = new String[resultLength];

        for (int i = 0; i < resultLength; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }

        return tmp;
    }

}








