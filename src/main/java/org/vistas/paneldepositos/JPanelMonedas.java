package org.vistas.paneldepositos;
import org.modelos.Deposito;
import org.modelos.DepositoMonedas;
import org.modelos.Moneda;
import org.vistas.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * Clase que representa el depósito de monedas ingresadas al expendedor
 */

public class JPanelMonedas extends JPanel{
    //Arreglo que ordenará las monedas
    private DepositoMonedas monedaPagoTemp;
    private ImageMonedas monedaTemporal;
    /**
     * Constructor de la clase
     */
    public JPanelMonedas(DepositoMonedas monedaPagoTemp){
        this.monedaPagoTemp = monedaPagoTemp;
        setLayout(new GridLayout(10,10));
    }

    //Este método actualiza las monedas mostradas en pantalla en base al depósito de pago en expendedor
    public void graficarMonedas(){
        removeAll();
        for(int i = 0 ; i < monedaPagoTemp.size() ; i++){
            if(monedaPagoTemp.getMonedaEspecifica(i).getValor() == 100){
                add(new ImageMoneda100());
            }
            else if(monedaPagoTemp.getMonedaEspecifica(i).getValor() == 500){
                add(new ImageMoneda500());
            }
            else if(monedaPagoTemp.getMonedaEspecifica(i).getValor() == 1000){
                add(new ImageMoneda1000());
            }
            else if(monedaPagoTemp.getMonedaEspecifica(i).getValor() == 2000){
                add(new ImageMoneda2000());
            }
        }
    }

}
