package com.example.t1_2072051;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class no1Controller {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}