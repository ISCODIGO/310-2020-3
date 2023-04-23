package com.example.twitterclon.datos;

import java.time.LocalDateTime;
import java.util.UUID;

public class Publicacion {
    private UUID id;
    private String comentario;
    private LocalDateTime fecha;  // Fecha de publicacion
    private String respuesta;  // ID de la publicacion a la que se responde

    // Estadisticos
    int meGusta;
    int republicacion;
    int compartido;
    String usuario;  // Este es el identificador

    public Publicacion(String usuario, String comentario, String respuesta) {
        this.id = UUID.randomUUID();
        this.usuario = usuario;
        this.comentario = comentario;
        this.respuesta = respuesta;
        this.fecha = LocalDateTime.now();  // TODO: este debe ser de una fuente confiable
        this.meGusta = 0;
        this.republicacion = 0;
        this.compartido = 0;
    }

    @Override
    public String toString() {
        return this.id + "\n" + this.comentario + "\n" + this.fecha.toString() + "\n" + this.usuario +
                "\n--------------------------------\n";
    }
}
