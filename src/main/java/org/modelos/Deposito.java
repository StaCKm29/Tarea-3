package org.modelos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Deposito<T> {

    private ArrayList<T> almacen;
    public Deposito() {
        almacen = new ArrayList<T>();
    }

    public void addObjeto(T objeto) {
        almacen.add(objeto);
    }

    public T getObjeto() {
        if(almacen.isEmpty()){
            return null;
        }else{
            return almacen.remove(0);
        }
    }
    public boolean isEmpty(){
        return almacen.isEmpty();
    }

    public void ordenar(Moneda moneda){
        if(moneda instanceof Moneda){
            almacen.sort(Comparator.comparingInt(Moneda::getValor));
        }
        else{
            throw new IllegalArgumentException("No es una moneda");
        }
    }

    public int size() {
        return almacen.size();
    }
}
