package edu.pe.cibertec.saucedemo.ui;

public class CarritoPage {
    public static final String ICONO_CARRITO = ".shopping_cart_link";
    public static  final String CONTADOR_CARRITO = "[data-test='shopping-cart-badge']";
    public static final String NOMBRE_PRODUCTO_CARRITO = "[data-test='inventory-item-name']";

    public static String botonAgregar(String productName){
        String id = productName.toLowerCase().replace(" ","-");
        return "[data-test='add-to-cart-" + id + "']";
    }

    public static String botonEliminar(String productName) {
        String id = productName.toLowerCase().replace(" ", "-");
        return  "[data-test='remove-" + id + "']";
    }
}
