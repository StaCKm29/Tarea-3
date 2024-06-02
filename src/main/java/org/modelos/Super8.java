package org.modelos;

/**Cumple la función de representar un Super8 */
public class Super8 extends Dulce{
    /**
     * Constructor de la clase Super8
     * @param serie Número de serie del Super8.
     */
    public Super8(int serie) {
        super(serie);
    }

    @Override
    /**
     * Retorna que se ha consumido un super8
     */
    public String consumir() {
        return "Super8";
    }
}

