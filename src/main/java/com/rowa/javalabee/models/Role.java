package com.rowa.javalabee.models;

public class Role {
    private Long id;
    private String name;
    private boolean canEditMovies;

    public Role() {
    }

    public Role(String name, boolean canEditMovies) {
        this.name = name;
        this.canEditMovies = canEditMovies;
    }

    public Role(Long id, String name, boolean canEditMovies) {
        this.id = id;
        this.name = name;
        this.canEditMovies = canEditMovies;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean canEditMovies() {
        return canEditMovies;
    }

    public void setCanEditMovies(boolean canEditMovies) {
        this.canEditMovies = canEditMovies;
    }

    @Override
    public String toString() {
        return "Role {" +
                "Id = " + id +
                ", Name = '" + name + '\'' +
                ", Can Edit Movies = " + canEditMovies +
                '}';
    }
}
