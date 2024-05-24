package org.modelos;

/**
 * Excepción que maneja el caso en que el pago sea insuficiente
 */
public class PagoInsuficienteException extends Exception{
    public PagoInsuficienteException(String errorMessage){
        super(errorMessage);
    }
}
