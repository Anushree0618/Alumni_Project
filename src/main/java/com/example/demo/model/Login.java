package com.example.demo.model;



public class Login {
    private int userId;
    private String username;
    private String password;
    private String email;
    private String contact;
    private String logintype; // ADMIN or STUDENT

    // Getters & Setters
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }

    public String getLogintype() { return logintype; }
    public void setLogintype(String logintype) { this.logintype = logintype; }
}
