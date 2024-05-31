package org.vistas.paneldepositos;
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
    private ArrayList<ImageMonedas> monedas = new ArrayList<ImageMonedas>();
    private ImageMonedas monedaTemporal;
    private JPanel[] espaciosGrilla = new JPanel[5];

    /**
     * Constructor de la clase
     */
    public JPanelMonedas(){
        setLayout(new GridLayout(1,5));
        for(int i = 0; i < 5; i++){
            espaciosGrilla[i] = new JPanel();
            espaciosGrilla[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            add(espaciosGrilla[i]);
        }
    }
    /**
     * Método que sirve para agregar una moneda al panel
     * @param moneda la moneda a agregar
     */
    public void agregarMoneda(ImageMonedas moneda){
        this.monedaTemporal = moneda;
        monedas.add(moneda);
        ordenarMonedas();
        actualizarMonedas();
    }
    /**
     * Método que sirve para retirar la última moneda ingresada
     * @return m la moneda que se retiró
     */
    public ImageMonedas retirarMoneda(){
        if(monedas.size() > 0){
            for(ImageMonedas m : monedas){
                if(m.getValor() == monedaTemporal.getValor()){
                    monedas.remove(m);
                    ordenarMonedas();
                    actualizarMonedas();
                    return m;
                }
            }
        }
        return null;
    }

    /**
     * Método que sirve para ordenar las monedas en el panel
     */
    public void ordenarMonedas(){
        monedas.sort(Comparator.comparingInt(ImageMonedas::getValor));
    }

    /*Metodo que actualiza las monedas en el panel*/
    public void actualizarMonedas(){
        for(JPanel panel : espaciosGrilla){
            panel.removeAll();
        }
        for(int i = 0; i < monedas.size(); i++){
            espaciosGrilla[i].add(monedas.get(i));
            add(espaciosGrilla[i]);
        }
        updateUI();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }


}
