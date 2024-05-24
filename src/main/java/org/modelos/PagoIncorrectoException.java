package org.modelos;

public class PagoIncorrectoException extends Exception{
    public PagoIncorrectoException(String mensaje){
        super(mensaje);
    }
}
