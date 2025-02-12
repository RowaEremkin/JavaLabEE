package com.rowa.javalabee.models;

public class Movie {
    private Long id;
    private String title;
    private String genre;
    private int releaseYear;
    private String description;
    private User addedBy;

    public Movie() {
    }

    public Movie(String title, User addedBy, String genre, int releaseYear, String description) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.description = description;
        this.addedBy = addedBy;
    }

    public Movie(Long id, String title, User addedBy, String genre, int releaseYear, String description) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.description = description;
        this.addedBy = addedBy;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(User addedBy) {
        this.addedBy = addedBy;
    }

    @Override
    public String toString() {
        return "Movie {" +
                "Id = " + id +
                ", Title = '" + title + '\'' +
                ", Genre = '" + genre + '\'' +
                ", Release Year = " + releaseYear +
                ", Description = '" + description + '\'' +
                ", Added By = '" + (addedBy != null ? addedBy.getFirstName() + " " + addedBy.getLastName() : "Unknown") + '\'' +
                '}';
    }
}
