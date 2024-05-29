package org.modelos;

/**Es una plantilla para las monedas*/
public abstract class Moneda{
    int serie;
    public Moneda(int serie){
        this.serie = serie;
    }
    /** Método para obotener  el valor de las monedas */
    public abstract int getValor();

    public int getSerie(){
        return serie;
    }
}
