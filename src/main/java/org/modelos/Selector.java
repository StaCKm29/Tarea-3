package org.modelos;

/** Enumerador de productos con sus respectivos precios y métodos para crearlos */
public enum Selector {
    COCACOLA(1200){
        @Override
        public Producto crearProducto(int serie){
            return new Cocacola(serie);
        }
    },
    FANTA(1200){
        @Override
        public Producto crearProducto(int serie){
            return new Fanta(serie);
        }
    },
    SPRITE(1200){
        @Override
        public Producto crearProducto(int serie){
            return new Sprite(serie);
        }
    },
    SNICKERS(1500){
        @Override
        public Producto crearProducto(int serie){
            return new Snickers(serie);
        }
    },
    SUPER8(300){
        @Override
        public Producto crearProducto(int serie){
            return new Super8(serie);
        }
    },
    ALFAJOR(600){
        @Override
        public Producto crearProducto(int serie){
            return new Alfajor(serie);
        }
    };
    private final int precio;

    /**
     * Constructor de la clase Selector
     * @param precio Precio del producto
     */
    Selector(int precio){
        this.precio = precio;
    }

    /**
     * Método que regresa el precio de un producto.
     * @return Retorna el precio de un producto
     */
    public int getprecio(){
        return precio;
    }

    /**
     * Método que crea un producto.
     * @param serie Número de serie del producto.
     * @return Retorna un producto
     */
    public abstract Producto crearProducto(int serie);
}



