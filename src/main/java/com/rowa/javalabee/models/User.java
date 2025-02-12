package com.rowa.javalabee.models;

public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private Long roleId;
    private Role role;

    public User() {
    }

    public User(String firstName, String lastName, String phone,
                String email, Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        setRole(role);
    }

    public User(Long id, String firstName, String lastName, String phone,
                String email, Role role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        setRole(role);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
        this.roleId = (role != null) ? role.getId() : null;
    }

    public boolean canEditMovies() {
        return role != null && role.getCanEditMovies();
    }

    @Override
    public String toString() {
        return "User {" +
                "Id = " + id +
                ", First Name = '" + firstName + '\'' +
                ", Last Name = '" + lastName + '\'' +
                ", Phone = '" + phone + '\'' +
                ", Email = '" + email + '\'' +
                ", Role = '" + (role != null ? role.getName() : "None") + '\'' +
                ", Can Edit Movies = " + canEditMovies() +
                '}';
    }
}

