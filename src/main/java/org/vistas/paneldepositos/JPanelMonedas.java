package org.vistas.paneldepositos;
import org.modelos.Deposito;
import org.modelos.Moneda;
import org.vistas.ImageMonedas;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * Clase que representa el depósito de monedas ingresadas al expendedor
 */

public class JPanelMonedas extends JPanel{
    //Arreglo que ordenará las monedas
    private Deposito<Moneda> monedaPagoTemp;
    private ImageMonedas monedaTemporal;
    /**
     * Constructor de la clase
     */
    public JPanelMonedas(Deposito<Moneda> monedaPagoTemp){
        this.monedaPagoTemp = monedaPagoTemp;
        setLayout(new GridLayout(10,10));
    }

    public void agregarMoneda(){
        this.monedaTemporal = moneda;
        monedas.add(moneda);
        ordenarMonedas();
        actualizarMonedas();
    }


    public void ordenarMonedas(){
        monedas.sort(Comparator.comparingInt(ImageMonedas::getValor));
    }

    public void actualizarMonedas(){
        removeAll();
        for(int i = 0; i < monedas.size(); i++){
            add(monedas.get(i));
        }
    }

    public void vaciar(){

    }


}
