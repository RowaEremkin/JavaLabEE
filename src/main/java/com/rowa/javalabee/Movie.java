package com.rowa.javalabee;

public class Movie {
    private Long id;
    private String title;
    private String genre;
    private int releaseYear;

    public Movie() {
    }

    public Movie(String title) {
        this.title = title;
    }

    public Movie(Long id, String title, String genre, int releaseYear) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Movie {" +
                "Id = " + id +
                ", Title = '" + title + '\'' +
                ", Genre = '" + genre + '\'' +
                ", Release Year = " + releaseYear +
                '}';
    }
}
