package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        drawStart(stage);
    }

    private void simpleStart(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("canvas-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 450, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    private void drawStart(Stage stage) throws IOException {
        final int WIDTH = 512;
        final int HEIGHT = 512;
        // Objeto Canvas
        Canvas canvas = new Canvas();
        canvas.setWidth(WIDTH);
        canvas.setHeight(HEIGHT);

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
            double red = evt.getY() / HEIGHT;
            double blue = evt.getX() / WIDTH;
            double green = Math.random();
            if (evt.isShiftDown()) {
                g.setFill(Color.color(red, green, blue));
                g.fillOval(evt.getX(), evt.getY(), 60, 30);
            } else {
                g.setFill(Color.color(red, green, blue));
                g.fillRect(evt.getX(), evt.getY(), 60, 30);
            }
        });

        VBox vbox = new VBox(canvas);
        Scene scene = new Scene(vbox);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}