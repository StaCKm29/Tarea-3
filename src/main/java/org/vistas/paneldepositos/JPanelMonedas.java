package org.vistas.paneldepositos;
import org.modelos.Moneda;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Clase que representa el depósito de monedas ingresadas al expendedor
 */

public class JPanelMonedas extends JPanel {
    private ArrayList<Integer> monedas = new ArrayList<>();

    /**
     * Constructor de la clase
     */
    public JPanelMonedas(){
        setLayout(new FlowLayout(FlowLayout.CENTER, -25, 10));
        setOpaque(false);
    }

    /**
     * Método que añade una moneda al depósito de monedas de compras exitosas.
     * @param moneda Moneda que se añadirá al depósito de monedas.
     */
    public void AñadirMonedaGrafica(Moneda moneda){
        removeAll();
        monedas.add(moneda.getValor());
        Collections.sort(monedas);
        for(int i = 0 ; i < monedas.size() ; i++){
            JLabel label = new JLabel();
            ImageIcon icon = null;
            if(monedas.get(i) == 100){
                URL imagenURL = getClass().getClassLoader().getResource("moneda100.png");
                icon = new ImageIcon(new ImageIcon(imagenURL).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
            }
            else if(monedas.get(i) == 500){
                URL imagenURL = getClass().getClassLoader().getResource("moneda500.png");
                icon = new ImageIcon(new ImageIcon(imagenURL).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
            }
            else if(monedas.get(i) == 1000){
                URL imagenURL = getClass().getClassLoader().getResource("1000pesos.png");
                icon = new ImageIcon(new ImageIcon(imagenURL).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
            }
            else if(monedas.get(i) == 2000){
                URL imagenURL = getClass().getClassLoader().getResource("2000pesos.png");
                icon = new ImageIcon(new ImageIcon(imagenURL).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
            }
            label.setIcon(icon);
            add(label);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
