package org.modelos;

/**
 * Sirve como plantilla para representar a los productos que se venderán en el expendedor
 */
public abstract class Producto {
    protected int serie;

    /**
     * Constructor de la clase Producto.
     * @param serie Número de serie del producto.
     */
    public Producto(int serie){
        this.serie = serie;
    }

    /**
     * Método que regresa el número de serie de un producto.
     * @return Retorna el número de serie de un producto
     */
    public int getSerie() {
        return serie;
    }

    /**
     * Método que regresa el nombre del producto.
     * @return Retorna qué producto se ha consumido
     */
    public abstract String consumir();
}
