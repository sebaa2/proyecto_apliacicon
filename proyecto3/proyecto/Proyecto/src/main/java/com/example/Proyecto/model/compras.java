package com.example.Proyecto.model;


import javax.persistence.*;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.util.Locale;

/**
 * Clase centrada en entregar un registro de la compra de un producto en la aplicación.
 * @autor Sebastián Cisternas
 */

@Entity
public class compras {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "precio", nullable = false)
    private int precio;

    @Column(name = "compra_fecha")
    private Timestamp comprafecha;


    @Column(name = "rut", nullable = false)
    private int rut;


    @Column(name = "codigo_producto", nullable = false)
    private int codigoProducto;


    public compras() {

    }

    public compras(int id, int precio, Timestamp comprafecha, int rut, int codigoProducto) {

        this.id = id;
        this.precio = precio;
        this.comprafecha = comprafecha;
        this.rut = rut;
        this.codigoProducto = codigoProducto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Timestamp getComprafecha() {
        return comprafecha;
    }

    /**
     * El siguiente método está centrado en entregarnos al momento de una compra la fecha
     * de la compra, usando la actual zona horaria chilena junto a al idioma
     * @return la fecha de la compra realizada
     */

    public String getFormatDate() {
        return DateFormat
                .getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT, new Locale("es", "CL"))
                .format(getComprafecha());
    }

    public void setComprafecha(Timestamp comprafecha) {
        this.comprafecha = comprafecha;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }
}
