package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.event.EventHandler;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class CanvasController implements Initializable {
    @FXML
    Canvas canvas;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        GraphicsContext graphicsContext2D = canvas.getGraphicsContext2D();

        // Crear un rectangulo rojo
        graphicsContext2D.setFill(Color.valueOf("#ff0000"));
        graphicsContext2D.fillRect(100, 100, 200, 200);

        // Crear un rectangulo azul
        graphicsContext2D.setStroke(Color.valueOf("#0000ff"));
        graphicsContext2D.strokeRect(200, 200, 200, 200);

        graphicsContext2D.setStroke(Color.valueOf("#35ed0c"));
        graphicsContext2D.strokeOval(100, 100, 300, 300);

        graphicsContext2D.setStroke(Color.BLACK);
        graphicsContext2D.strokeLine(100, 100, 400, 400);

        graphicsContext2D.setFill(Color.BLACK);
        graphicsContext2D.fillPolygon(
                new double[] {0, 100, 200, 100, 0},
                new double[] {200, 100, 100, 200, 200},
                4
        );
        canvas.setOnMousePressed( evt -> {
            GraphicsContext g = canvas.getGraphicsContext2D();
            double red = evt.getY() / canvas.getHeight();
            double blue = evt.getX() / canvas.getWidth();
            double green = Math.random();
            if (evt.isShiftDown()) {
                g.setFill(Color.color(red, green, blue));
                g.fillOval(evt.getX(), evt.getY(), 60, 30);
            } else {
                g.setFill(Color.color(red, green, blue));
                g.fillRect(evt.getX(), evt.getY(), 60, 30);
            }
        });
    }
}
