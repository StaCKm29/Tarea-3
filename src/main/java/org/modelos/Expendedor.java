package org.modelos;

public class Expendedor {
    public Producto comprarProducto (int pago, Selector eleccion) throws NoHayProductoException, PagoInsuficienteException{
        int i = eleccion.ordinal();
        if(pago < eleccion.getprecio()){
            throw new PagoInsuficienteException("El pago es insuficiente.");
        }
        if(depositos[eleccion.ordinal()].isEmpty()){
            throw new NoHayProductoException("No hay producto." + eleccion.toString().toLowerCase());
        }
        return depositos[i].remove(depositos[i].size()-1);
    }
}
