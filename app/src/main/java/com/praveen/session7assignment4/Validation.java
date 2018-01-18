package com.praveen.session7assignment4;


public class Validation {

    String username, password;
    public Validation(String username, String password)
    {
        this.username=username;
        this.password=password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isUsernameEmpty(){
        return username.equals("");
    }

    public boolean isPasswordEmpty(){
        return password.equals("");
    }

    public boolean checkCredentials(String storedUsername, String storedPassword){
        return (username.equalsIgnoreCase(storedUsername) && password.equals(storedPassword));
    }

}
