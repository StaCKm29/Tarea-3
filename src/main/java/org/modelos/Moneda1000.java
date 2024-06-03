package org.modelos;

/**
 * Moneda que representa una moneda de valor 1000
 */

public class Moneda1000 extends Moneda{

    /**
     * Constructor de la clase Moneda1000
     * @param serie Número de serie de la moneda
     */
    public Moneda1000(int serie){
        super(serie);
    }

    /**
     *
     * @return Retorna un valor de 1000
     */
    public int getValor() {
        return 1000;
    }

}
