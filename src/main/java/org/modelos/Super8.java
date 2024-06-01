package org.modelos;

/**Cumple la función de representar un Super8 */
public class Super8 extends Dulce{
    /**
     *
     * @param serie
     */
    public Super8(int serie) {
        super(serie);
    }

    @Override
    /**
     * Retorna que se ha consumido un super8
     */
    public String consumir() {
        return "Super8" + this.getSerie();
    }
}

