package org.modelos;

/**Cumple la función de representar una Sprite*/
public class Sprite extends  Bebida{
    /**
     *
     * @param serie
     */
    public Sprite(int serie){
        super(serie);
    }

    /**
     *
     * @return Retorna que se ha consumido una sprite
     */
    public String consumir(){
        return "Sprite" + this.getSerie();
    }
}
