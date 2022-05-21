package com.example.Proyecto.model;

import javax.persistence.*;


/**
 * Clase enfocada en la creación de la clase user en una base de datos
 * @autor Sebastián Cisternas
 */

@Entity
public class user {
    /**
     * Las líneas presentadas abajo serán usadas para crear esta clase en una base de datos.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rut", nullable = false)
    private int rut;

    @Column(name = "username", nullable = false, length = 50)
    private String username;

    @Column(name = "password", nullable = false,  length = 70)
    private String password;

    @Column(name= "Correo", nullable = false, length = 80)
    private String correo;



    public user() {

    }

    public user(String username, String password, String correo, int rut) {

        this.username = username;
        this.password = password;
        this.correo = correo;
        this.rut = rut;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }
}
