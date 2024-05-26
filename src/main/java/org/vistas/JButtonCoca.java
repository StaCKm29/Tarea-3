package org.vistas;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonCoca extends JRadioButton{
    public JButtonCoca() {
        super("Precio: $1200");
        
        URL urlCoca = getClass().getClassLoader().getResource("Coca-Cola.png");
        URL urlSeleccionado = getClass().getClassLoader().getResource("seleccionado.png");

        int ancho = 150;
        int alto = 170;
        ImageIcon iconCoca = new ImageIcon(new ImageIcon(urlCoca).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        ImageIcon iconSeleccionado = new ImageIcon(new ImageIcon(urlSeleccionado).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        this.setIcon(iconCoca);
        this.setSelectedIcon(iconSeleccionado);
    }
}
