package org.modelos;

public class Alfajor extends Dulce{
    /**
     *
     * @param serie
     */
    public Alfajor(int serie) {
        super(serie);
    }

    /**
     *
     * @return Retorna que se ha consumido un alfajor
     */
    @Override
    public String consumir() {
        return "Alfajor" + this.getSerie();
    }

}
