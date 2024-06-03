package org.modelos;

/**Es una plantilla para las monedas*/
public abstract class Moneda{
    protected int serie;

    /**
     * Constructor de la clase Moneda
     * @param serie Número de serie de la moneda
     */
    public Moneda(int serie){
        this.serie = serie;
    }

    /** Método para obotener  el valor de las monedas */
    public abstract int getValor();

    /**
     * Método para obtener el numero de serie de una moneda.
     * @return Número de serie de la moneda.
     */
    public int getSerie(){
        return serie;
    }
}
