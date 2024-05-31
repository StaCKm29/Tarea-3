package org.vistas;

import org.modelos.Producto;

public class ProductoHolder {
    private Producto productoActual;
    public ProductoHolder(Producto producto) {
        this.productoActual = producto;
    }
    public void setProductoActual(Producto productoAlternativo) {
        this.productoActual = productoAlternativo;
    }
    public Producto getProductoActual() {
        return productoActual;
    }

}
