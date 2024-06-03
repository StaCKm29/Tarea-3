package org.modelos;

/**
 * Moneda que representa una moneda de valor 100. Estas monedas serán utilizadas para el vuelto
 */
public class Moneda100 extends Moneda{

    /**
     * Constructor de la clase Moneda100
     * @param serie Número de serie de la moneda
     */
    public Moneda100(int serie){
        super(serie);
    }

    /**
     *
     * @return retorna un valor de 100
     */
    public int getValor() {
        return 100;
    }

}
