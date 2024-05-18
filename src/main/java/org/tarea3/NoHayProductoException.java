package org.tarea3;

public class NoHayProductoException extends Exception{
    public NoHayProductoException(String mensaje){
        super(mensaje);
    }
}
