package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PruebaController {
    int clics = 0;
    @FXML
    private Label welcomeText;
    @FXML
    private Button boton2;

    @FXML
    protected void clickButton() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void segundoEvento() {
        clics++;
        boton2.setText("Clics: " + clics);
    }

    @FXML
    protected void tercerEvento() {
        clics = 0;
        boton2.setText("Clics: " + clics);
    }
}