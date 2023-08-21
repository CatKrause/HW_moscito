package ru.netology.statistic;

public class ManagerFilms {
    private String[] movies = new String[0];
    private int limited;


    public ManagerFilms() {
        this.limited = 5;
    }

    public ManagerFilms(int limited) {
        this.limited = limited;
    }

    public void AddNewMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[movies.length] = movie;
        this.movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (movies.length < 5) {
            resultLength = movies.length;
        } else {
            resultLength = 5;
        }
        String[] result = new String[resultLength];

        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[movies.length - resultLength + i];
        }

        return result;
    }
}






