package com.example.javafxmlassignment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class FormController {
    @FXML
    public TextField emailField = new TextField();

    @FXML
    public PasswordField passwordField = new PasswordField();

    @FXML
    public Button registerButton = new Button("Register");

    @FXML
    public Label responseLabel;
    public void register() {
        User user = new User(emailField.getText(), passwordField.getText());
        if(user.checkEmail() & user.checkPassword()) {
            responseLabel.setText("User registered successfully");
        }
        else{
            responseLabel.setText("Please enter a valid email and password");
            }
    }
}