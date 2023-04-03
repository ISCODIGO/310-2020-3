/*
Se estableceran coordenadas dentro del atributo ID de cada Button para los
botones del tipo: columna,fila. Por ejemplo: Si el boton tiene un ID: 0,1
significa que esta en la posicion columna=0 y fila=1.

 */
package com.example.tresillo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.Arrays;
import java.util.Random;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    /**
     * Atributo para indicar que figura se escribe: si es true sera Equis y false Cero.
     */
    private boolean escribirX;

    /**
     * Arreglo que moldea a nivel de datos el tablero. Nos permite determinar si ya hay un ganador o no.
     */
    private String[][] tablero;

    /**
     * Enum que permite establecer el estado actual del juego.
     */
    private Estado estado;

    /**
     * Etiqueta que muestra informacion relevante del juego.
     */
    @FXML
    private Label info;

    /**
     * Funcion que indica si el String ya ha sido utilizado en el juego
     * @param s String a comprobar
     * @return si el String es valido: true
     */
    private boolean esValido(String s) {
        if (s == null) return false;
        return s.equals("X") || s.equals("0");
    }

    /**
     * Cambio un estado cuando hay una victoria, indicando quien ganó.
     * @param s String a revisar
     */
    private void setEstadoGanador(String s) {
        if (s.equals("X")) estado = Estado.EQUIS;
        if (s.equals("0")) estado = Estado.CERO;
    }

    /**
     * Revisar si hay un ganador de forma horizontal
     * @param fila Valor de la fila a verificar
     */
    private void setGanadorHorizontal(int fila) {
        if (esValido(tablero[fila][0])
                && tablero[fila][0].equals(tablero[fila][1])
                && tablero[fila][0].equals(tablero[fila][2])) {
            setEstadoGanador(tablero[fila][0]);
        }
    }

    /**
     * Revisar si hay un ganador de forma vertical
     * @param columna Valor de la columna a revisar
     */
    private void setGanadorVertical(int columna) {
        if (esValido(tablero[0][columna])
                && tablero[0][columna].equals(tablero[1][columna])
                && tablero[0][columna].equals(tablero[2][columna])) {
            setEstadoGanador(tablero[0][columna]);
        }
    }

    /**
     * Detecta si hay un ganador en el juego modificando el estado PENDIENTE
     */
    private void setEstado() {
        for (int i = 0; i < 3; i++) {
            if (estado.equals(Estado.PENDIENTE)) setGanadorVertical(i);
            if (estado.equals(Estado.PENDIENTE)) setGanadorHorizontal(i);
        }

        // TODO: Detectar cuando se gana en diagonal
        // TODO: Detectar un empate
    }

    /**
     * Modifica el tablero segun las coordenadas que indica el Button con la figura correspondiente.
     * @param id Identificador: coordenada de columna y fila
     * @param texto Figura del juego: equis o cero
     */
    private void setTablero(String id, String texto) {
        String[] coordenadas = id.split(",");
        System.out.println(Arrays.toString(coordenadas));
        int columna = Integer.parseInt(coordenadas[0]);
        int fila = Integer.parseInt(coordenadas[1]);
        tablero[fila][columna] = texto;

        System.out.println(Arrays.deepToString(tablero));
    }


    /**
     * Evento de Button click
     * @param event Objeto del evento
     */
    @FXML
    protected void onButtonClick(ActionEvent event) {
        Button btn = (Button) event.getSource();  // castear el Object a Button

        // solamente si el estado es pendiente puede seguir jugando
        if (estado != Estado.PENDIENTE) {
            return;
        }

        if (escribirX) {
            btn.setText("X");
        } else {
            btn.setText("0");
        }

        escribirX = !escribirX;  // ocurre un switch para intercambiar la figura
        btn.setDisable(true);  // desactiva el Button para evitar que se haga clic de nuevo
        setTablero(btn.getId(), btn.getText());  // modifica el tablero segun el boton y figura
        setEstado();  // intenta modificar el estado del juego (saber si ha concluido o no)
        info.setText("Estado: " + estado);
    }

    /**
     * Evento que ocurre al arrancar la vista
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tablero = new String[3][3];
        estado = Estado.PENDIENTE;

        // sortear que figura inicia
        Random random = new Random();
        escribirX = random.nextInt(0, 2) == 1;  // si es true inicia con X, false inicia con 0
        info.setText("Inicia... " + (escribirX ? "X" : "0"));
    }

    public void onButtonClearClick() {
        // TODO: Establecer el evento para reiniciar el juego
    }
}