package org.modelos;

/**
 * Excepción que maneja el caso en que no esté el producto solicitado en la expendedora
 */
public class NoHayProductoException extends Exception{
    public NoHayProductoException(String errorMessage){
        super(errorMessage);
    }
}
