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
    private AnchorPane anchorPane;

    GraphicsContext g;
    Canvas canvas;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        canvas = new Canvas(300, 300);
        anchorPane = new AnchorPane(canvas);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill( Color.BLUE );
        gc.fillRect(0, 0, 100, 100);
    }

    @FXML
    public void mouseClick(MouseEvent evt) {
        System.out.printf("x=%f, y=%f%n", evt.getX(), evt.getY());

        System.out.println("Mouse clicked");
        /*if ( evt.isShiftDown() ) {
            System.out.println("blue");
            g.setFill( Color.BLUE );
            g.fillOval( evt.getX() - 30, evt.getY() - 15, 60, 30 );
        }
        else {
            System.out.println("red");
            g.setFill( Color.RED );
            g.fillRect( evt.getX() - 30, evt.getY() - 15, 60, 30 );
        }*/
    }
}
