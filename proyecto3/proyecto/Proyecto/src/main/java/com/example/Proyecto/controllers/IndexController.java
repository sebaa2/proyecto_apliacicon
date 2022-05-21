package com.example.Proyecto.controllers;

import com.example.Proyecto.model.product;
import com.example.Proyecto.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    /**
     * Clase enfocada en la parte HTML de nuestro proyecto
     * @autor Sebastián Cisternas
     */

    @Autowired
    ProductRepository productRepository;

    /**
     * Esta clase se centra en poder dar acceso a la página de inicio y a la vez poder volver
     * a esta misma desde cualquier vista.
     * @return poder acceder a la página de inicio.
     */
    @RequestMapping("/")
    public String main(Model model){

        Iterable<product> productos = productRepository.findAll();
        model.addAttribute("productos",productos);

        return "indexT";
    }

    /**
     * Este método está centrado en poder acceder a la clase login del HTML usando código de java.
     * @return acceso al login.
     */
    @GetMapping("/login")
    public String login(){

        return "login";
    }

    /**
     * Este método al igual que login da acceso a una clase modelada en HTML pero enfocado en la vista
     * de un producto modelado con us clase respectiva en HTML.
     * @return ver la página de un producto.
     */
    @GetMapping("/vistaPagina")
    public String vistaProducto () {


        return "vistaPagina";
    }

    /**
     * Este método se enfoca en mostrar una vista donde se nos muestra una lista de productos que la página
     * tiene a su disposición.
     * @return lista de productos mostrado por la página.
     */
    @GetMapping("/listaProductos")
    public String listaProductos ()  {


        return "listaProductos";

    }



}
