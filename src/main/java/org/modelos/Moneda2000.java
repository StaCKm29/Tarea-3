package org.modelos;

/** Moneda de 2000 */
public class Moneda2000 extends Moneda{

    /**
     * Constructor de la moneda de 2000.
     * @param serie Serie de la moneda.
     */
    public Moneda2000(int serie){
        super(serie);
    }

    /**
     * Obtiene el valor de la moneda.
     * @return Valor de la moneda.
     */
    @Override
    public int getValor() {
        return 2000;
    }

}
