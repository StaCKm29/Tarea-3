package org.modelos;

import java.util.ArrayList;

public class Expendedor {
    private ArrayList<Producto>[] depositos;
    private Deposito<Moneda> monedaVuelto;
    private Producto producto;
    private Deposito<Moneda> monedasPago;

    public Expendedor(int size){
        depositos = new ArrayList[Selector.values().length];
        monedaVuelto = new Deposito<>();
        for(Selector p : Selector.values()){
            depositos[p.ordinal()] = new ArrayList<Producto>();
            for(int i = 0; i < size; i++){
                depositos[p.ordinal()].add(p.crearProducto(i));
            }
        }
    }

    public void comprarProducto (Moneda pago, Selector eleccion) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException{
        int i = eleccion.ordinal();
        if(pago == null){
            throw new PagoIncorrectoException("El pago es incorrecto.");
        }
        if(pago.getValor() < eleccion.getprecio()){
            throw new PagoInsuficienteException("El pago es insuficiente.");
        }
        if(depositos[eleccion.ordinal()].isEmpty()){
            throw new NoHayProductoException("No hay producto." + eleccion.toString().toLowerCase());
        }
        monedasPago.addObjeto(pago);
        producto = depositos[i].remove(depositos[i].size()-1);
    }

    public Producto getProducto(){
        return producto;
    }

    public Moneda getVuelto() {
        Moneda m = monedaVuelto.getObjeto();
        return m;
    }
}
