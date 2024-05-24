package org.modelos;

/**
 * Excepción que maneja el caso en el que la moneda ingresada es nula
 */
public class PagoIncorrectoException extends Exception{
    public PagoIncorrectoException(String errorMessage){
        super(errorMessage);
    }
}
