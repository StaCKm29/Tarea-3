package org.vistas;

import javax.swing.*;

public class PanelComprador extends JPanel{
    private JPanelSelect panel;
    private PanelBilletera monedero;

    public PanelComprador(){
        JPanelSelect panel = new JPanelSelect();
        PanelBilletera monedero = new PanelBilletera();

        add(panel);
        add(monedero);
    }
    public JPanelSelect getPanel(){
        return panel;
    }
    public PanelBilletera getMonedero(){
        return monedero;
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Container with Custom Panels");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        PanelComprador comprador = new PanelComprador();
        frame.add(comprador);

        frame.setVisible(true);
    }
}
