package org.modelos;

import java.util.ArrayList;
/**
 * Clase que representa un depósito de objetos de tipo genérico T.
 * @param <T> Tipo de objeto que se almacenará en el depósito.
 */
public class Deposito<T> {
    private ArrayList<T> almacen;

    public Deposito() {
        almacen = new ArrayList<T>();
    }

    /**
     * Método que añade un objeto al depósito.
     * @param objeto Objeto a añadir.
     */
    public void addObjeto(T objeto) {
        almacen.add(objeto);
    }

    /**
     * Método que devuelve el primer objeto almacenado en el depósito.
     * @return Objeto almacenado.
     */
    public T getObjeto() {
        if(almacen.isEmpty()){
            return null;
        }else{
            return almacen.remove(0);
        }
    }

    /**
     * Método que devuelve si el depósito está vacío.
     * @return True si el depósito está vacío, false en caso contrario.
     */
    public boolean isEmpty(){
        return almacen.isEmpty();
    }

    /**
     * Método que devuelve el número de objetos almacenados en el depósito.
     * @return Número de objetos almacenados.
     */
    public int size() {
        return almacen.size();
    }
}
