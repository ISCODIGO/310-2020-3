package com.example.twitterclon.datos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

public class Usuario {
    UUID id;
    private String nombre;
    private String usuario;
    private String password;
    private String email;
    private String telefono;
    private LocalDate fechaNacimiento;
    private LocalDateTime fechaIngreso;
    private TipoVerificado verificado;
    private Pais pais;
    private ArrayList<String> seguidores;  // TODO: esta estructura podria aparte
    private ArrayList<String> seguidos;
    private ArrayList<Publicacion> publicaciones;

    public Usuario(String correo, String password) {
        this.id = UUID.randomUUID();
        this.email = correo;
        this.password = password;  // TODO: debe ser cifrado/hash
        this.usuario = this.email;
        this.nombre = this.email.split("@")[0];
        this.verificado = TipoVerificado.NINGUNO;
        this.fechaIngreso = LocalDateTime.now();  // TODO: es un dato del lado de cliente
        this.publicaciones = new ArrayList<>();
        this.seguidores = new ArrayList<>();
        this.seguidos = new ArrayList<>();
    }

    public void publicar(String comentario) {
        Publicacion publicacion = new Publicacion(this.usuario, comentario, null);
        publicaciones.add(publicacion);
    }

    public void darMeGusta(UUID id){

    }

    public void printPublicaciones() {
        for (Publicacion pub : this.publicaciones) {
            System.out.println(pub);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Usuario usuario1 = new Usuario("javila@unah.edu", "1234");
        usuario1.publicar("Bonito sabado para ir a clases");

        Thread.sleep(5000);

        usuario1.publicar("Estoy en la UNAH...");

        usuario1.printPublicaciones();

    }
}
