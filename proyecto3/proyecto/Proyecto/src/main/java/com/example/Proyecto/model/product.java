package com.example.Proyecto.model;

import javax.persistence.*;

/**
 * La clase product crea los valores que serán usados para la base de datos y los valores
 * de que posee cada atributo y métodos para editar sus valores.
 * @autor Sebastián Cisternas
 *
 */

@Entity
/**
 * Las siguientes líneas se centran en crear atributos de una forma similar a la vista
 * en mysql, estas líneas pueden modificar valores de las clases en términos de base de datos.
 */
public class product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_producto", nullable = false)
    private int codigoProducto;

    @Column(name = "product_name", nullable = false, length = 50)
    private String ProductName;

    @Column(name = "price", nullable = false, length = 50)
    private int Price;

    @Column(name = "product_picture", columnDefinition = "TEXT")
    private String product_picture;

    @Column(name = "marca",nullable = false)
    private String marca;

    @Column(name = "descripcion",nullable = false)
    private String descripcion;


    public product() {
    }

    public product(int codigoProducto, String productName, int price, String product_picture, String marca, String descripcion) {
        this.codigoProducto = codigoProducto;
        this.ProductName = productName;
        this.Price = price;
        this.product_picture = product_picture;
        this.marca = marca;
        this.descripcion=descripcion;

    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getProduct_picture() {
        return product_picture;
    }

    public void setProduct_picture(String product_picture) {
        this.product_picture = product_picture;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
