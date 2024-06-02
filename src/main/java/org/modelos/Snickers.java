package org.modelos;

/**Cumple la función de representar un snickers */
public class Snickers extends Dulce {
    /**
     * Constructor de la clase Snickers.
     * @param serie Número de serie del snickers.
     */
    public Snickers(int serie) {
        super(serie);
    }

    @Override
    /**
     *  @Return Retorna que se ha consumido un snickers
     *
     */
    public String consumir() {
        return "Snickers";
    }
}
