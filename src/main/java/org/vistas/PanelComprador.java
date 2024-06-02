package org.vistas;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

/**
 * Clase que representa el panel del comprador
 */
public class PanelComprador extends JPanel{
    private JPanelSelect panel;
    private JPanelBilletera monedero;
    private JPanelCarro bolsillo;

    public PanelComprador() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        panel = new JPanelSelect();
        panel.setPreferredSize(new Dimension(600, 200));
        panel.setBorder(new LineBorder(Color.BLACK, 3));
        JPanel panelAjustado = new JPanel(new FlowLayout());
        panelAjustado.add(panel);

        monedero = new JPanelBilletera();
        monedero.setPreferredSize(new Dimension(500, 300));
        JPanel monederoAjustado = new JPanel(new FlowLayout());
        monederoAjustado.add(monedero);
        monederoAjustado.setOpaque(false);//Para que se vea el fondo de la ventana

        bolsillo = new JPanelCarro();
        bolsillo.setPreferredSize(new Dimension(100, 100));
        add(bolsillo);
        add(panelAjustado);
        add(monederoAjustado);

    }
    //Getters para que las otras clases de package vistas puedan acceder a estos elementos.
    public JPanelSelect getPanel(){
        return panel;
    }
    public JPanelBilletera getMonedero(){
        return monedero;
    }
    public JPanelCarro getBolsillo(){
        return bolsillo;
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
