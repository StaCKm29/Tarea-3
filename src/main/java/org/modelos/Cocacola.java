package org.modelos;

/**Cumple la función de representar una cocacola. */
public class Cocacola extends Bebida{
    /**
     *
     * @param serie Número de serie de la cocacola.
     */
    public Cocacola(int serie){
        super(serie);
    }

    /**
     *
     * @return Retorna que se ha consumido una cocacola.
     */
    public String consumir(){
        return "CocaCola";
    }

}
