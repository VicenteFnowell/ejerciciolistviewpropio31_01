package com.example.ejerciciolistviewpropio31_01;

/**
 * Created by Vicente FN on 31/01/2018.
 */

public class Personaje {

    //Atributos
    String imagen;
    String actor;
    String personaje;
    String descripcion;

    //Constructor

    public Personaje(String imagen, String actor, String personaje, String descripcion) {
        this.imagen = imagen;
        this.actor = actor;
        this.personaje = personaje;
        this.descripcion = descripcion;


    }


    // Getter y Setter


    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }




}//FIN CLASE
