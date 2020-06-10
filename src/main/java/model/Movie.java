package model;

public class Movie {
    String title;
    private String director;
    private int year;

    public Movie(String title, String director, int year) {
        this.title = title;
        this.director = director;
        this.year = year;
    }

    public String title() {
        return title;
    }

    public String director() {
        return director;
    }

    public int releaseYear() {
        return year;
    }
}
