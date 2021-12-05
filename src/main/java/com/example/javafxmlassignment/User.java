package com.example.javafxmlassignment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private final String email;
    private final String password;


    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }
    public String getPassword() {
        return this.password;
    }
    public boolean checkEmail(){
        final Pattern VALID_EMAIL_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = VALID_EMAIL_REGEX.matcher(this.email);
        return matcher.find();
    }

    public boolean checkLength(){
        return this.password.length() >= 7;
    }

    public boolean checkDigit(){
        final Pattern digits = Pattern.compile("[\\d]");
        Matcher matcher = digits.matcher(this.password);
        return matcher.find();
    }

    public boolean checkLetter(){
        final Pattern letters = Pattern.compile("[a-zA-Z]");
        Matcher matcher = letters.matcher(this.password);
        return matcher.find();
    }

    public boolean checkCharacters(){
        final Pattern characters = Pattern.compile("[*^&@!]");
        Matcher matcher = characters.matcher(this.password);
        return matcher.find();
    }

    public boolean checkPassword(){
        return this.checkLength() & this.checkDigit() & this.checkLetter() & this.checkCharacters();
    }
}