package org.modelos;

/**
 * Moneda que representa una moneda de valor 500
 */
public class Moneda500 extends Moneda{

    /**
     * Constructor de la clase Moneda500
     * @param serie Número de serie de la moneda
     */
    public Moneda500(int serie){
        super(serie);
    }

    /**
     *
     * @return Retorna un valor de 500
     */
    public int getValor() {
        return 500;
    }

}
