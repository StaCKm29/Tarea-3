package org.modelos;

public class Moneda1500 extends Moneda{
    public Moneda1500(int serie){
        super(serie);
    }

    @Override
    public int getValor() {
        return 1500;
    }

}
