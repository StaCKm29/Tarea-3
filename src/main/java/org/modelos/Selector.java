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

    Selector(int precio){
        this.precio = precio;
    }

    public int getprecio(){
        return precio;
    }

    public abstract Producto crearProducto(int serie);
}



