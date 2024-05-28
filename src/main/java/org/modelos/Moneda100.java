package org.modelos;

/**
 * Moneda que representa una moneda de valor 100. Estas monedas serán utilizadas para el vuelto
 */
class Moneda100 extends Moneda{

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
