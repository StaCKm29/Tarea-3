package org.modelos;

import java.util.ArrayList;

public class Expendedor {
    ArrayList<Producto>[] depositos;

    public Expendedor(int size){
        depositos = new ArrayList[Selector.values().length];
        for(Selector p : Selector.values()){
            depositos[p.ordinal()] = new ArrayList<Producto>();
            for(int i = 0; i < size; i++){
                depositos[p.ordinal()].add(p.crearProducto(i));
            }
        }
    }
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
