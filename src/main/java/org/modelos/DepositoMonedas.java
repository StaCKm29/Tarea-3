package org.modelos;

import java.util.ArrayList;
import java.util.Comparator;
public class DepositoMonedas extends Deposito {
    private ArrayList<Moneda> almacen;

    public DepositoMonedas() {
        super();
        almacen = new ArrayList<>();
    }

    public void ordenar() {
        almacen.sort(Comparator.comparingInt(Moneda::getValor));
    }

    //Este método no remueve la moneda del arraylist
    public Moneda getMonedaEspecifica(int i) {
        return almacen.get(i);
    }

}
