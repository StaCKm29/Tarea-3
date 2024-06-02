package org.modelos;

/**Cumple la función de representar un alfajor. */
public class Alfajor extends Dulce{
    /**
     *
     * @param serie Número de serie del alfajor.
     */
    public Alfajor(int serie) {
        super(serie);
    }

    /**
     *
     * @return Retorna que se ha consumido un alfajor.
     */
    @Override
    public String consumir() {
        return "Alfajor";
    }

}
