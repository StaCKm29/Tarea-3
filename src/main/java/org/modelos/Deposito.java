package org.modelos;

import java.util.ArrayList;

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

    public int size() {
        return almacen.size();
    }
}
