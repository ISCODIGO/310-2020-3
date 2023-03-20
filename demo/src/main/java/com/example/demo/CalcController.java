package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class CalcController {
    @FXML
    private TextField operando1;
    @FXML
    private TextField operando2;
    @FXML
    private Label resultado;
    double valor1;
    double valor2;
    double res;

    private void convertirTextFieldEnDoble() {
        valor1 = Double.parseDouble(operando1.getText());
        valor2 = Double.parseDouble(operando2.getText());
    }
    @FXML
    protected void sumar() {
        convertirTextFieldEnDoble();
        res = valor1 + valor2;
        resultado.setText(String.valueOf(res));
    }

    @FXML
    protected void restar() {
        convertirTextFieldEnDoble();
        res = valor1 - valor2;
        resultado.setText("" + res);
    }
}
