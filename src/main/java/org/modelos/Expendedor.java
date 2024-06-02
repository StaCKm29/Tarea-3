package org.modelos;

import java.util.ArrayList;

public class Expendedor {
    private Deposito <Producto> coca;
    private Deposito <Producto> sprite;
    private Deposito <Producto> fanta;
    private Deposito <Producto> snickers;
    private Deposito <Producto> super8;
    private Deposito <Producto> alfajores;
    private ArrayList <Deposito<Producto>> depositos;
    private Deposito<Moneda> monedaPago;
    private int c = 100;
    private int size;

    private Deposito<Moneda> monedaVuelto;
    private Producto producto; //Será el producto que se retornará

    public Expendedor(int size){
        this.size = size;
        coca = new Deposito<>();
        sprite = new Deposito<>();
        fanta = new Deposito<>();
        snickers = new Deposito<>();
        super8 = new Deposito<>();
        alfajores = new Deposito<>();
        depositos = new ArrayList<>();
        monedaPago = new Deposito<>();
        monedaVuelto = new Deposito<>();

        depositos.add(coca);
        depositos.add(sprite);
        depositos.add(fanta);
        depositos.add(snickers);
        depositos.add(super8);
        depositos.add(alfajores);

        for(Selector p : Selector.values()){
            for(int i = 0; i < size; i++){
                Producto producto = p.crearProducto(i+c);
                depositos.get(p.ordinal()).addObjeto(producto);
            }
            c+= 100;
        }

    }

    public void rellenarDepositos() {
        System.out.println("Rellenando depositos...");
        if (coca.size() < size) {
            for (int i = coca.size(); i < size; i++) {
                Producto producto = Selector.COCACOLA.crearProducto(i+c);
                coca.addObjeto(producto);
                c++;
            }
        }
        if (sprite.size() < size) {
            for (int i = sprite.size(); i < size; i++) {
                Producto producto = Selector.SPRITE.crearProducto(i+c);
                sprite.addObjeto(producto);
                c++;
            }
        }
        if (fanta.size() < size) {
            for (int i = fanta.size(); i < size; i++) {
                Producto producto = Selector.FANTA.crearProducto(i+c);
                fanta.addObjeto(producto);
                c++;
            }
        }
        if (snickers.size() < size) {
            for (int i = snickers.size(); i < size; i++) {
                Producto producto = Selector.SNICKERS.crearProducto(i+c);
                snickers.addObjeto(producto);
                c++;
            }
        }
        if (super8.size() < size) {
            for (int i = super8.size(); i < size; i++) {
                Producto producto = Selector.SUPER8.crearProducto(i+c);
                super8.addObjeto(producto);
                c++;
            }
        }
        if (alfajores.size() < size) {
            for (int i = alfajores.size(); i < size; i++) {
                Producto producto = Selector.ALFAJOR.crearProducto(i+c);
                alfajores.addObjeto(producto);
                c++;
            }
        }
    }

    public void comprarProducto (Moneda pago, Selector eleccion) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException{
        // Comprueba si 'eleccion' es null antes de llamar a 'ordinal()'
        int i = eleccion.ordinal();
        if(pago == null){
            throw new PagoIncorrectoException("El pago es incorrecto.");
        }
        if(pago.getValor() < eleccion.getprecio()){
            monedaVuelto.addObjeto(pago);
            throw new PagoInsuficienteException("El pago es insuficiente.");
        }
        if( depositos.get(eleccion.ordinal()).isEmpty() ){
            monedaVuelto.addObjeto(pago);
            throw new NoHayProductoException("No hay producto." + eleccion.toString().toLowerCase());
        }
        int vuelto = (pago.getValor() - eleccion.getprecio())/100;
        for(int j = 0; j < vuelto; j++){
            monedaVuelto.addObjeto(new Moneda100(j+1));
        }
        producto = depositos.get(i).getObjeto();
        monedaPago.addObjeto(pago);
    }


    public Producto getProducto() {
        return producto;
    }

    public Moneda getVuelto() {
        Moneda m = monedaVuelto.getObjeto();
        return m;
    }
}
