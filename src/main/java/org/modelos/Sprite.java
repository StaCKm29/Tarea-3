package org.modelos;

/**Cumple la función de representar una Sprite*/
public class Sprite extends  Bebida{
    /**
     * Constructor de la clase Sprite.
     * @param serie Serie de la Sprite.
     */
    public Sprite(int serie){
        super(serie);
    }

    /**
     * @return Retorna que se ha consumido una sprite
     */
    @Override
    public String consumir(){
        return "Sprite";
    }
}
