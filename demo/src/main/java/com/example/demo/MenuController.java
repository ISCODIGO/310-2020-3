package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {
    @FXML
    private VBox vbox;

    /**
     * Esta funcion permite obtener la ventana en la que esta un componente.
     * Luego modificamos la escena de esa ventana.
     * @param viewFile
     * @throws IOException
     */
    private void changeScene(String viewFile) throws IOException {
        Stage stage = (Stage) vbox.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(viewFile));
        Scene scene = new Scene(fxmlLoader.load(), 512, 512);
        stage.setScene(scene);
    }
    @FXML
    private void goPrimerPrueba() throws IOException {
        changeScene("prueba-view.fxml");
    }

    @FXML
    private void goCalculadoraV2() throws IOException {
        changeScene("calc-view.fxml");
    }

    @FXML
    private void goCanvas() throws IOException {
        changeScene("canvas-view.fxml");
    }
}
